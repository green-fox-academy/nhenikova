package hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private Queue queue;

    public Hospital(Queue queue) {
        this.queue = queue;
    }

    public void addPatient(Patient newPatient){
        queue.addPatient(newPatient);
    }

    public void treatNextPatient(){
        queue.getNextPatient().treatPatient();

        // For manual testing only
        // Not required for the exam
        // queue.showStatus();
    }
}
