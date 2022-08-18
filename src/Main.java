import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person someperson = new Person("My Imaginary Friend","out of connect");
        Person testperson = new Person("Me", "out of connect");

        ArrayList<Vehicle> teamVehicles = new ArrayList<Vehicle>();

        Bike mybike = new Bike("Awesome Sigizmund",someperson,1);
        mybike.drive(testperson);
        teamVehicles.add(mybike);

        Car somecar = new Car("Lightning McQueen",null,0);
        teamVehicles.add(somecar);

        for (Vehicle gizmo : teamVehicles)
        {
            // show strict info about the gizmo
            System.out.println(gizmo.textStatus());
        }
    }
}