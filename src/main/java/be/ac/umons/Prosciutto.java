package be.ac.umons;

public class Prosciutto extends Pizza
{
    Prosciutto(String name) {
        super(name);
        Ingredient pates=new Ingredient();
        Ingredient saucetomate=new Ingredient();
        Ingredient fromage=new Ingredient();
        Ingredient jambon=new Ingredient();
        this.addIngredient(pates);
        this.addIngredient(saucetomate);
        this.addIngredient(fromage);
        this.addIngredient(jambon);
    }
}
