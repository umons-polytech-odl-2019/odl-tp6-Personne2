package be.ac.umons;

public class Mushroom extends Ingredient
{
    public Mushroom()
    {
        super(App.ingredients.get("Mushroom").getName(),App.ingredients.get("Mushroom").getPrice());
    }
    //Par Louis :
    /*public Mushroom(){
        super ("Mushroom",new BigDecimal(1.00));
    }*/
}
