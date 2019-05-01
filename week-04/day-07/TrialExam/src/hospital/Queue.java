package hospital;
import java.util.ArrayList;
import java.util.List;

public abstract class Queue {
    protected List<Patient> patients = new ArrayList<>();

    public void addPatient(Patient newPatient){
        patients.add(newPatient);
    }

    // I have moved this here so that all children can reach it
    // because both of them need it
    public void removeHealthyPatients(){
        List<Patient> healthyPatients = new ArrayList<>();

        // Collect all the healthy patients:
        for (Patient patient: patients) {
            if (patient.getDiseaseSeverity() == 0){
                healthyPatients.add(patient);
            }
        }

        // Remove all healthy patients from the original list
        for (Patient healthyOne: healthyPatients) {
            patients.remove(healthyOne);
        }
    }

    public abstract Patient getNextPatient();

    // For manual testing only
    // Not required for the exam
    // public void showStatus(){
    //    for (Patient patient: patients) {
    //        System.out.println(patient.getDiseaseSeverity());
    //    }
    //
    //    System.out.println();
    // }
}