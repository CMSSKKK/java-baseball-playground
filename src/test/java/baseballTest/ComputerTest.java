package baseballTest;

import domain.Computer;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {
    Computer computer = new Computer();

    @Test
    @DisplayName("숫자 1부터 9사이의 랜덤 숫자를 사이즈 3의 리스트로 만든다")
    void generateNumberTest() {

        assertThat(computer.balls().size()).isEqualTo(3);
    }

    @Test
    @DisplayName("user의 세자리 숫자 입력을 리스트로 변환 검증")
    void userInputToBalls() {
        assertThat(computer.userInputToBall("123")).isEqualTo(Arrays.asList(1, 2, 3));
    }

    @Test
    @DisplayName("user의 입력 검증")
    void userInputValidTest() {
        assertThat(computer.userInputIsValid("123")).isTrue();
        assertThat(computer.userInputIsValid("1234")).isFalse();
        assertThat(computer.userInputIsValid("023")).isFalse();
    }

    @ParameterizedTest
    @DisplayName("user 입력 IllegalArgumentException test")
    @ValueSource(strings = {"1234","023","09123"})
    void userInputToBallsExceptionTest(String values) {
        assertThrows(IllegalArgumentException.class, () -> computer.userInputToBall(values));
    }
}
