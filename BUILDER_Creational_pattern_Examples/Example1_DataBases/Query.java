package Builder_Creational_pattern.Example1_DataBases;

/**
 * Created by bakgi on 7/18/2016.
 * Product  (Query)
 represents the complex object under construction. ConcreteBuilder builds the product's internal representation and defines the process by which it's assembled
 includes classes that define the constituent parts, including interfaces for assembling the parts into the final result
 */
public interface  Query  {
    void execute();
}
