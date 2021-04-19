package designpattern.adapter.interfacemode;

public class A {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void method1() {

                System.out.println("invoke method1");
            }
        };

        absAdapter.method1();
    }
}
