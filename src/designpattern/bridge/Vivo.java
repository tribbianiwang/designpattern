package designpattern.bridge;

public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("Vivo手机打开了");
    }

    @Override
    public void close() {
        System.out.println("Vivo手机关闭了");
    }

    @Override
    public void call() {
        System.out.println("Vivo手机开始打电话");
    }
}
