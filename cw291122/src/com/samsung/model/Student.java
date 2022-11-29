package com.samsung.model;

import com.samsung.interfaces.Printer;

public class Student extends User implements Printer {
    private String group;

    public Student(String name, String surname, String patronymic, String phone, String group) {
        super(name, surname, patronymic, phone);
        this.group = group;
    }

    public Student(String name, String surname, String patronymic, String group) {
        super(name, surname, patronymic);
        this.group = group;
    }

    public Student(Student student) {
        super(student);
        this.group = student.getGroup();
    }

    public String getGroup() {
        return group;
    }

    public void sayHello() {
        StringBuilder builder = new StringBuilder()
                .append("Привет! Я студен, мое имя ")
                .append(getSurname()).append(" ")
                .append(getName()).append(" ")
                .append(getPatronymic()).append("!");
        System.out.println(builder.toString());
    }

    @Override
    public void printInfoToConsoleSuperKpacuBo() {

    }
}
