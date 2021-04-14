package designpattern.singleton;

public class SingletonInnerStaticClass {

    private SingletonInnerStaticClass(){

    }

    private static class SingletonInstance{
        public static final  SingletonInnerStaticClass singletonInnerStaticClass = new SingletonInnerStaticClass();
    }

    public static  SingletonInnerStaticClass getInstance(){

        return SingletonInstance.singletonInnerStaticClass;
    }
}
