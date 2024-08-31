package classes;

public class Car extends Vehicle { // hereda atributos y métodos de classes.Vehicle
    private int numberOfDoors;

    public Car(String brand, int numberOfDoors){
        this.brand = brand;
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors(){
        return numberOfDoors;
    }
}
