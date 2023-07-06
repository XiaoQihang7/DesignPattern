//摩拜单车Builder类，对产品进行组装（建造）
public class MobikeBuilder extends Builder {
    @Override
    public Builder buildFrame() {
        mBike.setFrame("铝合金车架");
        return this;
    }

    @Override
    public Builder buildSeat() {
        mBike.setSeat("真皮车座");
        return this;
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}