package FactoryExample1;

/**
 * Created by ibakolas on 28/3/2016.
 */
public class LuxuryCar extends Car {

    public  LuxuryCar(){
        super(CarType.LUXURY);
        construct();
    }
    @Override
    protected void construct() {
        System.out.println("Building luxury car");
        // add accessories
    }
}
