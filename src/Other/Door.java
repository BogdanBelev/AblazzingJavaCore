package Other;

public class Door {
    private boolean infoDoor;

    public Door() {
        this.infoDoor = infoDoor;
    }

    public void open(){
        infoDoor = true;
    };
    public void close(){
        infoDoor = false;
    };

    public boolean isInfoDoor() {
        return infoDoor;
    }
}
