public class Main {
    public static void main(String[] args) {
        /**
         * 多态的运用
         * 可以做到任意定制交通工具；若要做到任意定制生成过程则就需要使用到简单工厂模式
         */
        Moveable car = new Car();
        Moveable plane = new Plane();
        Moveable broom = new Broom();
        car.run();
        plane.run();
        broom.run();
    }
}
