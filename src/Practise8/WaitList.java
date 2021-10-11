package Practise8;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    protected Queue<E> deque = new ConcurrentLinkedQueue<>();
    public WaitList(){}
    public WaitList(E element) {}
    public void add(E element) {}
    public boolean remove(E element) {return false;}
    public boolean contains(String E) {return false;}
    public boolean containsAll(ArrayList<String> Q) {return false;}
    public boolean isEmpty(){return false;};
}
