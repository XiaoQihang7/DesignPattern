package SortDemo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat[] a = {new Cat(3,3),new Cat(6,4),new Cat(4,7)};
        Dog[] d = {new Dog(2),new Dog(5),new Dog(8),new Dog(1)};
        Sorter sorter = new Sorter();
        sorter.sort(a);
        sorter.sort(d);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(d));
    }
}
