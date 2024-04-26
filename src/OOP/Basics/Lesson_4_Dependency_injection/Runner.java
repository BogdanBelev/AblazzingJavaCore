package OOP.Basics.Lesson_4_Dependency_injection;

public class Runner {
    public static void main(String[] args) {
        Car car_1 = new Car("BodixCompany");

        Car car_2 = new Car("DenixCompany", 401);
        car_2.setMaxSpeedCar(car_2.getMaxSpeedCar());

        Garage garage = new Garage();
        garage.setCar1(car_1);
        garage.setCar2(car_2);
        garage.getInfoAboutCars();

    }
}
