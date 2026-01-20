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

    public Person setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public Person setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Person setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
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
