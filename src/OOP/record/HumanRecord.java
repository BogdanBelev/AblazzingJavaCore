package OOP.record;

//в этом классе все действия из класса Human можно упростить
//класс record автоматически воспроизводит указанные в классе Human функции
//но только если поля (год рождения, имя и тд) будут final - неизменными
//*
//таким образом, рекорд нужен для создания неизменяемых объектов
// */
public record HumanRecord(int birthYear, String name, String surname, String lastname) {
    public void getInfo(){
        System.out.println(name + " " + lastname); //методы реализуются как обычно
    }

    public HumanRecord{
        System.out.println("Hello from the Record"); //если хотим, чтобы совершалось какое-то действие при обращении к классу
                                                     //то просто дописываем это как конструктор
    }
}
