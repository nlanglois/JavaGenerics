package com.generics;

public class GenericsTypeOld {

    private Object t;

    public Object get () {
        return this.t;
    }

    public void set (Object t) {
        this.t = t;
    }

    public static void main (String args[]) {
        GenericsTypeOld type = new GenericsTypeOld();

        type.set("Nikolai");

        // type casting, error prone and can cause ClassCastException errors
        String str = (String) type.get();
        System.out.println(str);
    }
}
