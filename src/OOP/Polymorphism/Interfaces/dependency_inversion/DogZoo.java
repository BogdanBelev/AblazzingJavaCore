package OOP.Polymorphism.Interfaces.dependency_inversion;

public class DogZoo {
    private Dog dog1;
    private Dog dog2;

    public DogZoo(Dog dog1, Dog dog2) {
        System.out.println("Anything dog");
        this.dog1 = dog1;
        this.dog2 = dog2;
    }
    public DogZoo(Shepherd shepherd, Poodle poodle){
        System.out.println("Shepherd and poodle");
        this.dog1 = shepherd;
        this.dog2 = poodle;
    }
}
