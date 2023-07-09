import java.util.ArrayList;
import java.util.List;

/***
 * 具体容器类，重写所有方法；
 */
public class StudentAggregateImpl implements StudentAggregate {
    private List<Student> list = new ArrayList<Student>(); // 学生列表

    @Override
    public void addStudent(Student student) {
        this.list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        this.list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}