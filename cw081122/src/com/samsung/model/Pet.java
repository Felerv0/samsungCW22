package com.samsung.model;

public class Pet {
    private String name;
    private String owner;
    private String type;
    private String[] dates = new String[10];
    private int count;

    public Pet(String name, String owner, String type) {
        this.name = name;
        this.owner = owner;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\n"
                + "Владелец: " + owner + "\n"
                + "Тип: " + type;
    }

    public void addVisit(String date) {
        if (count >= dates.length) {
            String[] arr = new String[count + 1000];
            System.arraycopy(dates, 0, arr, 0, dates.length);
            dates = new String[count + 1000];
            if (count >= 0) System.arraycopy(arr, 0, dates, 0, count);
        }
        dates[count] = date;
        count++;
    }

    public void printVisits() {
        System.out.println("Последние посещения:");
        for (int i = 0; i < count; i++) {
            System.out.println(i + 1 + ") " + dates[i]);
        }
    }

    public void printVisits(int k) {
        if (k > count) {
            System.out.println("Вы посетили клинику всего " + k + " раз!");
            return;
        }
        System.out.println("Последние " + k + " посещений:");
        for (int i = count - k - 1; i < count; i++) {
            System.out.println(i + 1 + ") " + dates[i]);
        }
    }
}
