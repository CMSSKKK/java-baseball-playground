package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerater {

    private boolean goAndStop;

    public NumberGenerater() {
        this.goAndStop = true;
    }

    public List<Integer> randomGenerate() {
        List<Integer> list = new ArrayList<>();
        while (list.size() < 3) {
            int tempNumber = new Random().nextInt(9) + 1;
            if (!list.contains(tempNumber)) {
                list.add(tempNumber);
            }
        }
        return list;
    }

    public List<Integer> userInputToList(String input) {

        List<Integer> user = new ArrayList<>();
        String[] arr = input.split("");
        for (String str : arr) {
            user.add(Integer.parseInt(str));
        }
        return user;

    }


}
