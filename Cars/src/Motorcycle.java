public abstract class Motorcycle extends Vehicule{

    public Motorcycle(String brand, String model, int year) {
        super(brand, model, year);
    }

    public String getFuelType() {
        return "Petrol";
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle is Driving");
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle is Accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Motorcycle is Braking\n");
    }


}
