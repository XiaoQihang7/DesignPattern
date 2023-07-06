// 抽象 builder 类
public abstract class Builder {
    protected Bike mBike = new Bike(); //父类中，创建一个复杂产品

    public abstract Builder buildFrame();

    public abstract Builder buildSeat();

    public abstract Bike createBike();

    //将指挥者类封装起来，简化系统结构，但同时也加重了抽象建造者类的职责，也不是太符合单一职责原则，
    //如果construct() 过于复杂，建议还是封装到 Director 中。
//    public Bike construct() {
//        this.buildFrame();
//        this.buildSeat();
//        return this.createBike();
//    }
}