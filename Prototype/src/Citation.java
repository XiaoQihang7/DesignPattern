import java.io.Serializable;

/**奖状类
 * 具体原型类，实现Cloneable接口
 * 浅克隆：在浅克隆中，如果源对象的成员变量是值类型，将复制一份给克隆对象；
 *如果源对象的成员变量是引用类型，则将引用对象的地址复制一份给目标对象，
 *也就是说源对象和目标对象的成员变量指向相同的内存地址。
 *简言之，浅克隆，当对象被复制时只复制它本身和其中包含的值类型的成员变量，而引用类型的成员对象并没有复制。
 *
 */

/**
 * 在深克隆中，无论源对象的成员变量是值类型还是引用类型，都将复制一份给目标对象，
 *  深克隆将源对象的所有引用对象也复制一份给目标对象。
 * 简言之，深克隆，除了对象本身被复制外，对象所包含的所有成员变量也将复制。
 */
public class Citation implements Cloneable , Serializable {
//    private String name;
    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

//    String name = getStu().getName();//空指针异常getstu()为null

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return (this.name);
//    }

    public void show() {
        System.out.println(getStu().getName() + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}