package ru.geekbrains.NSipeykin.lesson6;

import java.util.Arrays;

public class WorkWithArray {

    public static int[] getPartOfArray(int[] arr) throws RuntimeException {
        if (arr.length == 0) {
            throw new NullPointerException();
        }

        int lastIndexOf4 = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) lastIndexOf4 = i + 1;
        }

        if (lastIndexOf4 == -1) {
            throw new RuntimeException();
        }

        else {
            return Arrays.copyOfRange(arr, lastIndexOf4, arr.length);
        }
    }

    public boolean checkArrayFor1And4(int[] arr) {
        int count1 = 0, count4 = 0;
        for (int x : arr) {
            if (x == 1) {
                count1++;
            }
            else if (x == 4) {
                count4++;
            }
            else {
                return false;
            }
        }

        return (count1 > 0 && count4 > 0);
    }
}
