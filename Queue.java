public interface Queue <E>{
    boolean IsEmpty();
    int size ();
    void enqueue(E element);
    E dequeue ();
    E first ();
}
