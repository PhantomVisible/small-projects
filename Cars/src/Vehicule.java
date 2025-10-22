

public abstract class Vehicule implements Drivable {

    String brand,model;
    int year;

    public Vehicule(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
     public void displayInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Fuel Type is : " + getFuelType());

     }
     public abstract String getFuelType();
}
