package Builder_Creational_pattern.Example1_DataBases;

/**
 * Created by bakgi on 7/18/2016.
 * Builder  (QueryBuilder)
 specifies an abstract interface for creating parts of a Product object
 */
public interface QueryBuilder {

    public void from(String from);
    public void where(String where);

    Query getQuery();
}
