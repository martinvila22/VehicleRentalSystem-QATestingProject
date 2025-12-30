class Car extends Vehicle {
    private String type; // Type of car (Sedan, coupe, hatchback, etc.)

    // Constructor for a Car object

    public Car(String vehicleID, String make, String model, int year, boolean isRented, String type) {
        super(vehicleID, make, model, year, isRented);
        this.type = type;
    }
    // Getters and setters for subclass

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}