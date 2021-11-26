package baseballTest;

import domain.Ball;
import domain.Balls;
import domain.PlayResult;
import domain.Referee;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class refereeTest {

    Balls computerBalls =  new Balls(Arrays.asList(1,2,3));

    @Test
    @DisplayName("숫자를 입력하세요")
    void basicOrderTest() {
        Referee referee = new Referee();
        String command = referee.basicOrder();
        assertThat(command).isEqualTo("숫자를 입력해 주세요 : ");
    }

    @Test
    @DisplayName("결과값 출력하기 테스트 (낫싱)")
    void reportResultTest_낫싱() {
        Referee referee = new Referee();
        PlayResult playResult = computerBalls.play(Arrays.asList(4,5,6));
        String command = referee.reportResult(playResult);
        assertThat(command).isEqualTo("낫싱");
    }

    @Test
    @DisplayName("결과값 출력하기 테스트 (%d볼 %d스트라이크)")
    void reportResultTest_2볼_1스트라이크() {
        Referee referee = new Referee();
        PlayResult playResult = computerBalls.play(Arrays.asList(1,3,2));
        String command = referee.reportResult(playResult);
        assertThat(command).isEqualTo("2볼 1스트라이크");
    }

    @Test
    @DisplayName("결과값 출력하기 테스트 (%d볼)")
    void reportResultTest_3볼() {
        Referee referee = new Referee();
        PlayResult playResult = computerBalls.play(Arrays.asList(3,1,2));
        String command = referee.reportResult(playResult);
        assertThat(command).isEqualTo("3볼 ");
    }

    @Test
    @DisplayName("결과값 출력하기 테스트 (%d)")
    void reportResultTest_3스트라이크() {
        Referee referee = new Referee();
        PlayResult playResult = computerBalls.play(Arrays.asList(1,2,3));
        String command = referee.reportResult(playResult);
        assertThat(command).isEqualTo("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }



}
