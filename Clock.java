import java.util.*;

/**
 * Clock is a first in first out singly linked list round robin data structure with a quantum (a time limit for a process to run)
 * @author Adam Tucker
 * @version 10/14/2016.
 */
public class Clock<Process> implements Queue<Process>{


    public static int quant;
    int size=0;
    Node<Process> head;
    private Node<Process> ref; // A pointer for the data structure when needed to find a certain node

    /**
     * Constructor for class Clock
     */
    public Clock() {
        quant = 500000;
        this.head = new Node<Process>(null,null);
    }

    /**
     * Gets the quantum
     * @return The quantum for the round robin
     */
    public static int getQuant() {
        return quant;
    }

    /**
     * Returns the size of the list
     * @return The size
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Checks if the size is 0
     * @return True if empty or false otherwise
     */
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

    /**
     * Stub method
     * @param o
     * @return
     */
    @Override
    public boolean contains(Object o) {
        return true;
    }

    /**
     * Stub method
     * @return
     */
    @Override
    public Iterator iterator() {
        return null;
    }

    /**
     * Stub method
     * @return
     */
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    /**
     * Stub method
     * @param a
     * @return
     */
    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    /**
     * Process is added next to the head if empty or at the end if not.
     * @param value The value of to be added to the list
     * @return True if added false otherwise
     */
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

    /**
     * Stub method
     * @param o
     * @return
     */
    @Override
    public boolean remove(Object o) {
        return true;
    }

    /**
     * Stub method
     * @param c
     * @return
     */
    @Override
    public boolean addAll(Collection c) {
        return true;
    }

    /**
     * Stub method
     */
    @Override
    public void clear() {
    }

    /**
     * Stub method
     * @param c
     * @return
     */
    @Override
    public boolean retainAll(Collection c) {
        return true;
    }

    /**
     * Stub method
     * @param c
     * @return
     */
    @Override
    public boolean removeAll(Collection c) {
        return true;
    }

    /**
     * Stub method
     * @param c
     * @return
     */
    @Override
    public boolean containsAll(Collection c) {
        return true;
    }

    /**
     * Adds a node to the beginning of the list
     * @param value The value to be added
     * @return True
     */
    public boolean offer(Process value) {
            Node<Process> temp=new Node<Process>(value,head.next);   //added new parameter.
            head.next = temp;
            size++;
        return true;
    }

    /**
     * Removes the first item in the list
     * @return The Process to removed from the list
     */
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

    /**
     * Stub method
     * @return
     */
    @Override
    public Process poll() {
        return this.remove();
    }

    /**
     * Stub method
     * @return
     */
    @Override
    public Process element() {
        return get(0);
    }

    /**
     * Stub method
     * @return
     */
    @Override
    public Process peek() {
        return get(0);
    }

    /**
     * Returns the value at the index given
     * @param ndx The position in the list to get
     * @return The process needed
     */
    public Process get(int ndx){  //understood that ndx cannot be greater than size or negative
        setRef(ndx);
        return ref.value;
    }

    /**
     * Sets the reference node field
     * @param ndx The position in the list
     */
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
