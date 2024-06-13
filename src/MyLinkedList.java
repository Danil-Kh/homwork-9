public class MyLinkedList <T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void add(T element){
        Node<T> newNode = new Node<>(element);
        if (head == null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    public int size(){
        return size;
    }
    public T get(int index){
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }
    public void remove(int index){
        Node<T> current = head;
        for (int i = 0; i < index ; i++) {
            current = current.next;
        }
        current.next.prev = current.prev;
        current.prev.next =current.next;
        size--;

    }
    public void clear(){

        size = 0;
       head = null;

    }

    static class Node<T>{
        T element;

        Node<T> next;
        Node<T> prev;
        public Node(T element){
            this.element = element;

        }

    }

}
