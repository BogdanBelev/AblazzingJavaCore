package input_output;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/*
* System.setOut(new PrintStream(data)) - делает так, чтобы инфа выводилась не в консоль, а помещалась в экз-р класса - data
*
* PrintStream consoleOut = System.out; ->
* System.setOut(consoleOut);           - команда для того, чтобы инфа, указанная далее, снова выводилась в консоль

* */

public class OutputRunner {
    public static void main(String[] args) {
        PrintStream consoleOut = System.out;

        ByteArrayOutputStream data = new ByteArrayOutputStream();   //создаем экз-р класса, куда будем помещать текст
        System.setOut(new PrintStream(data));                       //делает так, чтобы текст выводился не в консоль, а помещался в экз-р класса - data
        System.out.println("The text");

        System.setOut(consoleOut);                                  //инфа, указанная далее, снова будет выводиться в консоль
        System.out.println(String.valueOf(data).toUpperCase());     //выводим инфу, записанную в переменную экз-ра класса data заглавными буквами
    }
}
