import java.util.*;
/**
 * Created by Owner on 10/6/2016.
 */
public class Scheduler {

    Queue <Process> processes = new Clock<Process>();

    public Scheduler(Queue<Process> processes) {
        this.processes = processes;
    }

    public boolean run(){
        return false;
    }
}
