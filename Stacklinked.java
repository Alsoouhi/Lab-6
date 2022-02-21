public class Stacklinked <E> implements Stack<E> {

    Singl_Linked_list<E> list =new Singl_Linked_list <E>();


    @Override
    public boolean isEmpty() {
        return list.Isempty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void push(E element) {
    list.addfirst(element);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E top() {
        return list.first();
    }
}
