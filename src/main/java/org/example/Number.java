package org.example;

import java.math.BigDecimal;

public interface Number {

//    숫자 자료형이 int, double 상관 없이 내부적으로 validate 를 항상 하게 될텐데
//    interface 로는 private 를 사용할 수 없으니 어떻게 처리하면 좋을까?
//    private void validateNumber();

//    void convertToNumber(String stringNumber);

    // 숫자 자료형은 int 뿐만 아니라 double, float, BigDecimal 등이 올 수 있는데
    // 어떻게 추상화를 하면 좋을까?
    Integer getNumber();
}
