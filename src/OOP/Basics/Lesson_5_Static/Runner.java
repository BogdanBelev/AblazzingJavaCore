package OOP.Basics.Lesson_5_Static;


import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Car audi = new Car("audi");
        Car bmw = new Car("bmw");
        Car kia = new Car("kia");
        System.out.println("Number of cars: " + Car.getCountCars());
        System.out.println();

        Car.printBrands();
        System.out.println();
//        System.out.println(Car.bmw_info); // выводим инфу, заданную в классе

//        Car.bmw_info = "BMW - is a middling car"; // меняем инфу, хотя этого не должно быть, так как по логике это статик
//        System.out.println(Car.bmw_info);

//        Car.BMW_INFO = "BMW - is a middling car"; - выдает ошибку (нельзя менять значение) - Cannot assign a value to final variable 'BMW_INFO'
        System.out.println(Car.BMW_INFO);
        System.out.println(Car.AUDI_INFO);
        System.out.println(Car.KIA_INFO);
        System.out.println();

        Car.BRAND_DESCRIPTION[0] = "nothing";
        System.out.println(Arrays.toString(Car.BRAND_DESCRIPTION));


    }
}
