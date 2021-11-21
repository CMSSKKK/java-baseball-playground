package ver2;

import java.util.List;

public class Judgement {
    public int count;
    public int ball;
    public int strike;
    public boolean answer;

    Judgement() {
        count = 0;
        ball = 0;
        strike = 0;
        answer = false;

    }

    int checkSameNumber(List<Integer> computerNumbers, List<Integer> userNumbers) {

        this.count = 0;

        for (int i = 0; i < userNumbers.size(); i++) {
            if (computerNumbers.contains(userNumbers.get(i))) {
                count++;
            }
        }

        return count;
    }

    void checkStrikeAndBall(List<Integer> computerNumbers, List<Integer> userNumbers) {
        this.count = checkSameNumber(computerNumbers, userNumbers);

        if(count == 0) {
            return;
        }

        for (int i = 0; i < computerNumbers.size(); i++) {
            if(computerNumbers.get(i) == userNumbers.get(i)) strike++;
        }

        ball = count - strike;

        if(strike == 3) {
            this.answer = true;
        }
     }

}
