package domain;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private List<Ball> computerBalls;

    public Balls(List<Integer> numbers) {
        computerBalls = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Ball ball = new Ball(i, numbers.get(i));
            computerBalls.add(ball);
        }

    }

    public BallStatus play(Ball ball) {
        return computerBalls.stream()
                .map(computerBall -> computerBall.compare(ball))
                .filter(ballStatus -> ballStatus != BallStatus.NOTHING)
                .findFirst()
                .orElse(BallStatus.NOTHING);

    }

    public PlayResult play(List<Integer> userNumbers) {
        Balls userBalls = new Balls(userNumbers);
        PlayResult result = new PlayResult();
        for (Ball computerBall : computerBalls) {
            BallStatus status = userBalls.play(computerBall);
            result.judge(status);
        }
        return result;
    }
}
