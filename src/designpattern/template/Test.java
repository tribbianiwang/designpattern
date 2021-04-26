package designpattern.template;

public class Test {
    public static void main(String[] args) {
        SoyaMilk blackSoyaMilk = new BlackBeanSoyaMilk();
        blackSoyaMilk.make();

        SoyaMilk redSoyaMilk = new RedBeanSoyaMilk();
        redSoyaMilk.make();

        SoyaMilk originalSoyaMilk = new OriginalSoyaMilk();
        originalSoyaMilk.make();
    }
}
