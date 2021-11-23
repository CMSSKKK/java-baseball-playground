package baseballTest;

import domain.Ball;
import domain.Referee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ballTest {
    // input과 output을 설정하고 비교한다
    // 공의 위치와 숫자가 일치하면 스트라이크
    // 공의 위치가 다르고 숫자가 같으면 볼
    // 공의 위치와 숫자가 모두 다르면 ? 당장은 알 수 없음 (일단 NOTHING으로 처리하기)
    // 볼 객체에 인덱스를 넣어주는 것이 맞는가?
    // list와 list를 비교할때 아웃풋을 무엇으로 주어야 하는가?
    // 결과를 또 하나의 객체에 담는다?
    // 결과 객체에 따라서 메시지를 전송?

    Ball userBall;
    Ball computerBall;

    @Test
    @DisplayName("ball 번호가 1부터 9사이의 수 인지 검증하기")
    void valiNoTest() {
        userBall = new Ball(10);
        assertThat(userBall.isValiNo()).isTrue();
    }

    @Test
    @DisplayName("두 숫자 비교하기")
    void ballCompare() {
        userBall = new Ball(9);
        computerBall = new Ball(9);
        assertThat(userBall.compareNo(computerBall)).isEqualTo(Referee.STRIKE);

    }

    @Test
    @DisplayName("두 공의 인덱스와 숫자 비교하기")
    void ballCompareWithIndex() {

        assertThat(new Ball(8, 1).compareNo(new Ball(8, 1))).isEqualTo(Referee.STRIKE);
        assertThat(new Ball(8, 1).compareNo(new Ball(8, 3))).isEqualTo(Referee.BALL);
        assertThat(new Ball(8, 1).compareNo(new Ball(3, 6))).isEqualTo(Referee.NOTHING);
    }
}
