package be.ac.umons;

public class Dough extends Ingredient
{
    public Dough()
    {
        super(App.ingredients.get("Dough").getName(),App.ingredients.get("Dough").getPrice());
    }
    //ecrite différemment par Louis:
    /*
    *  public Dough (){
    * super ("Dough", new BigDecimal(3.00));
    }*/
}
