package FactoryExample1;

/**
 * Created by ibakolas on 28/3/2016.
 */
public class SedanCar extends Car {

    public SedanCar(){
        super(CarType.SEDAN);
        construct();
    }
    @Override
    protected void construct() {
        System.out.println("Building sedan car");
        // add accessories
    }
}
