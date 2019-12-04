package be.ac.umons;

public class Olive extends Ingredient
{
    public Olive()
    {
        super(App.ingredients.get("Olive").getName(),App.ingredients.get("Olive").getPrice());
        //par Louis :
        /*public Olive (){
        super ("Olive", new BigDecimal(1.00));}
        */
    }
}
