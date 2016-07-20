package Builder_Creational_pattern.Example1_DataBases;

/**
 * Created by bakgi on 7/18/2016.
 * ConcreteBuilder  (MongoDBQueryBuilder)
 constructs and assembles parts of the product by implementing the Builder interface
 defines and keeps track of the representation it creates
 provides an interface for retrieving the product
 */
public class MongoDBQueryBuilder implements QueryBuilder {

    private  MongoDBQuery query = new MongoDBQuery();

    @Override
    public void from(String from){
        query.setFrom(from);
    }
    @Override
    public void where(String where){
        query.setWhere(where);
    }
    @Override
    public Query getQuery(){
        return query;
    }
}
