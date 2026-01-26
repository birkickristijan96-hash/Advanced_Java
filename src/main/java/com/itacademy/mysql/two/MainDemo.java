package com.itacademy.mysql.two;

import javax.swing.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *  KADA se povezujemo s bazom podataka (MySQL, Postgres, Oracle..) iz Java Programa:
 *  1.Povezati se na izvor podataka : BAZA -> connection
 *  2.Slati SQl upit(SELECT FROM persons) -> statment, PreparedStatment -> misli se na upit
 *  3.Evaluirati rezultat upita -> ResultSet
 *
 *  JDBC API - to je samo set interfacea ne njihovih implemnetacija
 *  Driver -> koji implementira te interfejse definirane u JDBC bibliotieci
 *      S kakvim bazama radimo takav nam driver treba:
 *          -> MySQL driver
 *          Oracle Driver... itd
 *          Postgres driver
 *
 */



//MYSQL server : localhost:3306
//lcalhost:3306
//port jedinstveno indentifikuje
public class MainDemo {
    public static void main(String[] args) {
        /**
         * da bi ostvario konekciju s bazom :potrebno je da znm:
         *  -> gdje je baza : URL ili adresa konekcija
         *  -> username : root   znaci moramo imati pravo pristupa
         *  -> password : route
         */
        List<Person> personList = null;
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "route");
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM persons");
             ResultSet resultSet = preparedStatement.executeQuery();) {
            personList = new ArrayList<>();
            while (resultSet.next()) {
                Person person = new Person();
                Integer id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String nin = resultSet.getString("nin");
                Date birhdate = resultSet.getDate("birthday");
                LocalDate birthday = birhdate.toLocalDate();  //ovdje se desila konverzija

                person.setId(id);
                person.setFirstName(firstName);
                person.setLastName(lastName);
                person.setNin(nin);
                person.setBirthday(birthday);

                personList.add(person); //personList.add je dodao person list u person objekat koji je u zagradama,
                // stavio vrijednostu vrijabli person
            }

//                for (Person person: personList){
//                    System.out.println(person);
//                }
//
//            }
//            personList.forEach(System.out::println);


            } catch(SQLException e){
                System.out.println(e.getMessage());
            }
            PersonTable personTable = new PersonTable(personList);
            JTable tableView = personTable.toTableView();
            JFrame frame = new JFrame("Persons");
            JScrollPane scrollPane = new JScrollPane(tableView);
            frame.add(scrollPane);
            frame.setSize(800, 400);
            frame.setVisible(true);
                }
         }




