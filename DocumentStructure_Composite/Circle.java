package DocumentStructure_Composite;
/**
 * Created by bakgi on 3/16/2016.
 */
public class Circle extends WorldObject {

    private String Name;

    public Circle(String Name){
        this.Name = Name;
    }
    @Override
    public void print() {
        System.out.println(Name);
    }
    @Override
    public String getName(){
        return Name;
    }
}
