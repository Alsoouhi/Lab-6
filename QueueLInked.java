public class QueueLInked <E> implements Queue <E>{

    Singl_Linked_list<E> list=new Singl_Linked_list<>();


    @Override
    public boolean IsEmpty() {
        return list.Isempty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void enqueue(E element) {
        list.addlast(element);
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }

    @Override
    public E first() {
        return list.first();
    }
}
