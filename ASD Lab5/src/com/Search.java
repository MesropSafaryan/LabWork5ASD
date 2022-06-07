package com;

import java.util.ArrayList;

public class Search {
    public void binarySearch(Student[] array, int first, int last) {
        int position;
        int comparisonCount = 1;
        position = (first + last) / 2;

        while ((array[position].GetSkippedLesson() <= 100) && (first <= last)) {
            comparisonCount++;
            if (array[position].GetSkippedLesson() >= 100) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println("Студентом з 100 і більше пропущених годин занять це:\n" +
                    array[position].toString());
            System.out.println("Метод бінарного пошуку знайшов студента після " + comparisonCount +
                    " порівнянь");
        } else {
            System.out.println("Такого студента немає, метод бінарного пошуку завершив роботу після "
                    + comparisonCount + " порівнянь");
        }
    }
}
