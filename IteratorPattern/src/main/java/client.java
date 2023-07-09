import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class client {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("张三", 12));
        students.add(new Student("张四", 13));
        students.add(new Student("张五", 14));
        Iterator<Student> iterator = students.iterator();
        Iterator<Student> iterator1 = students.iterator();
        System.out.println("我是迭代器一号");
        students.add(new Student("小猪",11));//modCount++
        students.remove(new Student("小猪",11)); //不会删除因为与上一个存储的值不是同一个地址。所以不会modCount++
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("我是迭代器二号");
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }


        StudentAggregateImpl studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(new Student("张三", 12));
        studentAggregate.addStudent(new Student("张四", 13));
        studentAggregate.addStudent(new Student("张五", 14));
        StudentIterator studentIterator = studentAggregate.getStudentIterator();

        StudentAggregateImpl studentAggregate1 = new StudentAggregateImpl();
        studentAggregate1.addStudent(new Student("张三", 12));
        studentAggregate1.addStudent(new Student("张四", 13));
        studentAggregate1.addStudent(new Student("张五", 14));
        StudentIterator studentIterator1 = studentAggregate1.getStudentIterator();

        System.out.println("我是遍历机一号");
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        }

        System.out.println("我是遍历机二号");
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        }
        if (!studentIterator.hasNext()) {
            System.out.println("没有数据了");
            System.out.println(studentIterator.next());
        }

        System.out.println("三号");
        while (studentIterator1.hasNext()) {
            System.out.println(studentIterator1.next());
        }
        studentIterator1.next(); //null

    }
}
