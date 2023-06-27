package Lazy;

public class Holder {
    //借助类加载的特点

//    private static Lazy.Holder instance = null ;
    private Holder (){};
    //使用静态内部类，仅加载一次实例

    private static class HolderD{
        private static final Holder instance = new Holder();
    }

    public static Holder getInstance(){
        return HolderD.instance;
    }

    public static void main(String[] args) {
        for (int i = 0 ; i<100 ; i++){
            new Thread(()-> System.out.println(Holder.getInstance().hashCode())).start();
        }
    }
}
