package be.ac.umons;

public class Fruttidimare extends Pizza
{

    Fruttidimare()
    {
        super("Fruttidimare");
        addIngredient(new Dough());
        addIngredient(new TomatoSauce());
        addIngredient(new Cheese());
        addIngredient(new Seafood());
    }
}
