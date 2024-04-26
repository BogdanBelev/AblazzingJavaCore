package OOP.Basics.Lesson_5_Static;

import java.util.Arrays;

public class Car {
    private String brand;
/*
    static - нужен для того, чтобы атрибут класса стал статическим
    и не менялся переходя от одного экземпляра, к другому. Так как с static атрибут принадлежит именно классу,
    а не экземпляру класса.
    В общем если нам надо создать значение для экземпляра класса, то без статик, если не нужно создавать
    то указываем static.
    Статик не видит другие классы (соответственно и другие переменные), но вот другие объекты статик видят (как в комнате допроса)

    Также можно создавать просто переменные внутри классов, которые вместе со static будут относиться к классу
    и будут одинаково видны в экземплярах    public static String bmw_info = "BMW - is a cool car)";
    Но значение можно изменять. Для того чтобы не менялось значение, надо добавить final переменную назвать в ВЕРХНЕМ РЕГИСТРЕ
    public final static String BMW_INFO = "BMW - is a cool car)";

    также можно создавать массивы в классе, и видимо вообще всё, главное начинать с public

    можно создать код в классе, который будет выполняться, например, принт. И он будет выводиться сразу в тот момент, когда
    в Runner обращаемся к этому классу, как угодно. Если появляется название класса, то он загружается в оперативную память и
    выполняет код, который находится в классе.
    Так я вызвал массив в блоке static:
        static {
        BRAND_DESCRIPTION[0] = AUDI_INFO;
        BRAND_DESCRIPTION[1] = BMW_INFO;
        BRAND_DESCRIPTION[2] = KIA_INFO;
        System.out.println(Arrays.toString(BRAND_DESCRIPTION));
    }
    и в раннере он вывелся.

    также надо иметь ввиду, что метод final запрещает менять значение того объекта, к которому он приписан. То есть
    в моем случае final запрещает менять String[] BRAND_DESCRIPTION = new String[3]; , а именно ссылку этого объекта,
    а вот блок статик, где задаются значения массива менять можно
*/



    private static int countCars = 0;
    //public static String bmw_info = "BMW - is a cool car)";
    public final static String AUDI_INFO = "Audi - is also a cool car)";
    public final static String BMW_INFO = "BMW - is a cool car)";
    public final static String KIA_INFO = "Kia - is nice car)";

    public final static String[] BRAND_DESCRIPTION = new String[3];

    static {
        BRAND_DESCRIPTION[0] = AUDI_INFO;
        BRAND_DESCRIPTION[1] = BMW_INFO;
        BRAND_DESCRIPTION[2] = KIA_INFO;
        System.out.println(Arrays.toString(BRAND_DESCRIPTION));
    }
    public Car(String brand) {
        this.brand = brand;
        countCars++;
    }

    public static int getCountCars() {
        return countCars;
    }

    public static void printBrands(){
        System.out.println("List of available brands: audi, bmw, kia");
    }
}
