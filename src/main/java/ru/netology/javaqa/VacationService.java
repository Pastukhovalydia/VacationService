package ru.netology.javaqa;


public class VacationService {
    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int vacationCount = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                vacationCount++; // увеличиваем счётчик месяцев отдыха
                money -= expenses;
                money -= expenses * 3;
            } else {
                money += income;
                money -= expenses;
            }
        }

        return vacationCount;
    }

}
