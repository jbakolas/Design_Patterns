package DocumentStructure_Composite;

/**
 * Created by bakgi on 3/16/2016.
 */
public class Client {
    public static void  main(String[]args){

        CompositeWorldObject root = new CompositeWorldObject("root");// root is the document tree
        CompositeWorldObject house = new CompositeWorldObject("house"); // to build the house by using the circle and the square we have to composite them.So this is the house is the composision tof the 2 different objects

        Circle circle = new Circle("cirleobj_1");
        Square square = new Square("squareobj_1");

        Circle circle_ = new Circle("circleobj_2");
        Square square_ = new Square("squareobj_2");
        //link objects together
        root.getWorldObjects().add(house);
        root.getWorldObjects().add(circle);
        root.getWorldObjects().add(square);
        root.getWorldObjects().add(circle_);
        root.getWorldObjects().add(square_);

        //print the tree
        //root = compisite object and delegates the print method to the childrens
        root.print();

    }
}
