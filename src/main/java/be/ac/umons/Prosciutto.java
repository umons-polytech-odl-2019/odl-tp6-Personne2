package be.ac.umons;

public class Prosciutto extends Pizza
{
    Prosciutto()
    {
        super("Prosciutto");
        addIngredient(new Dough());
        addIngredient(new Cheese());
        addIngredient(new Ham());
    }
}
