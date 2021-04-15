package designpattern.singleton;

import designpattern.factory.simplefactory.OrderPizza;
import designpattern.factory.simplefactory.SimpleFactory;

public class TestPattern {




    public static void main(String[] args) {

//        //懒汉模式单例不安全测试
//        ExecutorService threadpool = Executors.newFixedThreadPool(20);
//
//        for(int i = 0 ; i <20 ; i++) {
//            threadpool.execute(new Runnable() {
//                public void run() {
//                    System.out.println(Thread.currentThread().getName()+":"+ SingletonInnerStaticClass.getInstance().hashCode());
//                }
//            });
//
//        //单例模式 枚举方式实现
//            SingletonEnum singletonEnum = SingletonEnum.SINGLETON_ENUM;
//            singletonEnum.sayOk();
//    }

        //工厂模式
        OrderPizza orderPizza = new OrderPizza(new SimpleFactory());
//        orderPizza.startOrderPizza();

//        orderPizza.setSimpleFactory(new SimpleFactory());
        orderPizza.startOrderPizza();


    }



}
