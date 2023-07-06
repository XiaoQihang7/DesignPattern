package classAdapter;

//类适配器（SD兼容TF）
//类适配器，基于继承，调用父类方法的方式实现适配器的功能
public class SDAdapterTF extends TFCardImpl implements SDCard {

    public String readSD() {
        System.out.println("adapter read tf card ");
        return readTF(); //双亲委派？类加载器？
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}