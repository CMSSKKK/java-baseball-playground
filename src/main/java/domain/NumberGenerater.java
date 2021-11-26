package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerater {

    private List<Integer> list;

    public List<Integer> randomGenerate(){
        list = new ArrayList<>();
        while(list.size() < 3) {
            int tempNumber = new Random().nextInt(9)+1;
            if(!list.contains(tempNumber)) {
                list.add(tempNumber);
            }
        }
        return list;
    }
}
