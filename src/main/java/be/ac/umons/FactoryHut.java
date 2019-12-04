package be.ac.umons;

public class FactoryHut extends AbstractFactory //creation d'une classe pour PizzaHut heritant d'une classe ABSTRAITE
{
    private static FactoryHut instance = null; // on initialise l'instance à zero (instance utilisé dans la classe DBSingleton
    private static FactoryHut getFactory()  //Creation d'une fonction permettant de recuperer le choix de la pizerria
    {
        if (instance == null) // condition pour la première demande de pizza
        {
            instance = new FactoryHut();// on cree un nouvel objet
        }
        return instance;
    }

    static int stock [] = {2,2,2,2};   // on initialise les stocks à 2 pizza de chaque type et STATIC pour qu'ils puissent diminuer UNIQUEMENT lors d'un appel de la classe

    public Pizza createPizza(String name)
    {
        if (name == "Prosciutto"&& stock[0] > 0 )  // on choisit arbitrairement chaque indice pour classer une pizza de chaque type
        {
            stock[0] = stock [0] - 1;  //ne pas oublier le diminuer le stock de pizza de ce type
            return new ProsciuttoHut();    // ne pas oublier de creer cette pizza après l'avoir sorti du stock
        }
        else if (name == "FruttiDiMare"&& stock[1] > 0 )
        {
            stock[1] = stock [1] - 1;
            return new FruttiDiMareHut();
        }
        else if (name == "Carbonara"&& stock[2] > 0 )  // verification du nom inscrit dans la commande ainsi que du stock disponible pour la pizza en question
        {
            stock[2] = stock [2] - 1;
            return new CarbonaraHut();
        }
        else if (name == "Margheritta"&& stock[3] > 0 )
        {
            stock[3] = stock [3] - 1;
            return new MargheritaHut();
        }
        else  // cas où on a plus de stock ou que la pizza demandé existe pas
            {
            return null;  // on renvoit donc aucune pizza
        }
    };

}