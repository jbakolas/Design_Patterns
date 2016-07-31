package Builder_Creational_pattern.Example1_DataBases.Example2_Pizza;

/**
 * Created by bakgi on 7/31/2016.
 */
///Concrete builder
public class HawaianPizzaBuilder extends PizzaBuilder {
    public void buildDough(){
        pizza.setDough("cross");
    }
    public void buildSauce(){
        pizza.setSauce("mild");
    }
    public void buildTopping(){
        pizza.setTopping("ham + cheese");
    }
    public void execute(){
        System.out.println("Constructing a Hawaian pizza : " +pizza.getDough()+" "+ pizza.getSauce()+" "+pizza.getTopping());
    }
}
