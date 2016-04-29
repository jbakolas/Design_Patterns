package Rendering_StrategyDP;

import DocumentStructure_Composite.WorldObject;

/**
 * Created by bakgi on 3/16/2016.
 */
public class QuickRenderer implements WorldObjectRenderer {
    @Override
    public void render(WorldObject worldObject){
        System.out.println("I am rendering with the QUICK renderer");
    }
}
