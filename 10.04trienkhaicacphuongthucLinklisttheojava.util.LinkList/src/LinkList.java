import org.w3c.dom.Node;

public class LinkList<E> {
    Node head;
    int numNodes;

    public LinkList(Object data) {
        head = new Node(data);
    }

    public void LinkList() {
    }
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data) {
        add(numNodes, data);
    }

    public E remove(int index) {
        Node preTemp = head;
        for (int i = 0; i < index - 1; i++) {
            preTemp = preTemp.next;
        }

        Node delTemp = preTemp.next;
        Node afterTemp = preTemp.next.next;

        preTemp.next = afterTemp;
        numNodes--;
        return (E) delTemp;
    }

    public boolean remove(Object e) {
//        int index1 = 0;
        Node data = head;
        for (int i = 0; i < numNodes; i++) {
            if (e.equals(data)) {
                remove(i);
                return true;
            }
            data = data.next;
//            index1++;
        }
        return false;
    }
    public int size(){
        int size=0;
        for (int i = 0; i <numNodes ; i++) {
            size++;
        }
        return size;
    }
    public void clear(){
        for (int i = 0; i <numNodes ; i++) {
            remove(i);
        }
    }
    public LinkList<E> clone(){
        return this;
    }
    public int  indexOf(E o){
        Node data=head;
        for (int i = 0; i < numNodes; i++) {
            if (o.equals(data)) {
                return i;
            }
            data = data.next;
        }
        return -1;
    }
    public boolean contains(E a){
        return indexOf(a) != -1;
    }
    public boolean add(E o){
        if (o.equals(null)) return false;
    add(numNodes+1,o);
    return true;
    }
//    public void ensureCappacity(int  minCappacity){
//
//    }
    

}