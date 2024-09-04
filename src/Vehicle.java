public class Vehicle {
    private String brand;
    private int wheels;
    private int doors;
    private int numberEngines;
    private boolean canFly;
    private int numberPassenger;

    //constructor
    public Vehicle(String brand, int wheels, int doors, int numberEngines, boolean canFly, int numberPassenger) {
        this.brand = brand;
        this.wheels = wheels;
        this.doors = doors;
        this.numberEngines = numberEngines;
        this.canFly = canFly;
        this.numberPassenger = numberPassenger;
    }

    //Getter para poder acceder a la marca desde otra clase
    public String getBrand(){
        return this.brand;
    }
}

