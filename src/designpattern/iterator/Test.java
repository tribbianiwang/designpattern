package designpattern.iterator;

public class Test {
    public static void main(String[] args) {
        NameResponsity nameResponsity = new NameResponsity();
        Iterator iter = nameResponsity.getIterator();
        while (iter.hasNext()){
            System.out.println("responsity:"+iter.next().toString());
        }

//        for(Iterator iter = nameResponsity.getIterator(); iter.hasNext();){
//            String name = (String)iter.next();
//            System.out.println("Name : " + name);
//        }
    }
}
