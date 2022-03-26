package ru.ssau.tk.dmitriy.programmingtechnologies.Client.GameProcess;

import java.util.LinkedList;

public class CityDatabase {
    private final LinkedList<String> listOfCities;

    public CityDatabase() {
        listOfCities = new LinkedList<String>();
    }

    //TODO:сделать броски исключения еще, если вдруг проверка не пройдена и город уже есть в списке
    public boolean addString(String string) {
        if (listOfCities.contains(string)) {
            return false;
        }
        listOfCities.add(string);
        return true;
    }

    //public boolean containsString(String string) {
    //    return listOfCities.contains(string);
    //}
}
