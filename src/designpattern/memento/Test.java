package designpattern.memento;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("state1");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state3");

        System.out.println("nowstate:"+originator.getState());
        System.out.println("savestate1:"+careTaker.get(0).getState());
        System.out.println("savestate2:"+careTaker.get(1).getState());

    }
}
