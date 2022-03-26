package ru.ssau.tk.dmitriy.programmingtechnologies.Client.GameProcess;

public class ConsoleOutput {
    public static void printString(String string) {
        System.out.println("Город оппонента - " + string + ". Вам на " + string.charAt(string.length() - 1));
    }
}
