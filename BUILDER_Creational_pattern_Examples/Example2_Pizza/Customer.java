package Builder_Creational_pattern.Example1_DataBases.Example2_Pizza;

/**
 * Created by bakgi on 7/31/2016.
 */
public class Customer {
    public static void main(String[] args){
        Waiter waiter = new Waiter();

        PizzaBuilder hawaian = new HawaianPizzaBuilder();
        PizzaBuilder spicy = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder(hawaian);
        waiter.constructPizza();
        waiter.getPizza();
        
        waiter.setPizzaBuilder(spicy);
        waiter.constructPizza();
        waiter.getPizza();
    }

}
