import java.util.*;

/**
 * Created by Owner on 10/6/2016.
 */
public class Clock<E> implements Queue<E>{

    public final int quant;
    List<Process> processes = new LinkedList<Process>();

    public Clock() {
        quant = 0;
    }

    @Override
    public int size() {
        return processes.size();
    }

    @Override
    public boolean isEmpty() {
        return processes.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return processes.contains(o);
    }

    @Override
    public Iterator iterator() {
        return processes.iterator();
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
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return processes.addAll(c);
    }

    @Override
    public void clear() {
        processes.clear();
    }

    @Override
    public boolean retainAll(Collection c) {
        return processes.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection c) {
        return processes.removeAll(c);
    }

    @Override
    public boolean containsAll(Collection c) {
        return processes.containsAll(c);
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }
}
