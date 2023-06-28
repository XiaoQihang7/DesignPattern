package CompareDeme;

import SortDemo.Comparable;

public class Sorter<T>{

    /**
     * 采用冒泡排序:升序
     * 【这样一次只能比较一种类型的数据，代码的复用性就很低】
     *   使用接口+泛型解决，复用性问题
     * @param arr
     */
    public void sort (T[] arr,CompareTor<T> comparator) {
        for (int i =0 ; i<arr.length-1 ; i++){
            int minPos = i;
            for ( int j=i+1 ; j<arr.length; j++){
                minPos = comparator.compare(arr[j],arr[minPos])==-1 ? j : minPos;
            }
            swap(arr,i , minPos);
        }
    }

    private void swap(T[] arr, int i, int minPos) {
        T temp = arr[i];
        arr[i] = arr[minPos];
        arr[minPos] = temp;
    }
}
