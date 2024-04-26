package OOP.ExceptionStart;

/*
* throws Exception - пробрасывание в сигнатуру метода. Пишется в названии класса для того,
*                    чтобы throw new Exception(Текст ошибки) сработало
*                    то есть мы пишем свой текст в ошибку и искусственно ее создаем
*                    (программа останавливается - ошибка)
*
* try/catch        - перехват ошибки (программа продолжает работу)
* */

public class RunnerCheckedException {
    public static void main(String[] args) throws Exception{
        int fuel = 10;
        startCar(fuel);
    }

    public static void startCar(int fuel) throws Exception{
        checkFuel(fuel); //вызов проверки наличия топлива
        System.out.println("The car is moving"); //если нет ошибки, то выводим текст - машина едет
    }

    public static void checkFuel (int fuel) throws Exception{ //проверка наличия топлива
        if (fuel <= 0){
            throw new Exception("Error! Fuel ran out!"); //если топливо = 0, то вызывается ошибка с нашим текстом
        }
        System.out.println("Fuel is there");
    }
}
