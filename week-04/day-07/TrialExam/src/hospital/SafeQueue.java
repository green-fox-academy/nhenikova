package hospital;
import java.util.ArrayList;
import java.util.List;

public class SafeQueue extends Queue {

    // It always returns the patient with the highest severity.
    // If there are more patients with the same severity you can pick one,
    // it is up to you which one is returned.
    @Override
    public Patient getNextPatient() {
        removeHealthyPatients();

        if (patients.isEmpty()){
            return null;
        }

        int highestSeverity = 0;

        // This one can still be simplified!!!
        // (there is no need for list)
        List<Patient> sickestPatients = new ArrayList<>();

        for (Patient patient : patients) {
            if (patient.getDiseaseSeverity() > highestSeverity){
                // I have found a sicker person that the ones stored before
                sickestPatients.clear();
                sickestPatients.add(patient);
                highestSeverity = patient.getDiseaseSeverity();
            } else if (patient.getDiseaseSeverity() == highestSeverity){
                // This one is just as sick than the sickest ones stored
                sickestPatients.add(patient);
            }
        }

        // Because I can remove any, I remove the first one
        return sickestPatients.get(0);
    }
}
