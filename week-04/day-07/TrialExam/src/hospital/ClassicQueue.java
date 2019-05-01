package hospital;

public class ClassicQueue extends Queue {

    private int lastTreatedIndex;

    // It should return always the next patient.
    // (You need to track who was the last treated patient.)
    // It should handle the cycles, so after the last patient it must return the first one again.
    @Override
    public Patient getNextPatient() {

        // I use this indexer to track the last student
        removeHealthyPatients();

        if (patients.isEmpty()){
            return null;
        }

        if (lastTreatedIndex < patients.size()){
            Patient nextPatient = patients.get(lastTreatedIndex);
            lastTreatedIndex++;
            return nextPatient;
        } else {
            lastTreatedIndex = 0;
            return patients.get(lastTreatedIndex);
        }
    }
}