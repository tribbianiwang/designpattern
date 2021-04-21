package designpattern.composite;

public class Department extends OrganizationComponent{
    public Department(String name, String description) {
        super(name, description);
    }



    @Override
    public void print() {
        System.out.println("name:"+getName()+"descriptin:"+getDescription());

    }
}
