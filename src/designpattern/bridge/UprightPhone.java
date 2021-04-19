package designpattern.bridge;

public class UprightPhone extends Phone{
    public UprightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        System.out.println("直立式手机");
        super.open();
    }

    @Override
    public void close() {
        System.out.println("直立式手机");
        super.close();
    }

    @Override
    public void call() {
        System.out.println("直立式手机");
        super.call();
    }
}
