package org.example;

public class SpaceSplitter implements Splitter{

    private final String SPLITTER = " ";

    private final String formula;
    private String[] splitFormula;

    public SpaceSplitter(String formula) {
        this.formula = formula;
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
