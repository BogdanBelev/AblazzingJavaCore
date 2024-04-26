package PracticeSubway;

public class Runner {
    public static void main(String[] args) {
//        создаем первую линию метро
        SubwayLine orangeLine = new SubwayLine("Orange line");
        SubwayLine greenLine = new SubwayLine("Green line");


        orangeLine.addOneStations(
                "1. Медветково",
                "2. Бабушкинская",
                "3. Свиблово",
                "4. Ботанический сад",
                "5. ВДНХ",
                "6. Алексеевская",
                "7. Рижская",
                "8. Проспект Мира",
                "9. Сухаревская",
                "10. Тургеневская",
                "11. Китай-город",
                "12. Третьяковская"
        );
        System.out.println(orangeLine.listStations);

        greenLine.addOneStations(
                "1. Новокузнецкая",
                "2. Павелецкая",
                "3. Автозаводская",
                "4. Технопарк"
        );
        System.out.println(greenLine.listStations);




    }
}
