package designpattern.factory.simplefactory;

public abstract class Pizza {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void bake(){
        System.out.println(name+"is bake");
    }


    public void cut(){
        System.out.println(name+"is cut");
    }


    public void box(){
        System.out.println(name+"is box");
    }


}
