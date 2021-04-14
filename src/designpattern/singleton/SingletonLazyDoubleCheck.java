package designpattern.singleton;

public class SingletonLazyDoubleCheck {

    private SingletonLazyDoubleCheck(){

    }

    private static volatile SingletonLazyDoubleCheck singletonLazyDoubleCheck;


    public static  SingletonLazyDoubleCheck getInstance(){

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        if(singletonLazyDoubleCheck==null){
            synchronized (SingletonLazyDoubleCheck.class){
                if(singletonLazyDoubleCheck==null){
                    singletonLazyDoubleCheck = new SingletonLazyDoubleCheck();
                }
            }
        }
        return singletonLazyDoubleCheck;
    }



}
