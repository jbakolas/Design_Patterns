package Adapter2_without_Interface;

/**
 * Created by ibakolas on 22/3/2016.
 */
//The new --> TARGET class
public class RoundHole {

    private int radious;

    public RoundHole(int r){
        this.radious = r;
        System.out.println("RoundHole : max SquarePeg is :"+ r * Math.sqrt(2));
    }
    public int getRadious(){
        return radious;
    }
}
