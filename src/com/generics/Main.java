package com.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        int counter = 0;

        list.add("abc");
        list.add("xyz");

//        Results in a compiler error
//        list.add(5);

        for (String str : list) {
            // no type casting necessary, avoids ClassCastException

            counter ++;
            System.out.println(counter + ". " + str);
        }

    }
}
