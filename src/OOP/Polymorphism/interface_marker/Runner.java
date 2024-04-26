package OOP.Polymorphism.interface_marker;

public class Runner {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Airplane airplane = new Airplane();

        if (bird instanceof Alive){
            System.out.println("This object is alive!");
        }

        if (airplane instanceof Alive){
            System.out.println("This object is alive!");
        } else {
            System.out.println("This object isn't alive!");
        }
    }
}
