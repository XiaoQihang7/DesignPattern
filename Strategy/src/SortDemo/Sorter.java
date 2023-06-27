package SortDemo;

public class Sorter {

    /**
     * 采用冒泡排序:升序
     * 这样一次只能比较一种类型的数据，代码的复用性就很低
     * @param arr
     */
    public void sort(Cat[] arr) {
        for (int i =0 ; i<arr.length-1 ; i++){
            int minPos = i;
            for ( int j=i+1 ; j<arr.length; j++){
                minPos = arr[j].comparTo(arr[minPos])==-1 ? j : minPos;
            }
            swap(arr,i , minPos);
        }
    }

    private void swap(Cat[] arr, int i, int minPos) {
        Cat temp = arr[i];
        arr[i] = arr[minPos];
        arr[minPos] = temp;
    }
}
