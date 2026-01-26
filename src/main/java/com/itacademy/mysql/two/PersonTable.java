package com.itacademy.mysql.two;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class PersonTable {

    private final List<Person> personList;

    public PersonTable(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    //u swingu standrad to se radi ovako -> pofledaj ispod -> poveznica za vizualni prikaz
    //JTable <- kako ce se modelirati prikazivanje podataka DefaultTableModel, koja se poveze na imena kolona i podatke
    //prdstavlja most izmedu ucitane liste i ove tabele
    public JTable toTableView (){

        String[] columnNames={"ID", "First Name", "Last Name", "JMBG", "Birthday"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        for (Person person : personList){
            Object [] row = {person.getId(), person.getFirstName(), person.getLastName(), person.getNin(), person.getBirthday()};
            model.addRow(row);
        }
        JTable table = new JTable();
        return table;
    }
}
