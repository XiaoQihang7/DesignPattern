//测试访问类
/**
 * 浅克隆
 */
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation c1 = new Citation();
//        c1.setName("张三");
        Student stu1 = new Student("小航","宇宙混沌初");
        c1.setStu(stu1);
        //复制奖状
        Citation c2 = c1.clone();
//        Student stu2 = new Student("小茜","宇宙混沌初");
//        c2.setStu(stu2);
        System.out.println(c1 == c2);
        //将奖状的名字修改李四
        c2.getStu().setName("李四");
//        c2.setName("李四");
        c1.show();
        c2.show();
    }
}