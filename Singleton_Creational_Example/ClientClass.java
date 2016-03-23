package Singleton1;

/**
 * Created by ibakolas on 23/3/2016.
 */
public class ClientClass {
    public static void main(String args[]){
        //Get the only object available
        SingletonObject object = SingletonObject.getSingletonObjectinstance();
        //show the message
        object.showMessage();
        object.setValue(12.3);
        object.showMessage();
        System.out.println(object.getValue());
        SingletonObject object1 = SingletonObject.getSingletonObjectinstance();
        object1.showMessage();


    }
}
