package org.step2.condition;

import java.util.Random;

public class RandomCondition implements Condition {

    private boolean condition;

    // Random 은 static 으로 만들어 두고 하나만 사용해도 될 것 같은데..
    private final Random random;

    public RandomCondition() {
        this.random = new Random();
    }

    private boolean judgeRandomCondition() {
        return random.nextInt(10) >= 4;
    }

    @Override
    public boolean getConditionValue() {
        this.condition = judgeRandomCondition();
        return this.condition;
    }
}
