//ofo单车Builder类
public class OfoBuilder extends Builder {

    @Override
    public Builder buildFrame() {
        mBike.setFrame("碳钎维骨架");
        return this;
    }

    @Override
    public Builder buildSeat() {
        mBike.setSeat("纯棉大座垫");
        return this;
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}