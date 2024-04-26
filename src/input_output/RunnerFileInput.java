package input_output;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


/*
* Создаем текстовый файл Article.txt в папке src
* Через класс FileReader обращаемся к файлу (путь находим через ПКМ на файл CopyPath)
* StandardCharsets.UTF_8 - позволяет читать русские символы
* Класс StringBuilder нужен для записывания символов в переменную:
*   - в цикле while через метод fileReader.ready() (нужен для того, чтобы понять, что информация в файле закончилась и while прекратить)
*   - stringBuilder.append((char) fileReader.read()):
*       -- нужен для чтения и записывания каждого символа в переменную stringBuilder
*       -- fileReader.read() - читает символ из файла
*
* --------
*
*
* */

public class RunnerFileInput {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = RunnerFileInput.class.getClassLoader().getResourceAsStream("Article.txt");

//        FileReader fileReader = new FileReader("E:\\Programming\\JavaCore\\JavaCore\\Resources\\Article.txt", StandardCharsets.UTF_8);
//        StringBuilder stringBuilder = new StringBuilder();
//        while(fileReader.ready()){
//            stringBuilder.append((char) fileReader.read());
//        }
//        System.out.println(stringBuilder);
//
//        System.out.println("----------");
//        fileReader.close();

        Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8);
        int count = 0;
        int lineNeeded = 1;
        while (scanner.hasNext()){
            String nextLine = scanner.nextLine();
            if(count == lineNeeded) {
                System.out.println(nextLine);
            }
            count++;
        }
        scanner.close();
        inputStream.close();
    }
}
