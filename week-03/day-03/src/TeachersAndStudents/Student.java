package TeachersAndStudents;

public class Student {

    public Student() {
    }

    public String learn() {
        return ("I'm learning.");
    }

    public String question(Teacher teacher) {
        return teacher.answer();
    }

}
//Teacher Student
//Create Student and Teacher classes
//Student
//learn()
//question(teacher) -> calls the teachers answer method
//Teacher
//teach(student) -> calls the students learn method
//answer()