package org.example;

public class SpaceSplitter implements Splitter{

    private final String SPLITTER = " ";

    private final String formula;
    private String[] splitFormula;

    public SpaceSplitter(String formula) {
        this.formula = formula;
        // 굳이 메소드를 따로 만들 필요가 있을까? 싶기도 함
        this.splitFormula();
    }

    @Override
    public String[] getSplitResult() {
        return this.splitFormula;
    }

    private void splitFormula() {
        this.splitFormula = this.formula.split(SPLITTER);
    }
}
