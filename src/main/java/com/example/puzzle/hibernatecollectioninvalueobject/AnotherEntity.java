package com.example.puzzle.hibernatecollectioninvalueobject;

import java.util.Objects;

public class AnotherEntity {
    private String id;
    private String name;

    protected AnotherEntity() {
    }

    public AnotherEntity(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnotherEntity that = (AnotherEntity) o;
        return id.equals(that.id) &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "AnotherEntity{id='" + id + '\'' + ", name='" + name + '\'' + '}';
    }
}
