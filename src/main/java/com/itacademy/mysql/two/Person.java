package com.itacademy.mysql.two;

import java.time.LocalDate;
//pojo Plain Old Java Object

//Klasa person ce imati svoj
//Java Bean - > no arg (konstruktor bez parametara) konstruktor
//  -> sva polja trea da private
//  -> public getters and setters
//  -> implements Serializable interfejs -> interfejs bez apstraktne metode


public class Person {
    private Integer id;
    private String firstName;
    private String lastName;
    private String nin;
    private LocalDate birthday;


    public Person() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNin() {
        return nin;
    }

    public void setNin(String nin) {
        this.nin = nin;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nin='" + nin + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
