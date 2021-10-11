package Practise8;

import java.util.ArrayList;

public interface IWaitList<E> {
    public void add(E element);
    boolean remove(E element);
    boolean contains(String E);
    boolean containsAll(ArrayList<String> Q);
    boolean isEmpty();

}
