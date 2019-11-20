package be.ac.umons;
import java.util.ArrayList;
import java.math.BigDecimal;
public class Pizza
{
    private String name;
    private BigDecimal price=BigDecimal.valueOf(0);
    private ArrayList<Ingredient>listIngredient;
    Pizza(String name)
    {

    };
    public String getName()
    {
        return name;
    };
    public BigDecimal getPrice()
    {
        return price;
    };
    public void setName(String n)
    {
        this.name=name;
    };
    public void setPrice(BigDecimal p)
    {
        this.price=price;
    };
    public ArrayList<Ingredient> getListIngredient()
    {
        return listIngredient;
    };
    public void addIngredient(Ingredient i)
    {
        listIngredient.add(i);
    };
    public String toString()
    {
        return (this.name+this.price.toString());
    }

}
