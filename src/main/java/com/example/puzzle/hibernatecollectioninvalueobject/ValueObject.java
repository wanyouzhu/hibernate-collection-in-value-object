package com.example.puzzle.hibernatecollectioninvalueobject;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class ValueObject {
    private Set<String> values;

    protected ValueObject() {
    }

    public ValueObject(String... values) {
        this.values = new LinkedHashSet<>(Arrays.asList(values));
    }

    @Override
    public String toString() {
        return "ValueObject{" + "values=" + values + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValueObject that = (ValueObject) o;
        return Objects.equals(values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values);
    }
}
