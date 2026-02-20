package Cars;

public class Truck extends Car {
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() { return towingCapacity; }

    public void setTowingCapacity(double towingCapacity) {
        if (towingCapacity < 0.0) {
            throw new IllegalArgumentException("Towing capacity can't be below zero.");
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Towing Capacity: " + towingCapacity;
    }
}