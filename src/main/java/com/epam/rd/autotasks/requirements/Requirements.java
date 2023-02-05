package com.epam.rd.autotasks.requirements;

public class Requirements {
    public static <T> T requireNonNull(T obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
        return obj;
    }

    public static <T> T requireNonNull(T obj, String message) {
        if (obj == null) {
            throw new NullPointerException(message);
        }
        return obj;
    }

    public static void checkArgument(boolean expression) {
        if (!expression) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkArgument(boolean expression, String message) {
        if (!expression) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void checkState(boolean expression) {
        if (!expression) {
            throw new IllegalStateException();
        }
    }

    public static void checkState(boolean expression, String message) {
        if (!expression) {
            throw new IllegalStateException(message);
        }
    }

    public static void checkIndex(int index, int size) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
}
/*
* The requireNonNull methods check if an object is null and throw
*  a NullPointerException with an optional message if it is.

The checkArgument and checkState methods check if a boolean expression is true or false,
*  and throw an IllegalArgumentException or IllegalStateException with an optional message
*  if the expression is false.

The checkIndex method checks if an index is
* within the bounds of an array or collection, and throws an IndexOutOfBoundsException
*  if the index is out of bounds.*/
