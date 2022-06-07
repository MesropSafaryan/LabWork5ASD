package com;
import java.util.Objects;
public class Student {

    private final String name;
    private final String surname;
    private final int course;
    private final Gender gender;
    private final int skippedLesson;


    public Student(String _name, String _surname, int _course, Gender _gender, int _skippedLesson) {
        name = _name;
        surname = _surname;
        course = _course;
        gender = _gender;
        skippedLesson = _skippedLesson;
    }


    public String GetName() {
        return name;
    }
    public String GetSurname() {
        return surname;
    }
    public int GetCourse() {
        return course;
    }
    public Gender GetGender() {
        return gender;
    }
    public int GetSkippedLesson() {
        return skippedLesson;
    }

    public String toString(){
        return "Студент: { ім'я: "+ name + "; прізвище: "+ surname + "; курс: "+ course +
                "; стать: "+ gender + "; к-сть пропущених годин: "+ skippedLesson +"}";
    }

}
