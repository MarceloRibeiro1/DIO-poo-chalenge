package me.dio.challenge.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate initialDate = LocalDate.now();
    private final LocalDate finalDate = initialDate.plusDays(45);
    private Set<Dev> devSet = new HashSet<>();
    private Set<Content> contentSet = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(initialDate, bootcamp.initialDate) && Objects.equals(finalDate, bootcamp.finalDate) && Objects.equals(devSet, bootcamp.devSet) && Objects.equals(contentSet, bootcamp.contentSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, initialDate, finalDate, devSet, contentSet);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<Dev> getDevSet() {
        return devSet;
    }

    public void setDevSet(Set<Dev> devSet) {
        this.devSet = devSet;
    }

    public Set<Content> getContentSet() {
        return contentSet;
    }

    public void setContentSet(Set<Content> contentSet) {
        this.contentSet = contentSet;
    }
}
