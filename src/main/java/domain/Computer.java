package domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Computer {
    static final String REGEXP = "^[1-9]{3}";
    private ArrayList<Integer> balls;

    public Computer() {
        balls = new ArrayList<>();

        while (balls.size() < 3) {
            int tempNumber = new Random().nextInt(9) + 1;
            if (!balls.contains(tempNumber)) {
                balls.add(tempNumber);
            }
        }

    }

    public ArrayList<Integer> balls() {
        return this.balls;
    }

    public ArrayList<Integer> userInputToBall(String input) {
        if (!userInputIsValid(input)) {
            throw new IllegalArgumentException();
        }

        ArrayList<Integer> userBalls = new ArrayList<>();
        String[] tempArr = input.split("");
        for (String number : tempArr) {
            userBalls.add(Integer.parseInt(number));
        }

        return userBalls;
    }

    public boolean userInputIsValid(String input) {

        return input.matches(REGEXP);
    }
}
