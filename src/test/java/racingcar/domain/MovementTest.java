package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class MovementTest {

    @Test
    void 이동_객체_생성_테스트(){
        Movement movement = new Movement();
        assertThat(movement).isNotNull();
    }

    @ParameterizedTest
    @ValueSource(ints = {4,5,6,7,8,9})
    void 이동_테스트(int value){
        Movement movement = new Movement();
        movement.moving(value);
        assertThat(movement.getDistance()).isEqualTo(1);
    }

    @ParameterizedTest
    @ValueSource(ints = {0,1,2,3})
    void 멈춤_테스트(int value){
        Movement movement = new Movement();
        movement.moving(value);
        assertThat(movement.getDistance()).isEqualTo(0);
    }
}
