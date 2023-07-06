/**
 * 在包装类中的Integer就使用了享元模式，在cache数组中存储了-128~127的数值
 */
public class Client {
    static int a =10; //在new对象时，先初始化为0，然后赋值就有值了
    static{
        a+=1;
    }
    static { //可以有多个静态代码块，不可以出现在其中变量初始化之前
        a++;
    }
    int b; //new对象进来时，先从静态代码块开始，静态变量执行完了再进入这个类从头执行非静态成员的赋值
    {
        b++;
    }
    private static class testStatic{ //静态内部类只在调用的时候执行一次 , 由对象调用会出现警告，生成结果与类调用一致
        private final static Object o = new Object();
    }
    public static Object getObject() {
        return testStatic.o;
    }
    public static void main(String[] args) {
        System.out.println(a);
        BoxFactory instance = BoxFactory.getInstance();
        AbstractBox i = instance.getBox("I");
        i.display("黄色");
    }
    static { //可以有多个静态代码块，不可以出现在其中变量初始化之前，可以出现在其初始化之后的任意位置
        a++;
    }
}
class TestStatic{
    public static void main(String[] args) {
        Client client = new Client();
        System.out.println(Client.a);//12
        System.out.println(client.b);//1 ，非静态变量使不使用都会在new对象初始化静态变量后进行初始化
        Object object = Client.getObject();

        System.out.println(object);
        System.out.println(client.getObject());
        for (int i = 0 ; i<50; i++){
            System.out.println(Client.getObject() == object);
        }
    }
}
