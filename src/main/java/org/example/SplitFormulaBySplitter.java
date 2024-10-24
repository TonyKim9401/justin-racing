package org.example;

class SplitFormulaBySplitter implements SplitFormula {

    private String inputValue;
    private String splitter;

    public SplitFormulaBySplitter(String inputValue, String splitter) {
        this.inputValue = inputValue;
        this.splitter = splitter;
    }

    @Override
    public String[] splitInputValue() {
        return this.inputValue.split(this.splitter);
    }
}
