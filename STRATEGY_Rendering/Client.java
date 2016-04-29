package Rendering_StrategyDP;

import DocumentStructure_Composite.CompositeWorldObject;

/**
 * Created by bakgi on 3/16/2016.
 */
public class Client {
    public static void  main(String[]args){

        CompositeWorldObject root = new CompositeWorldObject("root");

        RenderingSystem renderingSystem = new RenderingSystem();
        WorldObjectRenderer firstrenderer = new QuickRenderer();
        WorldObjectRenderer finalImagerenderer = new DetailedRendered();

        renderingSystem.setWorldObjectRender(firstrenderer);
        renderingSystem.render(root);

        renderingSystem.setWorldObjectRender(finalImagerenderer);
        renderingSystem.render(root);
    }
}
