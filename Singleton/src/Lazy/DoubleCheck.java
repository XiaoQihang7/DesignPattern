package Lazy;

import java.net.Socket;
import java.sql.Connection;

/**
 *双重检锁
 * 一种巧妙的方式实现懒汉式的单例模式
 * 但会出现问题，jvm运行时指令重排和Happens-before规则，极有可能出现instance实例化完成而conn、socket未初始化，引起空指针异常
 * 加volatile解决
 */
public class DoubleCheck {
    Connection conn;
    Socket socket;
    private DoubleCheck(){
//        conn = ...
    }

    private static volatile DoubleCheck instance = null ;

    public DoubleCheck getInstance(){
        if (null == instance){
            synchronized (this){
                if (null == instance) {
                   return instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
