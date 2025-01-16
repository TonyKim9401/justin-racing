package org.step2.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.step2.condition.Condition;

/**
 * RacingCar 를 사용하는 일급클래스
 */
public class RacingCars {

    private final List<RacingCar> cars = new ArrayList<>();

    /**
     * for 문 사용으로 인덱스 i를 사용해 자동차의 번호를 정한다.
     * -> stream 사용 안한 이유
     * 미리 입력 값을 받아서 객체로 넘긴다는게 Integer 값을 직접 받는다는게 맞을지?
     */
    public RacingCars(Integer carCount, Condition condition) {
        for (int i = 0; i < carCount; i++) {
            this.cars.add(new RacingCar(i, condition));
        }
    }

    /**
     * 방어적 복사 -> 내용은 같되 새로운 객체를 반환하여 원본 객체의 값을 보호함
     * https://velog.io/@max9106/Java-%EB%B0%A9%EC%96%B4%EC%A0%81-%EB%B3%B5%EC%82%ACDefensive-copy
     */
    public List<RacingCar> getCars() {
        return Collections.unmodifiableList(cars);
    }

    public List<CarLog> getCarLogByTryCount(Integer tryCount) {
        return this.cars.stream()
                .map(car -> car.getCarLogByTryCount(tryCount))
                .toList();
    }
}
