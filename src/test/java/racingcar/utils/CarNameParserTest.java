package racingcar.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarNameParserTest {

    @Test
    void 이름_Parser_테스트(){
        String carNameStr = "dong,kim,bro";
        String[] names = CarNameParser.parseCarName(carNameStr);

        Assertions.assertThat(names.length).isEqualTo(3);
    }
}
