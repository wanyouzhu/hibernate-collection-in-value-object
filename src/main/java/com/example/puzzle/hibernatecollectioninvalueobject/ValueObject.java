package com.example.puzzle.hibernatecollectioninvalueobject;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class ValueObject {
    private String simpleValue;
    private AnotherEntity anotherEntity;
    private Set<String> values;

    protected ValueObject() {
    }

    public ValueObject(String simpleValue, AnotherEntity anotherEntity, String... values) {
        this.simpleValue = simpleValue;
        this.anotherEntity = anotherEntity;
        this.values = new LinkedHashSet<>(Arrays.asList(values));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValueObject that = (ValueObject) o;
        return simpleValue.equals(that.simpleValue) && anotherEntity.equals(that.anotherEntity) && values.equals(that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(simpleValue, anotherEntity, values);
    }

    @Override
    public String toString() {
        return "ValueObject{simpleValue='" + simpleValue + '\'' + ", anotherEntity=" + anotherEntity + ", values=" + values + '}';
    }
}
