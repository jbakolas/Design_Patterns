package Builder_Creational_pattern.Example1_DataBases;

import java.util.Scanner;

/**
 * Created by bakgi on 7/18/2016.
 */
public class Client {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        QueryBuildDirector director = new QueryBuildDirector();
        String from = "CLIENT table";
        String where = "CLIENT.name = john AND CLIENT.surename = Bakolas";

        System.out.println("Whats the type of you DB :");
        String choice = scanner.nextLine();
        switch (choice){
            case "MONGO" :
                QueryBuilder  builderMONGO = new MongoDBQueryBuilder();
                director.buildQuery(from,where,builderMONGO).execute();
                break;
            case "SQL" :
                QueryBuilder builderSQL = new SQLQueryBuilder();
                director.buildQuery(from,where,builderSQL).execute();
                break;
            case "NOSQL":
                QueryBuilder builderNoSQL = new NoSQLQueryBuilder();
                director.buildQuery(from,where,builderNoSQL).execute();
        }
    }
}
