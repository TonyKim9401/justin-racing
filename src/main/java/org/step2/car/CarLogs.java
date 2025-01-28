package org.step2.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * CarLogs 의 응집성을 위해 일글 컬렉션으로 처리
 */
public class CarLogs {

    private final List<CarLog> carLogs = new ArrayList<>();

    public List<CarLog> getCarLogs() {
        return Collections.unmodifiableList(this.carLogs);
    }

    public void addNewCarLog(CarLog carLog) {
        this.carLogs.add(carLog);
    }

    public CarLog getCarLogByTryCount(Integer tryCount) {
        return this.carLogs.get(tryCount);
    }
}
