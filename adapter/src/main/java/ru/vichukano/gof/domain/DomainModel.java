package ru.vichukano.gof.domain;

public class DomainModel {
    private final int id;
    private final String name;

    public DomainModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "DomainModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
