package designpattern.flyweight;

public class Test {
    public static void main(String[] args) {

        WebsideFactory websideFactory = new WebsideFactory();
        WebSite newsWebside1 = websideFactory.getWebsideCategory("新闻");

        newsWebside1.use(new User("帕帕斯塔索普洛斯"));

        WebSite newsWebside2 = websideFactory.getWebsideCategory("新闻");
        newsWebside2.use(new User("格罗斯克罗伊茨"));

        WebSite sportsWebside = websideFactory.getWebsideCategory("体育");
        sportsWebside.use(new User("布瓦市奇科夫斯基"));


        System.out.println("News1："+newsWebside1.hashCode()+"news2:"+newsWebside2.hashCode()+"sports:"+sportsWebside.hashCode()+"factory-hashmap-size:"+websideFactory.getWebsideHashMapSize());
    }
}
