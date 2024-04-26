package OOP.enumeration;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Country.values()));
        System.out.println(Country.valueOf("JAPAN").getPeopleCount());
    }
}
