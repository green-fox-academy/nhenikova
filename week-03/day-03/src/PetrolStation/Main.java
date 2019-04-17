package PetrolStation;

public class Main {
    public static void main(String[] args) {
        Station omv = new Station(7000);
        Car skodaOctavia =  new Car(300, 50);
        Car vwPassatB5 = new Car();

        omv.refillCar(skodaOctavia);
        System.out.println(skodaOctavia.gasAmount);
        System.out.println(omv.gasAmount);

        omv.refillCar(vwPassatB5);
        System.out.println(vwPassatB5.gasAmount);
        System.out.println(omv.gasAmount);
    }
}
