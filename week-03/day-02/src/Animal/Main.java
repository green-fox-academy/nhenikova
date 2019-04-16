package Animal;

public class Main {
    public static void main(String[] args) {
        Animal tiger = new Animal();
        Animal hippo = new Animal(10, 30);

        tiger.eat();
        hippo.drink();
        tiger.play();
        hippo.play();

        System.out.println(tiger.thirst);
        System.out.println(tiger.hunger);
        System.out.println(hippo.thirst);
        System.out.println(hippo.hunger);

    }
}
//Create an Animal class
//Every animal has a hunger value, which is a whole number
//Every animal has a thirst value, which is a whole number
//when creating a new animal object these values are created with the default 50 value
//Every animal can eat() which decreases their hunger by one
//Every animal can drink() which decreases their thirst by one
//Every animal can play() which increases both by one