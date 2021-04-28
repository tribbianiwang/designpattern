package designpattern.visitor;

public class Games implements Computer{
    @Override
    public void accept(Visitor visitors) {
        visitors.visit(this);
    }

    public void play(){
        System.out.println("play lol");
    }
}
