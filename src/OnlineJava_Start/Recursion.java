package OnlineJava_Start;

public class Recursion {
    public int sum(int number) {
        if (number < 1){
            return 0;
        }
        int result = number + sum(number - 1);
        return result;
    }
}

// ---- что здесь вообще происходит?))
// ---- в общем, создаем метод sum -> в main файле присваиваем number число 10 (к примеру) -> идет проверка if -> 10 не меньше 1 значит пропускаем
// ---- -> в переменную result вписываем сумму number (10) и вызываемый метод (вызываем метод в теле самого метода, в котором отнимаем от 10 единицу)
// ---- -> и соответсвенно возвращаем результат -> и так как мы вызвали метод внутри метода он пошел по кругу



// -----------------Практика-----------------

