package Builder_Creational_pattern.Example1_DataBases.Example2_Pizza;

/**
 * Created by bakgi on 7/31/2016.
 */
//Abstract builder
public abstract class PizzaBuilder {

    protected Pizza pizza;

    public Pizza getPizza(){
        return pizza;
    }
    public void createNewPizzaProduct(){
        pizza = new Pizza();
    }
    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
    public abstract void execute();
}
