package domain;

public class PlayResult {
    private int strike = 0;
    private int ball = 0;

    public void judge(BallStatus status) {
        if (status.isStrike())
            strike += 1;

        if (status.isBall()) {
            ball += 1;
        }
    }

    public int getStrike() {
        return strike;
    }
    public int getBall() {
        return ball;
    }

    public boolean correctAnswer() {
        return strike == 3;
    }
}
