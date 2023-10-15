package ru.netology.javaqa;

import org.junit.jupiter.api.Test;


public class VacationServiceTest {
    @Test
    public void calculateVacationMonths () {
        VacationService vacationService = new VacationService();

        int income1 = 10000;
        int expenses1 = 3000;
        int threshold1 = 20000;

        int result1 = vacationService.calculateVacationMonths(income1, expenses1, threshold1);
        System.out.println("Expected result: 3");
        System.out.println("Actual result: " + result1);

        int income2 = 100000;
        int expenses2 = 60000;
        int threshold2 = 150000;

        int result2 = vacationService.calculateVacationMonths(income2, expenses2, threshold2);
        System.out.println("Expected result: 2");
        System.out.println("Actual result: " + result2);
    }


}
