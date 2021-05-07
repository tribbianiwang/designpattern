package designpattern.mediator;

public class Test {
    public static void main(String[] args) {
        User tom = new User("tom");
        tom.sendMessage("hello");

        User jerry = new User("jerry");
        jerry.sendMessage("hi");
    }
}
