package Singleton1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by ibakolas on 24/3/2016.
 */

/*The ability to inspect the code in the system and see object types is not reflection, but rather Type Introspection.
  Reflection is then the ability to make modifications at runtime by making use of introspection. */

//Reflection can be used to destroy all the above singleton implementationapproaches.
public class ReflectionToDestroySingletonImplementation {
    public static void main(String args[]){

        SingletonObject instanceOne = SingletonObject.getSingletonObjectinstance();
        SingletonObject instanceTwo = null;
        SingletonObject instanceThree = SingletonObject.getSingletonObjectinstance();
        try{
            Constructor[] constructors = SingletonObject.class.getDeclaredConstructors();
            for(Constructor constructor : constructors){
                constructor.setAccessible(true);
                instanceTwo = (SingletonObject)constructor.newInstance();
                System.out.println("The singleton pattern has exposed due to reflection!!");
                break;
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
        System.out.println(instanceThree.hashCode());

    }
}
