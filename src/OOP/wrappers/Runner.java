package OOP.wrappers;

public class Runner {
    public static void main(String[] args) {
        String text = "100";
        int number = Integer.parseInt(text); //оборачиваем текст "100" в класс Integer и превращаем его в число
        System.out.println(number * 2);
//        Integer numberWrapper = null; //отличие оригинального int от обертки в Integer - последний может быть Null хотя int не может быть пустым
//        System.out.println(numberWrapper * 2); //поэтому нужно всегда проверять на неравенство Null

        //        System.out.println(text * 2); //так нельзя, т.к. это текст
    }
}
