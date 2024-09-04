public class Main {

    public static void main(String[] args) {

        Vehicle primerAuto = new Vehicle("mazda",4,4,1,false,0);
        Pilot pilot = new Pilot( "Ale", 28);

        pilot.drive(primerAuto);

        Pilot pilot1 = new Pilot("yas",26);
        pilot1.drive(primerAuto);


    }
}