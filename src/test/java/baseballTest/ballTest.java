package baseballTest;

import domain.Ball;
import domain.BallNumber;
import domain.BallStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ballTest {

    private BallNumber ballNumber;
    private Ball computerBall;

    @Test
    @DisplayName("ballNumber 검증 1부터 9사이의 숫자만 가능한지 테스트")
    void validNoTest() {
        assertThrows(IllegalArgumentException.class, ()-> new BallNumber(0));
        assertThrows(IllegalArgumentException.class, ()-> new BallNumber(10));
    }

    @Test
    @DisplayName("ball과 ball을 비교하는 테스트")
    void ballCompareTest() {
        computerBall = new Ball(2,3);
        assertThat(computerBall.compare(new Ball(1,2))).isEqualTo(BallStatus.NOTHING);
        assertThat(computerBall.compare(new Ball(2,3))).isEqualTo(BallStatus.STRIKE);
        assertThat(computerBall.compare(new Ball(1,3))).isEqualTo(BallStatus.BALL);
    }
 }
