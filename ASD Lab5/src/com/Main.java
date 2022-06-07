package com;

public class Main {

    public static void main(String[] args) {


        Student std1 = new Student("Олег", "Данилюк", 2,
                Gender.Male, 24);
        Student std2 = new Student("Сергій", "Кравченко", 1,
                Gender.Male, 36);
        Student std3 = new Student("Олександра", "Степаненко", 3,
                Gender.Female, 45);
        Student std4 = new Student("Ігор", "Мізюрко", 4,
                Gender.Male, 77);
        Student std5 = new Student("Оксана", "Абрамович", 2,
                Gender.Female, 103);
        Student std6 = new Student("Олена", "Гіга", 2,
                Gender.Female, 40);
        System.out.println("Студенти:");
        System.out.println(std1.toString());
        System.out.println(std2.toString());
        System.out.println(std3.toString());
        System.out.println(std4.toString());
        System.out.println(std5.toString());
        System.out.println(std6.toString());
        System.out.println("_______________________________________________");
        Student[] arr = new Student[]{std1, std2, std3, std4, std5, std6};
        Search search = new Search();
        search.binarySearch(arr, 0, 5);
    }
}

