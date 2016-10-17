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
        int quant = Clock.getQuant();
        while (!processes.isEmpty()) {
            Process process = processes.remove();
            try {
                    process.run(quant);
                    if (process.getTimeToRun()>0) { // process hasn't finished add it to the end of the list
                        processes.add(process);
                    }
                    else {
                        System.out.println(processes.size());   // process has finished. Keeps track
                                                                // of process being finished and prints them
                    }
            } catch (TerminatedProcessException e) {

            }

        }
        return processes.isEmpty();
    }
}
