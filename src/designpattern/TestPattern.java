package designpattern;

import designpattern.singleton.SingletonInnerStaticClass;
import designpattern.singleton.SingletonLazyDoubleCheck;
import designpattern.singleton.SingletonLazyNormal;
import designpattern.singleton.SingletonLazySync;

import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPattern {




    public static void main(String[] args) {

        //懒汉模式单例不安全测试
        ExecutorService threadpool = Executors.newFixedThreadPool(20);

        for(int i = 0 ; i <20 ; i++) {
            threadpool.execute(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName()+":"+ SingletonInnerStaticClass.getInstance().hashCode());
                }
            });


    }


    }



}
