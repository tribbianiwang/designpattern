package designpattern.facade;

public class Projector {
    private Projector(){}
    private static Projector instance = new Projector();

    public static Projector getInstance() {

        return instance;
    }



    public void on(){
        System.out.println("打开投影仪");
    }

    public void off(){
        System.out.println("关闭投影仪");
    }

    public void focus(){
        System.out.println("投影仪对焦");
    }

}
