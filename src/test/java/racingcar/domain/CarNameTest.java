package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class CarNameTest {

    @Test
    void 차_이름_길이_예외_테스트(){
        assertThatIllegalArgumentException().isThrownBy(
                () -> new CarName("dongHa")
        );
    }

    @Test
    void 띄어쓰기_예외_테스트(){
        assertThatIllegalArgumentException().isThrownBy(
                () -> new CarName("dong ")
        );
    }

    @Test
    void 차_이름_생성_테스트(){
        CarName dong = new CarName("dong");
        assertThat(dong).isNotNull();
    }
}
