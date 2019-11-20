package be.ac.umons;

public class Fruttidimare extends Pizza
{

    Fruttidimare(String name) {
        super(name);
        Ingredient pates=new Ingredient();
        Ingredient saucetomate=new Ingredient();
        Ingredient fromage=new Ingredient();
        Ingredient fruitsdemer=new Ingredient();
        this.addIngredient(pates);
        this.addIngredient(saucetomate);
        this.addIngredient(fromage);
        this.addIngredient(fruitsdemer);
    }
}
