public class Pilot {
    private String name;
    private int age;

    //constructor
    public Pilot(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void drive (Vehicle vehicle){
        System.out.println("I am " + name + " and now go to drive a " + vehicle.getBrand());
    }

}
