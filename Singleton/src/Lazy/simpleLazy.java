package Lazy;

/**
 * 直观的懒汉模式
 * 是有问题的，比如说在这里，如果在多线程的情况下，会出现不是单例的情况。
 * 需要加锁解决，但是加锁影响性能(同一时刻只有有一个线程访问)
 */
public class simpleLazy {
    private simpleLazy(){};

    private static simpleLazy instance = null ;

    public static synchronized simpleLazy getInstance() {
        if (null == instance){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return  instance = new simpleLazy();
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0 ; i<100 ; i++){
            new Thread(()-> System.out.println(simpleLazy.getInstance().hashCode())).start();
        }
    }
}
