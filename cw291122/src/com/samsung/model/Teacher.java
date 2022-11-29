package com.samsung.model;

import com.samsung.interfaces.Printer;

public class Teacher extends User implements Printer {
    private String subject;

    public Teacher(String name, String surname, String patronymic, String phone, String subject) {
        super(name, surname, patronymic, phone);
        this.subject = subject;
    }

    public Teacher(String name, String surname, String patronymic, String subject) {
        super(name, surname, patronymic);
        this.subject = subject;
    }

    public Teacher(Teacher user) {
        super(user);
        this.subject = user.getSubject();
    }

    public String getSubject() {
        return subject;
    }

    public void sayHello() {
        StringBuilder builder = new StringBuilder()
                .append("Здравствуйте! Я преподаватель, мое имя ")
                .append(getName()).append(" ")
                .append(getSurname()).append(" ")
                .append(getPatronymic()).append("! ")
                .append("Я преподаю предмет \"").append(getSubject()).append("\"!");
        System.out.println(builder.toString());
    }

    @Override
    public void printInfoToConsoleSuperKpacuBo() {
        System.out.println("");
    }
}
