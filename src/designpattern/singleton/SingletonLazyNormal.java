package designpattern.singleton;

/**
 * 懒汉模式普通：线程不安全
 */
public class SingletonLazyNormal {

    private SingletonLazyNormal(){}

    private static SingletonLazyNormal singletonLazyNormalInstance;

    public static SingletonLazyNormal getSingletonInstance(){

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if(singletonLazyNormalInstance==null){
            singletonLazyNormalInstance = new SingletonLazyNormal();
        }
        return singletonLazyNormalInstance;
    }
}
