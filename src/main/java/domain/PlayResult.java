package domain;

public class PlayResult {
    private int strike = 0;
    private int ball = 0;
    private boolean continueGame = true;

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
        this.continueGame = false;
        return strike == 3;
    }

    public boolean noBall() {
        return this.getBall() == 0;
    }

    public boolean noStrike() {
        return this.getStrike() == 0;
    }

    public boolean isNothing() {
        return this.noBall() && this.noStrike();
    }
}
