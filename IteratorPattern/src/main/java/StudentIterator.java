/**
 * 迭代器接口
 * 提供一个对象来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。
 */
public interface StudentIterator {
    boolean hasNext();

    Student next();
}