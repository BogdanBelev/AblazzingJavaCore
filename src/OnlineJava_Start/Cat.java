package OnlineJava_Start;
import java.util.Arrays;
public class Cat{

    //---- создаем атрибуты, к которым будем обращаться при работе с классом в основном коде
    private String color;
    private double weight;
    private String ownerName;

    //---- 	создаем объект Cat, в который будем вписывать названия атрибутов
    public Cat(String colorCat, double weightCat, String ownerCat){
        this.color = colorCat;
        this.weight = weightCat;
        this.ownerName = ownerCat;
    }

    //---- создаем метод (действие), в котором указываем код, то есть то, что будет выполнять кот
//---- void ничего не возвращает (то есть нельзя создать переменную и вообще сохранить результат этого метода)
//---- в скобках указываем переменную, массивы, типы данных и тд, с которыми будем работать, а их значение присваивается в основном коде при обращении к методу
    public void destroySofa(String sofaOwner){
        System.out.printf("Cat destroy the %s's sofa!\n", sofaOwner);
    }

    //---- если нам надо сохранить полученное из метода значение, то создаем метод с определенным типом данных
//---- но после retur нельзя ничего писать - выходит из метода
    public String hunt(boolean isDay){
        if(isDay){
            return "Mouse";
        }

        return "Owl";

    }
//---- также мы можем создавать такой же метод, но с другими аргументами, и при вызове в основном файле вызовется тот метод,
//---- аргументы которого мы указали (это называется ПЕРЕГРУЗКА МЕТОДА). Также можно и создавать методы с другим типом (напр. void)

    public String hunt (boolean isDay, boolean success){
        if (success){
            if(isDay){
                return "Mouse";
            }
            return "Owl";
        }
        return "Nothing";
    }


    //---- varArgs - ...ИМЯ АРГУМЕНТА -  ставим три точки перед аргументом и тем самым превращаем его в массив, который может принимать в себя
//---- много аргументов. ...ИМЯ АРГУМЕНТА обязательно долен стоять в конце.
    public void feed(String ownerName, String ...product){
        System.out.printf("The %s's cat has ate %s", ownerName, Arrays.toString(product));
    }



}



