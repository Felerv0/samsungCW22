package com.samsung.model;

public class Pet {
    private String name, owner, type;

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
}
