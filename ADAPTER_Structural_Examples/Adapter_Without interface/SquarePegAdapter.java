package Adapter2_without_Interface;

/**
 * Created by ibakolas on 22/3/2016.
 */
// Adapter class
public class SquarePegAdapter {

    private SquarePeg squarePeg;

    public SquarePegAdapter(double w){
        squarePeg = new SquarePeg(w);
    }

    public void makeFit(RoundHole roundHole){
        double amount = squarePeg.getWidth() - roundHole.getRadious() * Math.sqrt(2);
        System.out.println("Reducing the SquarePeg "+squarePeg.getWidth()+" by "+((amount < 0) ? 0 : amount)+ " amount.");
        if(amount > 0){
            System.out.println(" Width is now : "+ (new SquarePeg(squarePeg.getWidth() - amount).getWidth()));
        }
    }
}
