package baseballTest;

import domain.Ball;
import domain.BallStatus;
import domain.Balls;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ballsTest {
    private Balls computerBalls;

    @BeforeEach
    void setUp() {
        computerBalls = new Balls(Arrays.asList(1, 2, 3));
    }

    @Test
    @DisplayName("컴퓨터 공들과 유저 공을 비교하기")
    void computerBallsCompareUserBallTest() {
        assertThat(computerBalls.play(new Ball(2, 4))).isEqualTo(BallStatus.NOTHING);
        assertThat(computerBalls.play(new Ball(2, 2))).isEqualTo(BallStatus.BALL);
        assertThat(computerBalls.play(new Ball(0, 1))).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    @DisplayName("컴퓨터 공들과 유저 공들을 비교하기 (리스트끼리 비교하기) 스트라이크 찾기")
    void computerBallsCompareUserBallsTest_strike() {
        assertThat(computerBalls.play(Arrays.asList(4, 5, 6)).getStrike()).isEqualTo(0);
        assertThat(computerBalls.play(Arrays.asList(2, 3, 1)).getStrike()).isEqualTo(0);
        assertThat(computerBalls.play(Arrays.asList(1, 5, 7)).getStrike()).isEqualTo(1);

    }

    @Test
    @DisplayName("컴퓨터 공들과 유저 공들을 비교하기 (리스트끼리 비교하기) 볼 찾기")
    void computerBallsCompareUserBallsTest_ball() {
        assertThat(computerBalls.play(Arrays.asList(4, 5, 6)).getBall()).isEqualTo(0);
        assertThat(computerBalls.play(Arrays.asList(2, 3, 1)).getBall()).isEqualTo(3);
        assertThat(computerBalls.play(Arrays.asList(1, 5, 2)).getBall()).isEqualTo(1);

    }

    @Test
    @DisplayName("답을 맞췄을 때 게임 종료하기 ")
    void computerBallsCompareUserBallsTest_correctAnswerTest() {
        assertThat(computerBalls.play(Arrays.asList(1, 2, 3)).correctAnswer()).isTrue();
        assertThat(computerBalls.play(Arrays.asList(4, 2, 3)).correctAnswer()).isFalse();

    }
}
