public abstract class Car extends Vehicule {

    public Car(String brand, String model, int year) {
        super(brand, model, year);
    }
    public String getFuelType() {
        return "Diesel";
    }
    @Override
    public void drive() {
        System.out.println("Car is Driving");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is Accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Car is Braking\n");
    }
}
