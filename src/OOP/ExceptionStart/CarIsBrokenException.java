package OOP.ExceptionStart;

/*
* Свои ошибки нужны для того, чтобы структурированно обозначать узко направленные ошибки, которые есть только в этой программе
* Например, в нашем случае создана ошибка - МашинаСломалась
* И в будущем, при возникновении ошибки, можно будет посмотреть, какие классы используют созданный нами Exception
* */
public class CarIsBrokenException extends Exception { //создаем свою ошибку - класс, который насл-тся от Exception и принимает его конструкторы
    public CarIsBrokenException() {
    }

    public CarIsBrokenException(String message) {
        super(message);
    }

    public CarIsBrokenException(String message, Throwable cause) {
        super(message, cause);
    }

    public CarIsBrokenException(Throwable cause) {
        super(cause);
    }

    public CarIsBrokenException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
