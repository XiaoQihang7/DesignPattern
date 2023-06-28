package CompareDeme;

import SortDemo.Comparable;

public class Dog implements Comparable<Dog> {
    int food;

    public Dog(int f){
        this.food = f;
    }
    @Override
    public int compareTo(Dog d) {
        if (this.food > d.food) return 1;
        else if (this.food < d.food) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
