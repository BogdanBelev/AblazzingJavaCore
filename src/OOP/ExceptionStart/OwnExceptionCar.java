package OOP.ExceptionStart;

public class OwnExceptionCar {
    private boolean isBroken;

    public OwnExceptionCar(boolean isBroken) {
        this.isBroken = isBroken;
    }

    public void start() throws CarIsBrokenException {
        if (isBroken){
            throw new CarIsBrokenException("The car is broken");
        }
        System.out.println("The car is moving");
    }
}
