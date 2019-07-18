package com.example.puzzle.hibernatecollectioninvalueobject;

import java.util.Objects;

public class Entity {
    private String id;
    private ValueObject valueObject;

    protected Entity() {
    }

    public Entity(String id, ValueObject valueObject) {
        this.id = id;
        this.valueObject = valueObject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return id.equals(entity.id) && valueObject.equals(entity.valueObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, valueObject);
    }

    @Override
    public String toString() {
        return "Entity{" + "id='" + id + '\'' + ", valueObject=" + valueObject + '}';
    }
}
