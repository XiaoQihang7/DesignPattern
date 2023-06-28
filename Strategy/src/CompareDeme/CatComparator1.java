package CompareDeme;


public class CatComparator1 implements CompareTor<Cat>{

    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.weight < o2.weight) return -1;
        else if (o1.weight > o2.weight) return 1;
        else  return 0;
    }
}
