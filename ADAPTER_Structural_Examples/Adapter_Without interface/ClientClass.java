package Adapter2_without_Interface;

/**
 * Created by ibakolas on 22/3/2016.
 */
public class ClientClass {
    public static void main(String args[]){
        RoundHole roundHole = new RoundHole(5);
        SquarePegAdapter squarePegAdapter;
        for(int i=0; i < 10;i++){
            squarePegAdapter = new SquarePegAdapter((double) i);
            squarePegAdapter.makeFit(roundHole);
        }
    }
}
