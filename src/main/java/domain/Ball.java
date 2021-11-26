package domain;

public class Ball {
    private int index;
    private BallNumber ballNumber;

    public Ball(int index, int number) {
        BallNumber ballNumber = new BallNumber(number);
        this.index = index;
        this.ballNumber = ballNumber;
    }

    public BallStatus compare(Ball ball) {
        if (this.isEqual(ball)) {
            return BallStatus.STRIKE;
        }

        if (this.ballNumber.isEqual(ball.ballNumber)) {
            return BallStatus.BALL;
        }

        return BallStatus.NOTHING;
    }

    public boolean isEqual(Ball ball) {
        if (this.index == ball.index && this.ballNumber.isEqual(ball.ballNumber)) {
            return true;
        }

        return false;
    }
}
