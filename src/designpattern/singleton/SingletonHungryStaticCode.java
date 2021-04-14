package designpattern.singleton;

/**
 * 饿汉模式 静态代码块初始化
 */
public class SingletonHungryStaticCode {

    private SingletonHungryStaticCode(){

    }

    private static SingletonHungryStaticCode singletonBInstance;

    static {
        singletonBInstance = new SingletonHungryStaticCode();
    }

    public static SingletonHungryStaticCode getSingleBInstance(){

        return singletonBInstance;
    }


}
