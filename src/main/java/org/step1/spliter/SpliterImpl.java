package org.step1.spliter;

public class SpliterImpl implements Spliter{

    private static final String SPLIT_STANDARD = " ";

    @Override
    public String[] splitInsertValue(String input) {
        return input.split(SPLIT_STANDARD);
    }
}
