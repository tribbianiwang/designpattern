package designpattern.singleton;

/**
 * 饿汉模式1
 */
public class SingletonHungryNormal {

    private SingletonHungryNormal(){}

    private static final SingletonHungryNormal singleAInstance = new SingletonHungryNormal();

    public static SingletonHungryNormal getInstance(){

        return singleAInstance;
    }


}
