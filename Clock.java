import java.util.*;

/**
 * Created by Owner on 10/6/2016.
 */
public class Clock<Process> implements Queue<Process>{

    public static int quant;
    List<Process> processes = new LinkedList<Process>();

    public Clock() {
        quant = 10;
    }

    public static int getQuant() {
        return quant;
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
        Process process = (Process) o;
        processes.add(processes.size(),process);
        return true;
    }


    @Override
    public boolean remove(Object o) {
        Process process = (Process) o;
        return processes.remove(process);
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
        Process process = (Process) o;
        processes.add(process);
        return true;
    }

    @Override
    public Process remove() {
        return processes.remove(0);
    }

    @Override
    public Process poll() {
        return this.poll();
    }

    @Override
    public Process element() {
        return this.element();
    }

    @Override
    public Process peek() {
        return this.peek();
    }
}
