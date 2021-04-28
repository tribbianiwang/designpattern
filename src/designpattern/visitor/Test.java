package designpattern.visitor;

public class Test {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        Games games = new Games();
        Photos photos = new Photos();
        objectStructure.add(games);
        objectStructure.add(photos);

        Zhangsan zhangsan = new Zhangsan();
        objectStructure.addAction(zhangsan);

    }
}
