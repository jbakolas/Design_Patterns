package Adapter2_without_Interface;

/**
 * Created by ibakolas on 22/3/2016.
 */
//the old --> ADAPTEE class
public class SquarePeg {
    private double width;
    public SquarePeg(double w){
        this.width = w;
    }
    public double getWidth(){
        return width;
    }
}
