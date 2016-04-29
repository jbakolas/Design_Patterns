package Adapter3;

/**
 * Created by ibakolas on 22/3/2016.
 */
//Adapter
public class AdapterLegacyRectangle extends Rectangle {

    private LegacyRectangly legacyRectangly;

    public AdapterLegacyRectangle(LegacyRectangly legacyRectangly){
        this.legacyRectangly = legacyRectangly;
    }

    @Override
    public Integer determineSize(){
        return legacyRectangly.calculation();
    }
}
