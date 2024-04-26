package Other;

import Other.Door;

public class HernyaDenisa {
    public static void main(String[] args) {
        Door door = new Door();
        door.open();
        door.close();

        if(door.isInfoDoor()){
            System.out.println("Играет музыка");
        }
        else {
            System.out.println("Музыка не играет");
        }

    }
}
