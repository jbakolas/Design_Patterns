package Adapter3;

/**
 * Created by ibakolas on 22/3/2016.
 */
//Client
public class Client {
    public static void main(String []args){

        Client client = new Client();

        LegacyRectangly legacyRectangly = new LegacyRectangly();

        AdapterLegacyRectangle adapterLegacyRectangle = new AdapterLegacyRectangle(legacyRectangly);

        client.calculateRectangleSize(adapterLegacyRectangle);
    }
    public void calculateRectangleSize(Rectangle rectangle){
        System.out.println("Rectangle size :"+ rectangle.determineSize());
    }
}
