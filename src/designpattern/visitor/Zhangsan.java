package designpattern.visitor;

public class Zhangsan implements Visitor{
    @Override
    public void visit(Games games) {
        games.play();
    }

    @Override
    public void visit(Photos photos) {
        photos.play();
    }
}
