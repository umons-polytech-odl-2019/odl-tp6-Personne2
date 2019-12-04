package be.ac.umons;

import java.math.BigDecimal;

public class Cheesy extends DecoratorPizza {   // comme pour la classe pan sauf qu'on ajoute le nom cheesy au lieu de pan et le prix est augmenté de 2 au lieu de 1.5
    public Cheesy ()
    {
        new BigDecimal(0.0);  // pourquoi créer une valeur nulle lors de la création d'un objet de la classe cheesy?
    }

    public Pizza DecoratePizza(Pizza p)
    {
        return null;
    }

    public String getName()
    {
        return ("Cheesy" + super.getName());
    };

    public BigDecimal getPrice()
    {
        p.getPrice();
        return super.getPrice().add(new BigDecimal(2.0)) ;
    };

    public void setName (String n ){};

    public void setPrice(BigDecimal p){};
}