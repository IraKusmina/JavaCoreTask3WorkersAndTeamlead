package org.example;

import java.util.List;

public class Teamlead extends Worker{
    String otdel;

    public Teamlead(String nameSurname, int age, int salary, String otdel){
        super(nameSurname, age, salary);
        this.otdel = otdel;
    }

    public static void addSalary(List<Worker> listofWorker, int size){
        for (Worker worker: listofWorker) {
            if (!(worker instanceof Teamlead)) {
                worker.setSalary(worker.getSalary() + size);
            }
        }
    }
}
