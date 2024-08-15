package org.example;

import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        Worker worker = new Worker();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date date1 = simpleDateFormat.parse("2020-10-15");
        Date date2 = simpleDateFormat.parse("2020-10-11");
        worker.compareTwoDate(date1, date2);

        Worker worker1 = new Worker("Bill Stuard", 24, 45000);
        Worker worker2 = new Worker("Tom Reddl", 35, 50000);
        Worker worker3 = new Teamlead("Rob Staff", 40, 60000, "Electrition");

        List<Worker> listofWorker = new ArrayList<>();

        listofWorker.add(worker1);
        listofWorker.add(worker2);
        listofWorker.add(worker3);

        System.out.println("Лист сотрудников до повышения зарплаты: ");
        for (Worker people: listofWorker){
            System.out.println(people);
        }

        System.out.println();

        Teamlead.addSalary(listofWorker, 3000);

        System.out.println("Лист сотрудников после повышения зарплаты: ");
        for (Worker people: listofWorker){
            System.out.println(people);
        }
    }
}