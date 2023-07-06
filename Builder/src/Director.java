//指挥者类（装配）
public class Director {
    private Builder mBuilder;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    public Bike construct() {
        return mBuilder.buildFrame().buildSeat().createBike();
    }
}