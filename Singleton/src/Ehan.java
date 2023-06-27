public final class Ehan {

    //饿汉式单例模式 ， 推荐使用 ；唯一瑕疵，这个对象无论是否使用都存在，占用空间
    private Ehan(){}; //关键步骤私有化构造方法

    private static final Ehan instance = new Ehan();

    public Ehan getInstance(){
        return instance;
    }
}
