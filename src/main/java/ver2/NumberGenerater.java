package ver2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerater {

    private List<Integer> list;

    public void setList() {
        list = new ArrayList<>();

        while(list.size() <3) {
            int number = new Random().nextInt(9)+1;
            if(list.contains(number)) continue;
            list.add(number);
        }
    }

    public List<Integer> getList() {
        return list;
    }

    public List<Integer> StringToList(String userNumber) {
        if(userNumber.length() != 3) {
            throw new IllegalArgumentException();
        }

        List<Integer> userNumbers = new ArrayList<>();
        String[] arr = userNumber.split("");
        for (int i = 0; i < arr.length; i++) {
            userNumbers.add(Integer.parseInt(arr[i]));
        }
        return userNumbers;
    }
}
