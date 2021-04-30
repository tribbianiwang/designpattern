package designpattern.observer;

public class RealObserver implements Observer{
    @Override
    public void update() {
        System.out.println("接受到了通知");
    }
}
