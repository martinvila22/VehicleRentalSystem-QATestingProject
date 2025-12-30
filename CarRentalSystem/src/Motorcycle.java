class Motorcycle extends Vehicle {
    private int numberOfwheels; // Number of wheels of motorcycle

    // Constructor for Motorcycle object
    public Motorcycle(String vehicleID, String make, String model, int year, boolean isRented, int numberOfwheels) {
        super(vehicleID, make, model, year, isRented);
        this.numberOfwheels = numberOfwheels;

    }

    // Getters and setters for subclass

    public int getNumberOfwheels() {
        return numberOfwheels;
    }

    public void setNumberOfwheels(int numberOfwheels) {
        this.numberOfwheels = numberOfwheels;
    }
}
