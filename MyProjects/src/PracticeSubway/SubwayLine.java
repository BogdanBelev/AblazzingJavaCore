package PracticeSubway;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

/*
прога для вывода станций метро на экран
*/
public class SubwayLine {
//    создаем 1 переменные - название линии метро
    private String subwayLineName;

//    создаем конструктор для того, чтобы мы могли создать линию метро
    public SubwayLine(String subwayLineName) {
        this.subwayLineName = subwayLineName;
    }

//    создаю коллекцию станций
    List<String> listStations = new ArrayList<>();
/*
    заполняю коллекцию, добавляя станции в Runner
    делаю это с помощью метода (импортирую - import java.util.*;)
        КОЛЛЕКЦИЯ.addAll(Arrays.asList(ЭЛЕМЕНТ));
    который позволяет добавлять несколько элементов в коллекцию, то есть указываю станции через запятую,
    а не дублируя код, добавляя по 1й станции
    */
    public void addOneStations(String ...stationName){
        listStations.addAll(Arrays.asList(stationName));
    }

}
