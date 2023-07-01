package JdkProxy;

public class TestProxy implements SellTickets{

    @Override
    public void sell() {
        System.out.println("售票前核验身份...");
    }
}
