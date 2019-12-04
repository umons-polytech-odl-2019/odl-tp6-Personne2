package be.ac.umons;

public class CarbonaraHut extends Carbonara // seul diff par rapport à la classe carbonara est l'ajout d'olive... on herite donc de la classe carbonara
{
    public CarbonaraHut()
    {
        super();  // on recupere le constructeur de la classe carbonara
        setName("CarbonaraHut");  // on utulise la fct setName de la classe pizza qui est héritée par carbonara dont on herite
        addIngredient(new Olive());  //utilisation de la fct addIngredient de la classe pizza dont herite la classe dont la classe CarbonaraHut herite ( carbonara)
    }
}