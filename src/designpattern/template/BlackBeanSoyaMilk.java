package designpattern.template;

import designpattern.decorator.Soy;

public class BlackBeanSoyaMilk extends SoyaMilk {
    @Override
    public void add() {
        System.out.println("添加一些黑豆");
    }
}
