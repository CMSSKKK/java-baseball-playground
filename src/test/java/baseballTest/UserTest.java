package baseballTest;

import domain.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class UserTest {

    @Test
    @DisplayName("user 객체 생성")
    void gameStartTest() {
        User user = new User();
        assertThat(user.playingGame()).isTrue();
    }
    @Test
    @DisplayName("user의 게임 진행 의사 표현")
    void gameRestartTest() {
        User user = new User();
        user.restart("2");
        assertThat(user.playingGame()).isFalse();
        user.restart("1");
        assertThat(user.playingGame()).isTrue();
    }
}
