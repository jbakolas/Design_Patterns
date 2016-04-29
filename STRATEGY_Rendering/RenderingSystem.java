package Rendering_StrategyDP;

import DocumentStructure_Composite.WorldObject;

/**
 * Created by bakgi on 3/16/2016.
 */
//Implementation of the class Rendering System in order to render the WorldObject tree from Composite previous solution
public class RenderingSystem {

    private WorldObjectRenderer renderer;

    public void setWorldObjectRender(WorldObjectRenderer renderer){
        this.renderer = renderer;
    }
    public void render(WorldObject object){
        renderer.render(object);
    }
}
