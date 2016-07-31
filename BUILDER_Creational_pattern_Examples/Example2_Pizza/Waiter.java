package Builder_Creational_pattern.Example1_DataBases.Example2_Pizza;

/**
 * Created by bakgi on 7/31/2016.
 */
//Director
public class Waiter {

    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder = pizzaBuilder;
    }
    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }
    public void constructPizza(){
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
        pizzaBuilder.execute();
    }
}
