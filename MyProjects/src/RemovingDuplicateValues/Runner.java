package RemovingDuplicateValues;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* Через дебаг исправить баг)
* */

public class Runner {
    public static void main(String[] args) {
        List<Integer> listDuplicateValues = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1));

        for(int i = 0; i < listDuplicateValues.size(); i++){
            upperFor:
            for (int indexOther = 0; indexOther < listDuplicateValues.size(); indexOther++) {
                if (i == indexOther) {
                    continue upperFor;
                }
                else if(listDuplicateValues.get(i) == listDuplicateValues.get(indexOther)) {
                    listDuplicateValues.remove(i);
                }
            }
        }
        System.out.println(listDuplicateValues);
    }
}
