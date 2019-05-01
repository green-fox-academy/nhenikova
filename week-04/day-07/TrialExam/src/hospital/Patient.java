package hospital;

import java.util.Random;

public class Patient {
    private int diseaseSeverity;

    public Patient() {
        Random random = new Random();
        // returns value between 0 (inclusive) and the specified value (exclusive)
        diseaseSeverity = random.nextInt(10) + 1; // 1 - 10
    }

    public int getDiseaseSeverity() {
        return diseaseSeverity;
    }

    public void treatPatient() {
        if (diseaseSeverity > 0) {
            diseaseSeverity -= 1;
        }
    }
}