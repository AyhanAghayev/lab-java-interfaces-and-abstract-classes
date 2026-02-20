package Cars;

public abstract class Car {
    private String vinNumber;
    private String make;
    private String model;
    private int mileage;

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public String getVinNumber() { return vinNumber; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getMileage() { return mileage; }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVinNumber(int mileage) {
        if (mileage < 0) {
            throw new IllegalArgumentException("Miles can't be below zero.");
        }
        this.mileage = mileage;
    }

    public String getInfo() {
        return "VIN: " + vinNumber + ", Make: " + make + ", Model: " + model + ", Mileage: " + mileage;
    }
}