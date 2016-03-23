package Singleton1;

import java.io.Serializable;

/**
 * Created by ibakolas on 23/3/2016.
 */

//Create the class which implements the singleton pattern
public class SingletonObject implements Cloneable/* Cloneable <-- 4. Singleton and Early Initialization*/,Serializable {

    //create an object of SingleObject -
    private static SingletonObject singletonObjectinstance;

    private double value;

    //make the constructor private so that this class cannot be instantiated
    private SingletonObject(){}

    //Get the only object available - A static method can be invoked without the need for creating an instance of a class.
    //Static getSingletonObjectinstance() method, will be accessible globally which returns the singleton class object.
    //3. Singleton and Thread Safety - By using synchronized we have Thread Safety
    protected synchronized static SingletonObject getSingletonObjectinstance(){
        // Lazy initialization, creating object on first use
        if(singletonObjectinstance == null){
            /*3. synchronized methods are expensive and will have serious performance hit.
              We will change the getInstance() method not to check for synchronization, if instance is already created*/
            synchronized (SingletonObject.class){
                if(singletonObjectinstance == null){
                    System.out.println("getSingletonObjectinstance(): First time getSingletonObjectinstance was invoked!");
                    singletonObjectinstance = new SingletonObject();
                }
            }
        }else System.out.println("You are rying to create second time the same object");
        return singletonObjectinstance;
    }
    /* readResolve() method in our DemoSingleton class. This method will be invoked before the object is deserialized.
       Inside this method, we will call getInstance() method to ensure single instance of Singleton class is exist application wide.*/
    protected Object readResolve(){
        return getSingletonObjectinstance();
    }
    //4 - 5. Prevent cloning.
    /*Java has the ability to create a copy of object with similar attributes and state form original object.
      This concept in java is called cloning. To implement cloning, we have to implement java.lang.Cloneable interface
      and override clone() method from Object class. ** It is a good idea to prevent cloning in a singleton class. **
      To prevent cloning on singleton object, let us explicitly throw CloneNotSupportedException exception in clone() method.*/
    @Override
    public Object clone()throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
    protected void showMessage(){
        System.out.println("HELLO SINGLETON PATTERN");
    }
    public void setValue(double value){
        this.value = value;
    }
    public double getValue(){
        return value;
    }

}
