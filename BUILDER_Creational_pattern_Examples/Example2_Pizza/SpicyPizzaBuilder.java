package Builder_Creational_pattern.Example1_DataBases.Example2_Pizza;

/**
 * Created by bakgi on 7/31/2016.
 */
public class SpicyPizzaBuilder extends PizzaBuilder {
    public void buildSauce(){ pizza.setSauce("hot"); }
    public void buildDough(){ pizza.setDough("pan baked"); }
    public void buildTopping(){ pizza.setTopping("pepperoni + salami"); }
    public void execute(){
        System.out.println("Constructing a Spicy pizza : " +pizza.getDough()+" "+ pizza.getSauce()+" "+pizza.getTopping());
    }
}


