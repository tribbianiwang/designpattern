package designpattern.visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {
    private List<Computer> computers = new LinkedList<Computer>();


    public void add(Computer computer){
        computers.add(computer);
    }


    public void addAction(Visitor visitor){
        for(int i=0;i<computers.size();i++){
            computers.get(i).accept(visitor);
        }
    }



}
