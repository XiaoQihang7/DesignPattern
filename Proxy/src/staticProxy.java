import java.sql.SQLOutput;
import java.util.Random;

public class staticProxy {
    public static void main(String[] args) {
         new TankTimeProxy(
                 new TankLogProxy(
                         new Tank())).move();
    }
}

/**
 * 被代理类
 */
class Tank implements Movable{
    @Override
    public void move() {
        System.out.println("Tank moving calcalcla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class TankTimeProxy implements Movable{

    Movable object;

    public TankTimeProxy(Movable object) {
        this.object = object;
    }

    @Override
    public void move() {
        System.out.println("proxy before"+System.currentTimeMillis());
        try {
            Thread.sleep(new Random().nextInt(10000));
            object.move();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("proxy after"+System.currentTimeMillis());
    }
}
class TankLogProxy implements Movable{
    //聚合 , 比继承要好，但还远不够
//    Tank tank;


    Movable object;

    public TankLogProxy(Movable object) {
        this.object = object;
    }

    @Override
    public void move() {
        System.out.println("proxy Log before");
        object.move();
        System.out.println("proxy Log after");
    }
}

interface Movable {
    void move();
}
