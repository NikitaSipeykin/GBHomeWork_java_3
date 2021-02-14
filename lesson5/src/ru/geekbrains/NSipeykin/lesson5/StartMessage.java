package ru.geekbrains.NSipeykin.lesson5;

public class StartMessage implements Runnable{
    @Override
    public void run() {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
    }
}
