package TeachersAndStudents;

public class Teacher {

    public Teacher() {
    }

    public String answer() {
        return ("I answer on your question.");
    }

    public String teach(Student student) {
        return student.learn();
    }
}
