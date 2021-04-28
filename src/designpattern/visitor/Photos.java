package designpattern.visitor;

public class Photos implements Computer{
    @Override
    public void accept(Visitor visitors) {
        visitors.visit(this);
    }

    public void play(){
        System.out.println("watch scenery photo");
    }
}
