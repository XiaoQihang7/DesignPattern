package CompareDeme;

//import SortDemo.Dog; //里面的food为默认类型，只能在同一个包或当前类下可以使用

public class DogComparator implements CompareTor<Dog>{

    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.food > o2.food) return 1;
        else if(o1.food < o2.food) return-1;
        return 0;
    }
}
