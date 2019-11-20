package be.ac.umons;

public class Marherita extends Pizza
{
    Marherita(String name)
    {
        super(name);
        Ingredient pates=new Ingredient();
        Ingredient saucetomate=new Ingredient();
        Ingredient fromage=new Ingredient();
        this.addIngredient(pates);
        this.addIngredient(saucetomate);
        this.addIngredient(fromage);
    }
}
