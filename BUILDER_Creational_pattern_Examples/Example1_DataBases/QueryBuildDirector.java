package Builder_Creational_pattern.Example1_DataBases;

/**
 * Created by bakgi on 7/18/2016.
 * Director  (QueryBuildDirector)
 constructs an object using the Builder interface
 */
public class QueryBuildDirector {
    public Query buildQuery(String from,String where, QueryBuilder builder){
        builder.from(from);
        builder.where(where);
        return builder.getQuery();
    }
}
