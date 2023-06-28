package simpleFactory;

/**
 * 简单工厂模式 (可扩展性不好，每新增一个东西就需要再加一些代码且写死)
 * 可以对每一种类型的对象构建一个工厂XXXFactory
 */
public class VehicleFactory {
    public Car createCar(){
        //before processing
        return new Car();
    }
    public Plane createPlane(){
        return new Plane();
    }
}
