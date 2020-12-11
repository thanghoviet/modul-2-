
public class MyList<E> {
    final int DEFAULT_CAPACITY = 10;
    public Object[] elementList = new Object[DEFAULT_CAPACITY];
    int size = 0;

    public void myList() {

    }

    public Object[] getElementList() {
        return elementList;
    }

    public void myList(int capacity) {

    }

    public void add(int index, E element) {
        if (size > elementList.length){
            return;
        }
        for (int i = size; i < index ; i--) {
            elementList[size + 1] = elementList[size];
        }
        elementList[index] = element;
        size++;
    }

    public E remove(int index) {
        if (elementList.length - index + 1 >= 0)
            System.arraycopy(elementList, index + 1 + 1, elementList, index + 1, elementList.length - index + 1);
        size--;
        return (E) elementList[index];
    }
    public int size() {
//        if (size != elementList.length) {
//            E[] newData = (E[]) (new Object[size]);
//        }
        return size;
    }

    public MyList<E> clone() {
        MyList<E> cloneList = new MyList<>();

        for (int i = 0; i < elementList.length; i++) {
            cloneList.add(i, (E) elementList[i]);
        }

        return cloneList;
    }

    public int indexOf(E o) {
        for (int i = 0; i < elementList.length; i++) {
            if (o.equals(elementList[i]))
                return i;
        }
        return -1;
    }

    public boolean contains(E o) {
        return indexOf(o) != -1;
    }
    public boolean add(E e){
        if (e == null) return false;
        add(size,e);
        return true;
    }
    public void ensureCapacity(int minCapacity){
        if (minCapacity>elementList.length){
            return;
        }
        E[] newCapacity = (E[]) (new Object[minCapacity*2]);
    }
    public E get(int i){

        return (E) elementList[i];
    }
    public void clear(){
        MyList<E> clearList = new MyList<>();

        for (int i = size; i > size; i--) {
            clearList.remove(i);
        }

    }

}
