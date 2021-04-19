package designpattern.bridge;

public class Xiaomi implements Brand{
    @Override
    public void open() {
        System.out.println("小米手机打开了");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机了");
    }

    @Override
    public void call() {
        System.out.println("小米手机开始打电话");
    }
}
