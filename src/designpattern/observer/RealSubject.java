package designpattern.observer;

import java.util.ArrayList;

public class RealSubject implements Subject{
    ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
            for(int i=0;i<observers.size();i++){
                observers.get(i).update();
            }
    }
}
