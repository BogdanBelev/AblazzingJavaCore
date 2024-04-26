package input_output;

import java.io.*;

/*
* ВАЖНО!!! Всегда закрывай потоки Stream через .close
* Иначе система будет перегружена
*
* Когда мы помещаем файл в экз-р класса, для того, чтобы записывать в него данные, вся инфа, записанная до этого стирается.
* Чтобы этого избежать, можно в дальнейшем использовать append дописав true
* */

public class FileOutputRunner {
    public static void main(String[] args) throws IOException {
        String breadCosts1 = "Bread is 40 cents";
        String breadCosts2 = "Bread is 40 rubles";
        String fileName = "E:\\Programming\\JavaCore\\JavaCore\\BreadCosts.txt";

        FileOutputStream fileOutputStream = new FileOutputStream(fileName );  // 1 способ записи в файл
        fileOutputStream.write(breadCosts1.getBytes());
        fileOutputStream.close();

        try (FileWriter fileWriter = new FileWriter(fileName, true)){ // 2 способ записи в файл (через write)
            fileWriter.write("\n" + breadCosts2);                       // вносим в try чтобы автоматически закрывался поток
        }
    }
}
