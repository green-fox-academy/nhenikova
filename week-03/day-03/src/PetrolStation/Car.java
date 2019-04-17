package PetrolStation;

public class Car {
    int capacityOfCar;
    int gasAmount;

    public Car (int gasAmount, int capacityOfCar) {
        this.gasAmount = gasAmount;
        this.capacityOfCar = capacityOfCar;
    }

    public Car() {
        this.capacityOfCar = 100;
        this.gasAmount = 0;
    }
}

//Petrol Station
//Create Station and Car classes
//Station
//gasAmount
//refill(car) -> decreases the gasAmount by the capacity of
// the car and increases the cars gasAmount
//Car
//gasAmount
//capacity
//create constructor for Car where:
//initialize gasAmount -> 0
//initialize capacity -> 100