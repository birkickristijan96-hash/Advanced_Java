package com.itacademy.six.Demo;

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;

public class Person extends Object {
    private String name;
    private  String surname;
    private Gender gender;
    private LocalDate birthday;

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        LocalDate today = LocalDate.now();
        Period period = birthday.until(today);
        int age = period.getYears();
        return age;
    }

    @Override
    public String toString() {
        return  "%s %s - %s gender = %s".formatted(name, surname, birthday, gender);
    }
}
