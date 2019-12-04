package be.ac.umons;

import java.math.BigDecimal;

public class Pan extends DecoratorPizza   // on herite de la classe abstraite DecorateurPizza
{
    public Pan()
    {

    }

    public Pizza DecoratePizza(Pizza p)
    {
        return null;           // utile en quoi?
    }

    public String getName()
    {
        return ("Pan" + super.getName()); //on hérite du nom de la pizza qui est dans la classe DecorateurPizza et on lui ajoute Pan devant
    };

    public BigDecimal getPrice()
    {
        p.getPrice(); // on utilise la fct getPrice de la classe pizza via l'attribut crée dans la classe abstraite DecoratorPizza
        return super.getPrice().add(new BigDecimal(1.50)) ; // on herite du prix de la pizza de la classe Decorateur pizza et on l'augmente de 1.5 euros
    };

    public void setName (String n ){};// utile en quoi?

    public void setPrice(BigDecimal p){}; // utile en quoi?
}