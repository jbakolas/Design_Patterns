package Builder_Creational_pattern.Example1_DataBases;

/**
 * Created by bakgi on 7/18/2016.
 */
//Concrete class MongoDBQuery
public class MongoDBQuery implements Query {
    //class properties
    private String from;
    private String where;
    //setters for the class properties
    public void setFrom(String from){
        this.from = from;
    }
    public void setWhere(String where){
        this.where = where;
    }
    //execute implementation
    @Override
    public void execute(){
        System.out.println("Executing MongoDBQuery from : "+from+" where : "+where);
    }

}
