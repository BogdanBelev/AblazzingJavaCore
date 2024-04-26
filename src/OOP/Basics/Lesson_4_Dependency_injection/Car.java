package OOP.Basics.Lesson_4_Dependency_injection;

public class Car {
    private String brand;
    private int maxSpeedCar = 220;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, int maxSpeedCar) {
        this.brand = brand;
        this.maxSpeedCar = maxSpeedCar;
    }

    public void accelerationTo100 (){
        double accelerationTime = 110d/(this.maxSpeedCar/20d);
        System.out.printf("Acceleration speed up to 100 km/h: %s\n", accelerationTime);
    }

    public void setMaxSpeedCar(int newMaxSpeedCar) {
        if (newMaxSpeedCar <= 0){
            this.maxSpeedCar = 1;
        }
        else {
            this.maxSpeedCar = newMaxSpeedCar;
        }
    }

    public int getMaxSpeedCar() {
        return maxSpeedCar;
    }

    public String getBrand() {
        return brand;
    }
}
