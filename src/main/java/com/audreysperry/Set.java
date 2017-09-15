package com.audreysperry;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Set{

    private ArrayList<Integer> setNumbers = new ArrayList<Integer>();


    public void add (int numberToAdd) {
        boolean isNumberInArray = false;
        for (int i = 0; i < setNumbers.size(); i++) {
            if (numberToAdd == setNumbers.get(i)) {
                isNumberInArray = true;
            }
        }
        if (!isNumberInArray) {
            setNumbers.add(numberToAdd);
        }
    }

    public void remove(int numberToRemove) {
        for (int i = 0; i < setNumbers.size(); i++) {
            if (numberToRemove == setNumbers.get(i)) {
                setNumbers.remove(i);
            }

        }
    }

    public Integer getLengthOfNumbers() {
        return setNumbers.size();
    }

    public ArrayList<Integer> values() {
        return setNumbers;
    }
}

