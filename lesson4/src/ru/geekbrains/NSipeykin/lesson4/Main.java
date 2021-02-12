package ru.geekbrains.NSipeykin.lesson4;

public class Main {

//TODO:
// 1. Создать три потока, каждый из которых выводит определенную букву (A, B и C) 5 раз (порядок – ABСABСABС). Используйте wait/notify/notifyAll.

    static Object monitor = new Object();
    static volatile int currentNum = 1;
    static final int num = 5;

    public static void main(String[] args) {
        printCharacter(1,'A');
        printCharacter(2,'B');
        printCharacter(3,'C');
    }

    private static void printCharacter(int monitoringNumber, char character){
        new Thread(()->{
            try {
                for (int i = 0; i < num; i++) {
                    synchronized (monitor){
                        while (currentNum != monitoringNumber){
                            monitor.wait();
                        }
                        System.out.print(character);
                        if (monitoringNumber == 3){
                            System.out.println(); //сделал перенос строки для наглядности
                            currentNum = 1;
                        }else {
                            currentNum = monitoringNumber + 1;
                        }
                        monitor.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}