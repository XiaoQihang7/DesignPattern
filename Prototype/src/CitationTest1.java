import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *扩展为深克隆
 * 需要对象序列化
 */
public class CitationTest1 {
    public static void main(String[] args) throws Exception {
        Citation c1 = new Citation();
        Student stu = new Student("张三", "西安");
        c1.setStu(stu);
//创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new
                FileOutputStream("D:\\workspace_idea\\DesignPattern\\Prototype\\b.txt"));//需要对象序列化
//将c1对象写出到文件中
        oos.writeObject(c1);
        oos.close();
//创建对象出入流对象
        ObjectInputStream ois = new ObjectInputStream(new
                FileInputStream("D:\\workspace_idea\\DesignPattern\\Prototype\\b.txt"));
//读取对象
        Citation c2 = (Citation) ois.readObject();
//获取c2奖状所属学生对象
        Student stu1 = c2.getStu();
        stu1.setName("李四");
//判断stu对象和stu1对象是否是同一个对象
        System.out.println("stu和stu1是同一个对象？" + (stu == stu1));
        c1.show();
        c2.show();
    }
}