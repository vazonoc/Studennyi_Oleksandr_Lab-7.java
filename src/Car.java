
class Car {
    String brand;
    double enginePower;
    Driver driver;
    double price;
    int year;
    Car(String brand, double enginePower, Driver driver, double price, int year) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }
    void repairEngine() {
        this.enginePower *= 1.1;
    }
    void increasePowerAndPrice() {
        this.enginePower *= 1.1;
        this.price *= 1.05;
    }
}


