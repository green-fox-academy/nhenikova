package BeforeInheritance;

public class Mentor {
    String name;
    int age;
    String gender;
    String level;

    public Mentor(String name, int age, String gender, String level) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level = level;
    }

    public Mentor() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.level = "intermediate";
    }

    public void introduce() {
        System.out.println("Hi, I'm " + this.name + " and I'm " + this.age + " year's old " + this.gender + " " + this.level + " level mentor.");
    }

    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }
}

//Create a Mentor class that has
// the same fields and methods as the Person class, and has
// the following additional
//
//fields:
//level: the level of the mentor (junior / intermediate / senior)
//methods:
//getGoal(): prints out "Educate brilliant junior software developers."
//introduce(): "Hi, I'm name, a age year old gender level mentor."
//The Mentor class has the following constructors:
//
//Mentor(name, age, gender, level)
//Mentor(): sets name to Jane Doe, age to 30, gender to female,
// level to intermediate