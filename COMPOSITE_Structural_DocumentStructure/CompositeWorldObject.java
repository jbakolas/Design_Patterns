package DocumentStructure_Composite;

import java.util.LinkedList;

/**
 * Created by bakgi on 3/16/2016.
 */
public class CompositeWorldObject extends WorldObject {
    //can reference to other world objects = One to Many relationship from CompositeObject to World object
    private LinkedList<WorldObject> worldObjects = new LinkedList<WorldObject>();
    //declare the variable Name of String type
    private String Name;
    //constructor of the class
    public CompositeWorldObject(String Name){
        this.Name = Name;
    }
    //Delegate the print method to the referenced children
    @Override
    public void print(){
        System.out.println(Name);
        //for every worldObject in the list of the worldObjects delegate the print method
        for (WorldObject worldObject : worldObjects ){ worldObject.print(); }
    }
    public LinkedList<WorldObject> getWorldObjects(){
        return worldObjects;
    }
    public void setWorldObjects(LinkedList<WorldObject> worldObjects){
        this.worldObjects = worldObjects;
    }
    @Override
    public String getName(){
        return Name;
    }
}
