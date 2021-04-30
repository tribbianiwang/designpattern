package designpattern.observer;

public class Test {
    public static void main(String[] args) {
        Observer observer = new RealObserver();
        Subject subject = new RealSubject();
        subject.addObserver(observer);
        subject.notifyObserver();
    }
}
