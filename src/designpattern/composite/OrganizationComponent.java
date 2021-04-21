package designpattern.composite;

public abstract class OrganizationComponent {

    private String name;
    private String description;

    public OrganizationComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract void print();


    protected  void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    protected  void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }
}
