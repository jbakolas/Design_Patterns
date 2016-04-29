package FactoryExample1;

/**
 * Created by ibakolas on 28/3/2016.
 */
public class SmallCar extends Car {
    public SmallCar(){
        super(CarType.SMALL);
        construct();
    }
    @Override
    protected void construct() {
        System.out.println("Building small car");
        // add accessories
    }
}
