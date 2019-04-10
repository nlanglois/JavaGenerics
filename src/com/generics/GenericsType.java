package com.generics;

public class GenericsType<T> {

    private T t;

    public T get () {
        return this.t;
    }

    public void set (T t) {
        this.t = t;
    }

    public static void main (String args[]) {

        GenericsType<String> type = new GenericsType<>();
        type.set("Nikolai"); // valid

        GenericsType type1 = new GenericsType(); // raw type
        type1.set("Abigail"); // valid
        type1.set(10); // valid and autoboxing support

    }

}
