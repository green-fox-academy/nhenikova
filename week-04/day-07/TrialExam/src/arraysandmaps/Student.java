package arraysandmaps;

public class Student {
    private int age;
    private String name;
    private boolean isHappy;


    public Student(int age, String name, boolean isHappy) {
        this.age = age;
        this.name = name;
        this.isHappy = isHappy;
    }

    public boolean getIsHappy() {
        return isHappy;
    }

    public int getAge() {
        return age;
    }
}