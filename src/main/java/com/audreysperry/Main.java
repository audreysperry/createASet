package com.audreysperry;

public class Main {

    public static void main(String[] args) {

        Set mySet = new Set();
        mySet.add(12);
        mySet.add(12);
        mySet.add(14);
        mySet.remove(14);

        System.out.println(mySet.values());
        System.out.println(mySet.getLengthOfNumbers());
    }
}
