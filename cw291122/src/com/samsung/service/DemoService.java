package com.samsung.service;

import com.samsung.model.Student;
import com.samsung.model.Teacher;

public class DemoService {
    private University university;

    public DemoService() {}

    public DemoService(University university) {
        this.university = university;
    }

    public void demo() {
        System.out.println("Демонстрация классов студентов и учителей");
        Student s1 = new Student("Михаил", "Гагарин", "Вячеславович", "Группа 1");
        s1.sayHello();
        Student s2 = new Student(s1);
        s2.sayHello();
        Student s3 = new Student("Майкл", "Джексон", "Валерьевич", "123456789", "Группа Рокеров");
        s3.sayHello();
        Teacher t1 = new Teacher("Марина", "Абророва", "Ивановна", "Немецкий язык");
        t1.sayHello();
        Teacher t2 = new Teacher(t1);
        t2.sayHello();

        System.out.println("\nДемонстрация работы класса университет");
        Teacher[] t = new Teacher[6];
        t[0] = t1;
        t[1] = new Teacher("Акакий", "Акакиев", "Акакиевич", "1234151511", "Математика");
        t[2] = new Teacher("Кто-то", "Кто-тов", "Кто-тоиевич", "Информатика");
        t[3] = new Teacher("Елена", "Иванова", "Александровна", "2281488123", "Химия");
        t[4] = new Teacher("Курсед", "Имморталов", "Аегисович", "666555111777", "Физкультура");
        t[5] = new Teacher("Игорь", "Летов", "Фёдорович", "12345678", "Музыка");
        Student[] s = new Student[4];
        s[0] = s1;
        s[1] = s3;
        s[2] = new Student("Игорь", "Русланов", "Игоревич", "группа 3");
        s[3] = new Student("Егор", "Панченков", "Ринатович", "1221122112", "группа Солнышки");
        university = new University("Улица Пушкина, дом Колотушкина", s, t);
        university.printInfoToConsoleSuperKpacuBo();
    }
}
