package simpleFactory;

/**
 * 简单工厂模式（可任意定制生成过程）
 */
public class CarFactory {
    public Moveable create(){
        //before processing
        System.out.println("a car created");
        return new Car();
    }
}
