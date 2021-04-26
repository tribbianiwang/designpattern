package designpattern.template;

public abstract class SoyaMilk {


     public final void make(){
         select();
         if(customerWantCondiments()){
             add();
         }

         soak();
         beat();

     }

     public void select(){
         System.out.println("精选上好的黄豆");
     }

     public abstract void add();

     public void soak(){
         System.out.println("开始浸泡原材料");
     }

     public void beat(){
         System.out.println("开始打豆浆");
     }

     boolean customerWantCondiments(){
         return true;
     }
}
