package Singleton1;

import java.io.*;

/**
 * Created by ibakolas on 23/3/2016.
 */
public class SerializationTestSingleton {
    public static void main(String args[]){

        //getting singleton instance
        SingletonObject object = SingletonObject.getSingletonObjectinstance();
        object.setValue(10);

        try {
            // Serialize to a file
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("File.txt"));
            out.writeObject(object);
            out.close();

            object.setValue(20);

            SingletonObject object3 = SingletonObject.getSingletonObjectinstance();
            object3.setValue(30);

            // Serialize to a file
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("File.txt"));
            SingletonObject object2 = (SingletonObject) in.readObject();
            in.close();

            System.out.println("Instance One Value= " + object.getValue());
            System.out.println("Instance Two Value= " + object2.getValue());
            System.out.println("Instance three Value= " + object3.getValue());


        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
