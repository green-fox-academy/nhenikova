package Sharpie;

public class Main {
    public static void main(String[] args) {

        Sharpie tango = new Sharpie("blue ", 50.3f);
        Sharpie titanic = new Sharpie("black ", 70.7f);

        titanic.use();
        tango.use();
        titanic.use();

        System.out.println(titanic.inkAmount + titanic.color + titanic.width);
        System.out.println(tango.inkAmount + tango.color + tango.width);

    }
}
