package Builder_Creational_pattern.Example1_DataBases;

/**
 * Created by bakgi on 7/19/2016.
 */
public class NoSQLQuery implements Query {

    private String from;
    private String where;

    public void setFrom(String from){
        this.from = from;
    }
    public void setWhere(String where){
        this.where =where;
    }
    @Override
    public void execute(){
        System.out.println("Executing NoSQL Query from : "+from+" where : "+where);
    }
}
