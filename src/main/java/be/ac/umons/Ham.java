package be.ac.umons;

public class Ham extends Ingredient
{
    public Ham()
    {
        super(App.ingredients.get("Ham").getName(),App.ingredients.get("Ham").getPrice());
    }
    //ecrite diff par Louis :
    /*
    *  public Ham(){
    * super("Ham", new BigDecimal(2.00));}*/
}
