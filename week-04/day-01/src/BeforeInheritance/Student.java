package BeforeInheritance;

public class Student {
    String name;
    int age;
    String gender;
    String previousOrganization;
    int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.previousOrganization = "The School of Life";
    }

    public void introduce() {
        System.out.println("Hi, I'm " + this.name + " and I'm " + this.age + " year's old " + this.gender + " from " + this.previousOrganization + " who skipped " + skippedDays + " from the course already.");
    }

    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    public void skipDays(int numberOfDays) {
        this.skippedDays = skippedDays + numberOfDays;
    }
}


//Student
//Create a Student class that has the same fields and methods as the Person
// class, and has the following additional
//
//fields:
//previousOrganization: the name of the student’s previous company / school
//skippedDays: the number of days skipped from the course
//methods:
//getGoal(): prints out "Be a junior software developer."
//introduce(): "Hi, I'm name, a age year old gender from
// previousOrganization who skipped skippedDays days from the course already."
//skipDays(numberOfDays): increases skippedDays by numberOfDays
//The Student class has the following constructors:
//
//Student(name, age, gender, previousOrganization): beside the
// given parameters, it sets skippedDays to 0
//Student(): sets name to Jane Doe, age to 30, gender to female,
// previousOrganization to The School of Life, skippedDays to 0