package ru.geekbrains.NSipeykin.lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Shuffler<T> {

    public void ShuffleElements(T[] arr, int i, int j ) {
        T obj = arr[i];
        arr[i] = arr[j];
        arr[j] = obj;
    }

    public <T>ArrayList<T> converterArrays(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }
}

