package designpattern.singleton;

public class SingletonLazySync {
    
    private SingletonLazySync(){
        
    }
    
    private static SingletonLazySync singletonlazySyncInstance;
    
    public static synchronized SingletonLazySync getInstance(){
        try{
            Thread.sleep(10000);
        }catch (Exception e){
            
        }
        
        if(singletonlazySyncInstance==null){
            singletonlazySyncInstance = new SingletonLazySync();
        }
        
        return singletonlazySyncInstance;
        
    }
    
    
}
