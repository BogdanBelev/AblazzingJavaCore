package OOP.ExceptionStart;

import OOP.Basics.Lesson_5_Static.Car;

public class RunnerOwnException {
    public static void main(String[] args) throws CarIsBrokenException {
        OwnExceptionCar car = new OwnExceptionCar(true);
        car.start();

    }
}
