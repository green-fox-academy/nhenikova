package arraysandmaps;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        List<Student> students  = new ArrayList<>();
        students.add(new Student(26,"Peter",true));
        students.add(new Student(27,"Naty",true));
        students.add(new Student(23,"SkyWalker",false));
        students.add(new Student(33,"IDontKnow",true));

        // I want to know if Naty is happy
        boolean natyIsHappy = students.get(1).getIsHappy();

        // I want to print to the console all student ages
        for (Student student : students) {
            int age = student.getAge();
            System.out.println(age);
        }

        // I want to know the average of the ages of the students in the list
        int sum = 0;
        for (Student student : students) {
            int age = student.getAge();
            sum += age;
        }

        double average = (double)sum / students.size();
    }
}