package simpleFactory;

public class Main {
    public static void main(String[] args) {
        /**
         * 简单工厂模式
         * 方便产品的扩展
         */
        Moveable car = new CarFactory().create();
        Moveable plane = new Plane();
        car.run();
        plane.run();
    }
}
