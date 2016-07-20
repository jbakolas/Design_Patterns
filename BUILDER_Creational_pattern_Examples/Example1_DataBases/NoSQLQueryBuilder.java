package Builder_Creational_pattern.Example1_DataBases;

/**
 * Created by bakgi on 7/19/2016.
 */
public class NoSQLQueryBuilder implements QueryBuilder {

    private NoSQLQuery noSqlQuery = new NoSQLQuery();

    @Override
    public void from(String from){
        noSqlQuery.setFrom(from);
    }
    @Override
     public void where(String where){
        noSqlQuery.setWhere(where);
    }
    @Override
    public Query getQuery(){
        return noSqlQuery;
    }
}
