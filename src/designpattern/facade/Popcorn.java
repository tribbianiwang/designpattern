package designpattern.facade;

public class Popcorn {
    private Popcorn(){

    }

    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("打开爆米花机");
    }

    public void off(){
        System.out.println("关闭爆米花机");

    }

    public void pop(){
        System.out.println("爆米花机开始做爆米花");
    }
}
