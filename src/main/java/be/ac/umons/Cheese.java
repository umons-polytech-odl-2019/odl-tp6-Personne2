package be.ac.umons;

public class Cheese extends Ingredient
{
    public Cheese()
    {
        super(App.ingredients.get("Cheese").getName(),App.ingredients.get("cheese").getPrice());  // on ajoute un objet à l'aide du constricteur de la classe dont herite via la methode get ( definie par defaut pour les maps) à l'aide des methodes getPrice et getname definie dans ingredient afin de pouvoir instancier les attributs privés
    }
    //Par Louis :
    /*public Cheese (){
    super ("Cheese", new BigDecimal(2.00));
    }*/
}
