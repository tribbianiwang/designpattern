package designpattern.memento;

import java.util.ArrayList;

public class CareTaker {
    private ArrayList<Memento> mementos = new ArrayList<>();

    public void add(Memento memento){
        mementos.add(memento);
    }

    public Memento get(int position){
        return mementos.get(position);
    }
}
