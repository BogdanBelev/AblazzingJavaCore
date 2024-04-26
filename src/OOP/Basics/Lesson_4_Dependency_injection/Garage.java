package OOP.Basics.Lesson_4_Dependency_injection;

public class Garage {
    private Car car1;
    private Car car2;

    public Garage() {
    }

    public void setCar1(Car car1) {
        this.car1 = car1;
    }

    public void setCar2(Car car2) {
        this.car2 = car2;
    }

    public void getInfoAboutCars(){
        getInfoAboutCar(car1);
        getInfoAboutCar(car2);
    }

    private void getInfoAboutCar(Car car){
        System.out.println("Information about car: ");
        System.out.printf("Brand: %s\n", car.getBrand());
        car.accelerationTo100();
        System.out.println();
    }
}
