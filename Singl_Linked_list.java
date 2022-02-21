public class Singl_Linked_list <E>{
    private node<E>head =null;
    private node<E>tial=null;
    private int size=0;

    public Singl_Linked_list() {
    }

    public int size (){
        return size;
    }

    public boolean Isempty (){
        return size==0;
    }
    public E first (){
        if (Isempty()) return null;
        return head.getElement();
    }

    public E last (){
        if (Isempty()) return null;
        return tial.getElement();
    }

    public void addfirst (E ex){
        head=new node<>(ex,head);
        if (Isempty())
            tial=head;
        size++;
    }

    public void addlast (E ex){
        node<E> newest =new node<E>(ex,null);
        if (size==0)
            head=newest;
        else
            tial.setNext(newest);
        tial=tial.next;
        size++;
    }
    public E removeFirst (){
        if(Isempty())return null;
        E del=head.getElement();
        head=head.getNext();
        size--;
        if (size==0)
            tial=null;
        return del;
    }




    private static class node <E>{
        E element ;
        node<E> next ;

        public node(E element, node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public node<E> getNext() {
            return next;
        }

        public void setNext(node<E> next) {
            this.next = next;
        }

    }
}
