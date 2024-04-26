package OOP.Basics.Lesson_5_Static.Practice;

public class Restaurant {
    private static String nameRestaurant;
    private static int sausages = 0;
    private static int bread = 0;

    public Restaurant(String nameRestaurant) {
        this.nameRestaurant = nameRestaurant;
    }

    public void ServingDish(){
        if(sausages <=0 && bread <= 0) {
            System.out.println("The products isn't enough!");
            Restaurant.Report();
        }
        else{
            sausages--;
            bread-=2;
            System.out.println("One dish was served.");
        }

    }

    public static void GetProducts(){
        sausages+=100;
        bread+=200;
        System.out.println("One batch of goods was delivered.");
        Restaurant.Report();
    }

    public static void Report(){
        System.out.printf("Quantity of sausages: %s\n", sausages);
        System.out.printf("Quantity of bread: %s\n", bread);
        System.out.println("-------");
    }
}
