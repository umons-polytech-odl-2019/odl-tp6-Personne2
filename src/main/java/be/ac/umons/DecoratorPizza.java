package be.ac.umons;

import java.math.BigDecimal;

public abstract class DecoratorPizza implements PizzaComponent // classe abstraitre qui vient implementer l'interface PizzaComponent
{ //c'est par cette classe qu'on va passer pour ajouter les caractéristiques de Pan ou cheesy à notre interface
    protected Pizza p;      // On crée un objet du type d'une classe ( Pizza ) qui vient implementer la même interface que celle qu'on implemente avec cette classe-ci. ( On a pas hérité de la classe Pizza ATTENTION )
    public abstract Pizza DecoratePizza(Pizza p);// constructeur par defaut déclaré
    @Override
    public BigDecimal getPrice ()
    {
        return p.getPrice();         // on appel la fct getprice qui est déclarée dans l'interface. cette fct est implementée par la classe Pizza
    }
    @Override
    public String getName (){
        return p.getName();        // on utilise la fct getname déclarée dans l'interface. Cette fct est implementée par la classe Pizza
    }
}
