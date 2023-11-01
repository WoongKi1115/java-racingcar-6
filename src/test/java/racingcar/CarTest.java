package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.Race;
import racingcar.util.CarUtil;
import racingcar.util.RaceUtil;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    void carNameTest() {
        String input = "pobi,woni";
        List<Car> cars = CarUtil.createCar(input);

        List<String> result = cars.stream().map(c -> c.getName()).toList();
        assertThat(result).contains("woni", "pobi");
        assertThat(result).containsExactly("pobi", "woni");
    }



}