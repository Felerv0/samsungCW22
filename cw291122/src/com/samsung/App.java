package com.samsung;

import com.samsung.model.Student;
import com.samsung.model.Teacher;

public class App {
    public static void main(String[] args) {
        Student s = new Student("1", "2", "3", "4");
        s.sayHello();
        Student s1 = new Student(s);
        s1.sayHello();
        Teacher t1 = new Teacher("Марина", "Абророва", "Ивановна", "Немецкий язык");
        t1.sayHello();
        Teacher t2 = new Teacher(t1);
        t2.sayHello();
    }
}
