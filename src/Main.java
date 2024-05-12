import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            Driver driver = new Driver("Driver" + i, 25 + i, 5 + i);
            Car car = new Car("Brand" + i, 100 + i, driver, 10000 + i * 1000, 2000 + i);
            cars.add(car);
        }
        for (int i = 0; i < cars.size() / 2; i++) {
            cars.get(i).repairEngine();
            Driver newDriver = new Driver("NewDriver" + i, 30 + i, 10 + i);
            cars.get(i).driver = newDriver;
        }
        for (int i = 0; i < cars.size(); i += 2) {
            cars.get(i).increasePowerAndPrice();
        }
        for (Car car : cars) {
            if (car.driver.experience < 5 && car.driver.age > 25) {
                car.driver.attendQualificationCourse();
            }
        }
        Car randomCar = TaxiServiceHelper.getRandomCar(cars);
        System.out.println("Автомобіль марки " + randomCar.brand + " з водієм " + randomCar.driver.name + " виїхав за вами.");
        System.out.println("Водій " + randomCar.driver.name + " прибув на місце.");
    }
}
