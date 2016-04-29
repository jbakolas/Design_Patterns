package DocumentStructure_Composite;
/**
 * Created by bakgi on 3/16/2016.
 */
// the class is abstract so the classes that extends this class have to implement the methods of the class
public abstract class WorldObject {
    //print the name of the world object
    public abstract void print();
    //get the name of the world object
    public abstract String getName();
}
