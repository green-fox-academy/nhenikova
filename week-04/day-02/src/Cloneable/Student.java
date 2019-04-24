package Cloneable;

public class Student extends Person implements Cloneable {
    String previousOrganization;
    int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
    }

    public Student() {
        super();
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + this.name + " and I'm " + this.age + " year's old " + this.gender + " from " + this.previousOrganization + " who skipped " + skippedDays + " from the course already.");
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    public void skipDays(int numberOfDays) {
        this.skippedDays = skippedDays + numberOfDays;
    }

    @Override
    public Student clone() {
        return new Student(this.name, this.age, this.gender, this.previousOrganization);
    }
}