package OOP.ExceptionStart;

//finally нужен для того, чтобы выполнять "экстренный" код, например, сохранить данные и закрыть программу
//это лучше, чем программа сама аварийно отключится

public class RunnerFinally {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            System.out.println(a/b);
        }catch (Exception e){
            throw new ArithmeticException("New error"); //в блоке catch вылезла ошибка и ее нужно обойти
        }finally {
            System.out.println("Программа работает дальше"); //программа аварийно завершается (выполняется почти в любом случае)
        }


    }
}
