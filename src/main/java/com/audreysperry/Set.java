package com.audreysperry;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Set{

    private ArrayList<Integer> setNumbers = new ArrayList<Integer>();


    public void add (int numberToAdd) {
        for (int i = 0; i < setNumbers.size(); i++) {
            if (numberToAdd == ) {
                return;
            } else {
                setNumbers.add(numberToAdd);
            }

        }

    }

    public void remove(int numberToRemove) {

    }

    public Integer getLengthOfNumbers() {
        return setNumbers.size();
    }

    public ArrayList<Integer> getSetNumbers() {
        return setNumbers;
    }
}

