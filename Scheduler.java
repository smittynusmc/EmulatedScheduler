import java.util.*;
/**
 * Scheduler is a emulated process manager that handles the removal of the running process from the CPU (a list of process in this case)
 * The data structure for this scheduler is a Clock structure (First in First out queue
 * with a singly linked list round robin data structure with a quantum)
 * @author Adam Tucker
 * @version 10/14/2016.
 */
public class Scheduler {

    Queue <Process> processes = new Clock<Process>();

    /**
     * Constructor for class Scheduler
     * @param processes A queue of processes
     */
    public Scheduler(Queue<Process> processes) {
        this.processes = processes;
    }

    /**
     * Runs the process until all processes are complete
     * @return True of all the queue is empty i.e. all process have run or false otherwise
     */
    public boolean run(){
        int quant = Clock.getQuant(); // length of the time the process can run
        while (!processes.isEmpty()) { // loop until process remain
            Process process = processes.remove(); // get the first process
            try {
                    process.run(quant); // run the process
                    if (process.getTimeToRun()>0) { // process hasn't finished add it to the end of the queue
                        processes.add(process);// adds the process to the end of the queue
                    }
                    else {
                        System.out.println(processes.size());   // process has finished. Keeps track
                                                                // of the remaining processes by printing them instead of waiting
                                                                // for the process to finish.
                    }
            } catch (TerminatedProcessException e) {
                    // Do nothing unless because process has a runtime less then 0
            }

        }
        return processes.isEmpty();
    }
}
