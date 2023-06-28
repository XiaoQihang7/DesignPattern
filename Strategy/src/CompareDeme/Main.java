package CompareDeme;

import java.util.Arrays;

/**
 * 策略模式，可以让一种问题得到多种处理策略
 *定制排序较自然排序可扩展性更好
 */
public class Main {
    public static void main(String[] args) {
        Cat[] a = {new Cat(3,3),new Cat(6,4),new Cat(4,7)};
        Dog[] d = {new Dog(2),new Dog(5),new Dog(8),new Dog(1)};

        Sorter<Dog> dogSorter = new Sorter<>();
        Sorter<Cat> catSorter = new Sorter<>();

        dogSorter.sort(d,new DogComparator());
        catSorter.sort(a,new CatComparator2());
        catSorter.sort(a,new CatComparator1());


        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(d));
    }
}
