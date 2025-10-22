public abstract class Truck extends Vehicule implements Serviceable {

    public Truck(String brand, String model, int year) {
        super(brand, model, year);
    }

    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public void drive() {
        System.out.println("Truck is Driving");
    }

    @Override
    public void accelerate() {
        System.out.println("Truck is Accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Truck is Braking");
    }

    @Override
    public void performService(){
        System.out.println("Truck is delivering cargo");
    }

    @Override
    public boolean needsService() {
        boolean result = (2025 - year) >= 5;
        System.out.println("Does it need service?: " + result);
        return result;
    }


}
