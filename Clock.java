import java.util.*;

/**
 * Created by Owner on 10/6/2016.
 */
public class Clock<Process> implements Queue<Process>{


    public static int quant;
    int size=0;
    Node<Process> head;
    private Node<Process> ref;


    public Clock() {
        quant = 500000;
        this.head = new Node<Process>(null,null);
    }

    public static int getQuant() {
        return quant;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty()
    {
        boolean result = false;
        if (size==0)
        {
            result = true;
        }
        return result;
    }

    @Override
    public boolean contains(Object o) {
        return true;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Process value){
            boolean result = false;
            Node<Process> temp=new Node<Process>(value, null);   //added new parameter.
            if (head.next==null) {
                head.next = temp;
                size++;
                result = true;
            }
            else {
                setRef(size);
                ref.next = temp;
                size++;
                result = true;
            }
            return result;
    }



    @Override
    public boolean remove(Object o) {
        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        return true;
    }

    @Override
    public void clear() {
    }

    @Override
    public boolean retainAll(Collection c) {
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {
        return true;
    }

    @Override
    public boolean containsAll(Collection c) {
        return true;
    }

    public boolean offer(Process value) {
            Node<Process> temp=new Node<Process>(value,head.next);   //added new parameter.
            head.next = temp;
            size++;
        return true;
    }

    @Override
    public Process remove ()
    {
        Process process = null;
        if (!(head.next==null)) {
            setRef(1);
            head.next = ref.next;
            ref.next = null;
            size--;
            process = ref.value;
        }
        return process;
    }

    @Override
    public Process poll() {
        return this.remove();
    }

    @Override
    public Process element() {
        return get(0);
    }

    @Override
    public Process peek() {
        return get(0);
    }

    public Process get(int ndx){  //understood that ndx cannot be greater than size or negative
        setRef(ndx);
        return ref.value;
    }

    private void setRef(int ndx)
    {
        ref = head;
        for (int i = 0; i < ndx; i++) {
            if (ref.next != null) {
                ref = ref.next;
            }
        }
    }
}
