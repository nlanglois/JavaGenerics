package com.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("abc");
        list.add(new Integer(5));

        for (Object obj: list) {
            // type casting leading to ClassCastException at runtime
            String str = (String) obj;
        }

    }
}
