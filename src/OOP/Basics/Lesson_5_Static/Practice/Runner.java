package OOP.Basics.Lesson_5_Static.Practice;

public class Runner {
    public static void main(String[] args) {
        Restaurant eatDen = new Restaurant("EatDen");
        Restaurant eatBogdan = new Restaurant("EatBogdan");

        Restaurant.GetProducts();
        eatDen.ServingDish();

        for(int i = 0; i <= 10; i++){
            eatBogdan.ServingDish();
            System.out.println(i);
        }
        Restaurant.Report();


    }
}
