package be.ac.umons;

public class FactoryDominos extends AbstractFactory {  // idem que pour FactoryHut sauf que hut cree des objets de classes filles différentes
    private static FactoryDominos instance = null;
    public static FactoryDominos getFactory()
    {
        if (instance == null)
        {
            instance = new FactoryDominos();
        }
        return instance;
    }
    static int stock [] = {2,2,2,2};  // on cree une liste de int : on initialise les stocks à 2 pizza de chaque type
    public Pizza createPizza(String name)
    {
        if (name == "Prosciutto" && stock[0] > 0 )
        {  // on diminue le stock à chaque demande de la pizza et on verifie au préalable qu'il en reste
            stock[0] = stock [0] - 1;
            return new Prosciutto();  // on cree un nouvel element à chaque classe de pizza faites au point 2 c à dire qu'on cree une nouvelle pizza
        }
        else if (name == "FruttiDiMare"&& stock[1] > 0 )
        { //on accede à chaque element via son indice (le choix est arbitraire au depart vu que de toute façon le nombre de depart de chaque pizza est le même
            stock[1] = stock [1] - 1;
            return new Fruttidimare();   // on cree un nouvel objet à l'aide du constructeur de la classe Fruttidimare dont
        }
        else if (name == "Carbonara"&& stock[2] > 0 )
        {
            stock[2] = stock [2] - 1;
            return new Carbonara(); // on utilise le constructeur de la classe carbonara
        }
        else if (name == "Margheritta"&& stock[3] > 0 )
        {
            stock[3] = stock [3] - 1;
            return new Margherita();
        }
        else
            {
            return null;  // cas où on demande une pizza qui ne fait pas parti du choix proposé
        }
    };
}
