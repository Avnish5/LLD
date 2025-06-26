package z_c_30_iterator_design_pattern;

public interface Aggregate<T>{
    Iterator<T> createIterator();
}
