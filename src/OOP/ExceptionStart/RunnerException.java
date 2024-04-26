package OOP.ExceptionStart;

//exception нужен для обхода ошибок, которые могут произойти
//например, пользователь ввел неправильные данные -> ошибка: введите корректные данные
//и при этом будет контролируемо выполняться нужный код

/*
* ArithmeticException - это обычный класс со своими методами (нужен для обхода арифметических ошибок)
* ArrayIndexOutOfBoundsException - для обхода ошибок с массивами
*
* либо сразу писать Exception - перехватывают любую ошибку
*
* не все ошибки можно перехватить
* */

public class RunnerException {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            int[] ints = new int[2]; //создаем массив из 2 элементов
            System.out.println(ints[2]); //вызываем элемент, выходящий за границы - ошибка
            System.out.println(a/b); //создаем ошибку при делении
        } catch (ArithmeticException e){ //если вылазит ошибка, то помещаем ее в переменную "е"
            System.out.println("Арифметическая ошибка : " + e.getMessage()); //выводим сообщение об ошибке и ее код - e.getMessage()
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка с массивом: " + e.getMessage());
        }

        System.out.println("Действия после ошибки");
    }
}