package ru.geekbrains.NSipeykin.lesson6;

import java.util.Arrays;

public class Main {

//TODO:
// 1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив. Метод должен
// вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней
// четверки. Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
//    Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//    Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
//
// TODO:
//  2. Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы,
//  то метод вернет false; Если содержится что то кроме 1 и 4, то метод вернет false; Написать набор тестов для этого
//  метода (по 3-4 варианта входных данных).
//            [ 1 1 1 4 4 1 4 4 ] -> true
//            [ 1 1 1 1 1 1 ] -> false
//            [ 4 4 4 4 ] -> false
//            [ 1 4 4 1 1 4 3 ] -> false

    public static void main(String[] args) {
        WorkWithArray work = new WorkWithArray();

        int[] arr1 = { 1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] arr2 = {4, 6, 8, 4, 9, 6, 8, 1, 3, 8, 4, 6};
        int[] arr3 = {8, 7, 4, 9, 5, 1, 9, 6, 9, 8, 4, 9, 8, 4, 3, 5, 4};
        int[] arr4 = {6, 8, 7, 9, 8, 5, 1, 9, 8, 7, 6, 5 };

        int[] arr5 = {1, 1, 1, 4, 4, 1, 4, 4};
        int[] arr6 = {1, 1, 1, 1, 1, 1};
        int[] arr7 = {4, 4, 4, 4};
        int[] arr8 = {1, 4, 4, 1, 1, 4, 3};

        System.out.println(Arrays.toString( work.getPartOfArray(arr1)));
        System.out.println(Arrays.toString( work.getPartOfArray(arr2)));
        System.out.println(Arrays.toString( work.getPartOfArray(arr3)));
        //System.out.println(Arrays.toString( work.getPartOfArray(arr4))); //throw exception

        System.out.println(work.checkArrayFor1And4(arr5));
        System.out.println(work.checkArrayFor1And4(arr6));
        System.out.println(work.checkArrayFor1And4(arr7));
        System.out.println(work.checkArrayFor1And4(arr8));
    }
}
