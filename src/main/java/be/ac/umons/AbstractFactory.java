package be.ac.umons;

public abstract class AbstractFactory  //on cree une classe abstraite
{
    String name;
    public static AbstractFactory getFactory(String name)
    {
        if (name == "Dominos")
        {
            return new FactoryDominos();  // on cree ici un objet de la classe heritière de AbstractFactory
        }
        else if (name == "Hut")
        {
            return new FactoryHut();
        }
        else
            {
            return null;
        }
    }
    public abstract Pizza createPizza(String name);
}


