package SortDemo;

public class Cat {
    int height , weight ;
    public Cat(int weight , int height){
        this.weight = weight;
        this.height = height;
    }

    public int comparTo(Cat c){
        if (this.weight < c.weight) return -1;
        else if (this.weight > c.weight) return 1;
        else  return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
