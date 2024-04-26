package OnlineJava_Start;

public class Book {
    String nameBook;
    String nameAuthor;
    int numberPages;
    boolean documentaryBook;

    public Book(String nameMyBook, String nameMyAuthor, int numberMyPages, boolean documentaryMyBook){
        this.nameBook = nameMyBook;
        this.nameAuthor = nameMyAuthor;
        this.numberPages = numberMyPages;
        this.documentaryBook = documentaryMyBook;
    }

    //---- 1 метод: подсчет всех строк в книге
    public void numberLinesBook(){
        System.out.println("Number of all lines in the book: " + numberPages * 34);
    }

    //---- 2 метод: подсчет всех строк в книге (с аргументом) + возврат значение для будущего использования
    public int numberLinesBook(int numberPagesBook, int numberLinesBook){
        return numberPagesBook * numberLinesBook;
    }

    //---- 3 метод: вывод инфы о книге
    public void infoBook(){
        String infoBook;
        if (documentaryBook){
            infoBook = "documentary";
        }
        else{
            infoBook = "fiction";
        }
        System.out.printf("%s from %s - %s\n", nameBook, nameAuthor, infoBook);
    }



}
