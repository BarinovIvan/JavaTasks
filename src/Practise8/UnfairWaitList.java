package Practise8;

public class UnfairWaitList<E> extends WaitList<E>{
    UnfairWaitList(){};

    @Override
    public boolean remove(E element) {
        return super.remove(element);
    }
    void moveToBack(E element){};
}
