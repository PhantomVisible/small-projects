import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Vehicule> vehicules = new ArrayList<>();
        vehicules.add(new Car("Dacia", "Logan", 2018){});
        vehicules.add(new Motorcycle("Kawasaki", "Ninja", 2020){});
        vehicules.add(new Truck("Volvo", "FH Range", 2016){});

        for (Vehicule v : vehicules) {
            v.displayInfo();
            v.drive();
            v.accelerate();
            v.brake();

            if (v instanceof Serviceable) {
                Serviceable service =  (Serviceable) v;
                service.performService();

            }
        }
        }
    }
