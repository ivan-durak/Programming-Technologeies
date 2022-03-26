package ru.ssau.tk.dmitriy.programmingtechnologies.Client.GameProcess;

import java.util.Scanner;

public class ConsoleInput {
    private final CityDatabase cityDatabase;
    private final Scanner input = new Scanner(System.in);//TODO:подумать когда закрывать, возможно где-то поставить вместе с try-with-resources

    public ConsoleInput(CityDatabase cityData) {
        cityDatabase = cityData;
        //TODO:создать класс, из которого будет вызываться этот и ConsoleOut-
        //put, для сохранения единственности cityDatabase
    }

    public void readLine() {//TODO:подумать над параметрами, нужны ли какие-нибудь здесь?
        //TODO:подумать над возвращаемым значением String или void
        String string;
        System.out.println("Ваш ход. Введите город:\t");
        while (true) {
            string = input.nextLine();
            if (cityDatabase.addString(string)) {
                System.out.println("Мы запомнили ваш город. Переход хода");
                break;
            } else {
                System.out.println("Этот город уже был назван ранее, введите другой.");
            }
        }
    }
    //TODO:игрок должен снова получать возможность вводить только после того как
    //сервер снова передал ему право(ход)
}
