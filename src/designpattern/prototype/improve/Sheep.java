package designpattern.prototype.improve;

public class Sheep implements Cloneable{

    private int age;
    private String name;
    private Sheep frind;
    private String address;

    public Sheep(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sheep getFrind() {
        return frind;
    }

    public void setFrind(Sheep frind) {
        this.frind = frind;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    @Override
    protected Object clone()   {
        Sheep sheep=null;
        try{
            sheep = (Sheep) super.clone();
        }catch (Exception e){
           System.out.println(e);
        }

        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", frind=" + frind +
                ", address='" + address + '\'' +
                '}';
    }
}
