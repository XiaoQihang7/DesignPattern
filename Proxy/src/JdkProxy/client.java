package JdkProxy;

/**
 * 测试类
 * 为什么有了静态代理还需要动态代理？
 * - 因为静态代理是写死的一个类只能代理一种类型的对象，
 * 而想要实现多种代理多种类型，那么聚合的类只能是object，但这就是不规范的，不知道这个“object”类有什么方法
 *
 * 动态代理的作用是什么？
 * - 可以动态的去生成需要代理的对象，使一个类可以代理所有类型的对象
 */
public class client {
    public static void main(String[] args) {
        //获取代理对象
        ProxyFactory factory = new ProxyFactory();
        SellTickets proxyObject = factory.getProxyObject();
        proxyObject.sell();
    }
}
