package designpattern.flyweight;

public class ConcreteWebsite extends WebSite{


    private String type;


    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("type:"+type+"user:"+user.getName());
    }
}
