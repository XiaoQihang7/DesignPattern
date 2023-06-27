package enumerate;

public enum singleton {

    /**
     * 利用枚举特性 ， 实现完美单例
     * 枚举类型不允许被继承，同样是线程安全的且只能被实例化一次，
     * 但是枚举类型不能够懒加载，对singleton主动使用，比如调用其中的静态方法则INSTANCE会立即得到实例化
     */
    INSTANCE;
    singleton(){
        System.out.println("INSTANCE WILL BE INITIALIZED IMMEDIATEDLY");
    }
    public static void method(){}; //调用此方法会主动使用singleton，INSTANCE将会被实例化

    public static singleton getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
//        method();
        System.out.println(getInstance());
//        System.out.println("-------------------------------------------------------------------------------");
    }
}
