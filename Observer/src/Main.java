import java.util.ArrayList;
import java.util.List;

/**
 * 面向对象的傻等
 * 加入观察者
 */
class Child {
    private boolean cry = false;
    //加入一个观察者
    private Dad dad = new Dad();
    //加入多个观察者
    private Dog dog = new Dog();
    private Mum mum = new Mum();
    private List<Observer> observerList = new ArrayList<Observer>();
    {
        observerList.add(dad);
        observerList.add(mum);
        observerList.add(dog);
    }
    public boolean isCry(){ return cry; };

    public void weakUp(){
        System.out.println("Waked Up! Crying wuwuwuwuwu...");
        cry=true;
        wakeUpEvent bed = new wakeUpEvent(System.currentTimeMillis(), "bed");
        for (Observer o :
                observerList) {
            o.actionOnWakeUp(bed);
        }

    }
}

/**
 * 观察者
 */
class Dad implements Observer {
    public void feed(){
        System.out.println("feed uuu...");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        feed();
    }
}
class Mum implements Observer{
    public void feed(){
        System.out.println("hug uuu...");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        feed();
    }
}
class Dog implements Observer {
    public void feed(){
        System.out.println("kickkick uuu...");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        feed();
    }
}

interface Observer{
    void actionOnWakeUp(wakeUpEvent event);
}

//事件类
class wakeUpEvent{
    long timestamp;
    String place;

    public wakeUpEvent(long timestamp,String place){
        this.timestamp = timestamp;
        this.place = place;
    }
}

/**
 * 观察者模式：事件源对象:被观察者 ， 观察者Observer ， Event事件
 */
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
//        while (!child.isCry()){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("observer");
//        }
        child.weakUp();
    }
}
