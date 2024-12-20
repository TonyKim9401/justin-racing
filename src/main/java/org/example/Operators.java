package org.example;

import java.util.List;

public class Operators {

    private final List<Operator> operators;

    public Operators(List<Operator> operators) {
        this.operators = operators;
    }

    public Operator getOperator() {
        if (operators.isEmpty()) {
            throw new NullPointerException("No more operators exist");
        }
        Operator operator = operators.get(0);
        operators.remove(0);
        return operator;
    }
}
