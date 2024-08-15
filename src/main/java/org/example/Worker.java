package org.example;

import java.util.Date;
import java.util.List;

public class Worker {
    String nameSurname;
    int age;
    int salary;

    public void compareTwoDate(Date date1, Date date2){
        System.out.println("Перва дата меньше второй: " + date1.before(date2));
    }

    String getNameSurname() {
        return nameSurname;
    }

    void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getSalary() {
        return salary;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    public static void addSalary(List<Worker> listWorker, int size){
        for (Worker worker: listWorker){
            worker.setSalary(worker.getSalary() + size);
        }
    }

    public Worker(String nameSurname, int age, int salary){
        this.nameSurname = nameSurname;
        this.age = age;
        this.salary = salary;
    }

    public Worker(){

    };

    @Override
    public String toString() {
        return "Имя: " + nameSurname + ", Возраст: " + age +
                ", Зарплата: " + salary;
    }
}
