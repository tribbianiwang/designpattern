package designpattern.flyweight;

import java.util.HashMap;

public class WebsideFactory {

    private HashMap<String,ConcreteWebsite> websiteHashMap = new HashMap<>();


    public WebSite getWebsideCategory(String type){
        if(websiteHashMap.get(type)==null){
            ConcreteWebsite concreteWebsite = new ConcreteWebsite(type);
            websiteHashMap.put(type,concreteWebsite);
            return concreteWebsite;
        }else{
            return websiteHashMap.get(type);
        }

    }


    public int getWebsideHashMapSize(){
        return websiteHashMap.size();
    }
}
