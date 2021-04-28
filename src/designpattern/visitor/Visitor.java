package designpattern.visitor;

public interface Visitor {
    void visit(Games games);
    void visit(Photos photos);
}
