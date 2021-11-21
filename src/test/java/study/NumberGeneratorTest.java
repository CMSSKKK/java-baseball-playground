package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;
import ver2.NumberGenerater;

import java.util.List;

public class NumberGeneratorTest {

    NumberGenerater numberGenerater = new NumberGenerater();

    @Test
    @DisplayName("numberGenerator.setlist()")
    void setListTest() {
        numberGenerater.setList();
        Assertions.assertThat( numberGenerater.getList().size()).isEqualTo(3);
    }

    @Test
    @DisplayName("numberGenerator.stringToList()")
    void stringToListTest() {
        List<Integer> list = numberGenerater.StringToList("123");

        Assertions.assertThat(list.get(0)).isEqualTo(1);
        Assertions.assertThat(list.get(1)).isEqualTo(2);
        Assertions.assertThat(list.get(2)).isEqualTo(3);
    }
}
