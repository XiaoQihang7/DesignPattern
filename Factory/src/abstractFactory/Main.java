package abstractFactory;

public class Main {
    /**
     * 抽象工厂方法
     * 方便产品族的扩展
     * @param args
     */
    public static void main(String[] args) {
        AbstractFactory m =new modernFactory();
        Food food = m.createFood();
        food.printName();
        magicFactory magicFactory = new magicFactory();
        magicFactory.createFood().printName();
    }
}
