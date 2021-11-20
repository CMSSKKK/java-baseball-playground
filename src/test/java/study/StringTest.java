package study;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String s= "1,2";
        String[] str = s.split(",");
        assertThat(str).contains("1");
        assertThat(str).containsExactly("1","2");

    }

    @Test
    void split2() {
        String s = "1";
        String[] arr = s.split(",");
        assertThat(arr).contains("1");
    }

    @Test
    void substr() {
        String s = "(1,2)";
        s = s.substring(1,s.length()-1);
        assertThat(s).isEqualTo("1,2");
    }

    @Test
    void charat() {
        String s = "abc";

        assertThatThrownBy(() -> {
            char c= s.charAt(5);
        }).isInstanceOf(StringIndexOutOfBoundsException.class);
        Assertions.assertThrows(StringIndexOutOfBoundsException.class, () -> s.charAt(5));
    }
}
