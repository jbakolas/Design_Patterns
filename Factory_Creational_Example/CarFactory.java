package FactoryExample1;

/**
 * Created by ibakolas on 28/3/2016.
 */
public class CarFactory {

    public static Car buildCar(CarType model){
        Car car = null;
        switch (model){
            case SMALL:
                car = new SmallCar();
                break;
            case SEDAN:
                car = new SedanCar();
                break;
            case LUXURY:
                car = new LuxuryCar();
                break;
            default:
                break;
        }
        return car;
    }
}
