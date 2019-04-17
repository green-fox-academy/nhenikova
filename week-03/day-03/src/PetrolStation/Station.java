package PetrolStation;

public class Station {
    int gasAmount;

    public Station (int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public void refillCar(Car car) {
        this.gasAmount = car.capacityOfCar - car.gasAmount;
        car.gasAmount = car.capacityOfCar = car.gasAmount;
    }
}

//Petrol Station
//Create Station and Car classes
//Station
//gasAmount
//refill(car) -> decreases the gasAmount by the capacity
// of the car and increases the cars gasAmount
//Car
//gasAmount
//capacity
//create constructor for Car where:
//initialize gasAmount -> 0
//initialize capacity -> 100