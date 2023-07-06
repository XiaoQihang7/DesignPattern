package classAdapter;

//测试类
/**
 * 类适配器模式违背了合成复用原则。类适配器是客户类有一个接口规范的情况下可用，反之不可用。
 * 合成复用原则是指：尽量先使用组合或者聚合等关联关系来实现，其次才考虑使用继承关系来实现。
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));

        System.out.println("------------");

        SDAdapterTF adapter = new SDAdapterTF();
        System.out.println(computer.readSD(adapter)); //传入一个适配器，适配器中调用了TF卡的方法
    }
}