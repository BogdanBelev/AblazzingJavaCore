package input_output;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* TryWithResources - нужен для автоматического закрытия потоков
* */

public class TryWithResourcesRunner {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileReader fileReader1 = null;
        try{
            fileReader1 = new FileReader("E:\\Programming\\JavaCore\\JavaCore\\resources\\Article.txt");
            throw new RuntimeException("Error!");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("The file is closed");
            fileReader1.close();
        }

        try(FileReader fileReader2 = new FileReader("E:\\Programming\\JavaCore\\JavaCore\\resources\\Article.txt")){
            throw new RuntimeException("Error2!");
        }catch (Exception e){
            System.out.println("Ошибка обработана");
        }
    }
}
