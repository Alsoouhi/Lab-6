public class CircularLinkList <E>{
    private node<E>tial=null;
    private int size=0;


    public int size (){
        return size;
    }

    public boolean Isempty (){
        return size==0;
    }
    public E first (){
        if (Isempty()) return null;
        return tial.getNext().getElement();
    }

    public E last (){
        if (Isempty()) return null;
        return tial.getElement();
    }

    public void addfirst (E ex){
        if (Isempty()){
            tial=new node<>(ex,null);
            tial.next=tial;
        }
        else {
            node<E> newest =new node<E>(ex,tial.next);
            tial.setNext(newest);
        }
        size++;
    }

    public void addlast (E ex){
        /*node<E> newest =new node<E>(ex,null);
            tial.setNext(newest);
        tial=tial.next;*/
        addfirst(ex);
        tial=tial.getNext();
    }
    public E removeFirst (){
        if(Isempty())return null;
        node<E> x=tial.getNext();
        if (x==tial){
            tial=null;
        }
        else{
            tial.setNext(x.getNext());
        }
        size--;
        return x.getElement();
    }

    public void Rotate (){
        if(tial!=null)
            tial=tial.getNext();
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
