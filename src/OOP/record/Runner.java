package OOP.record;

public class Runner {
    public static void main(String[] args) {
        Human me = new Human(2002, "Bodan", "Dmitrievich", "Belev");
        HumanRecord meRecord = new HumanRecord(2002, "Bodan", "Dmitrievich", "Belev");

        System.out.println(me);
        System.out.println(meRecord);
        meRecord.getInfo();

    }
}
