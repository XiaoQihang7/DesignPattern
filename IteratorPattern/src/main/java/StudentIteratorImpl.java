import java.util.List;

/**
 * 迭代器的具体实现(虚假的迭代器，很显然这个迭代器对比于集合中的迭代器简直就是玩具中的玩具弟 )
 */
public class StudentIteratorImpl implements StudentIterator {
    private List<Student> list;
    private int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        if (position>=list.size()){
            return null;
        }
        Student currentStudent = list.get(position);
        position++;
        return currentStudent;
    }
}