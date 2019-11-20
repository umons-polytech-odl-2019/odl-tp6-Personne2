package be.ac.umons;

public class Carbonara extends Pizza
{
    Carbonara(String name) {
        super(name);
        Ingredient pates=new Ingredient();
        Ingredient cremeblanche=new Ingredient();
        Ingredient fromage=new Ingredient();
        Ingredient jambon=new Ingredient();
        this.addIngredient(pates);
        this.addIngredient(cremeblanche);
        this.addIngredient(fromage);
        this.addIngredient(jambon);

    }
}
