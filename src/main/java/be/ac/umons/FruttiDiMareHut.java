package be.ac.umons;
// on cree des nouvelles classes pizza pour ajouter des olives à chaque pizza déjà existentes
// on herite donc de chaque classe pizza et on y ajoute le nouvel ingredient
public class FruttiDiMareHut extends Fruttidimare
{
    public FruttiDiMareHut() {
        super();
        setName("FruttiDiMareHut");
        addIngredient(new Olive()); // on ajoute le nouvel ingredient à l'aide la fct addingredient de la classe ingredient
    }
}
