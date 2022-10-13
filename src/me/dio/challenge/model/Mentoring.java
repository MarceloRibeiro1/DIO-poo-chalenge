package me.dio.challenge.model;

import java.time.LocalDate;

public class Mentoring extends Content {

    private LocalDate date;

    @Override
    public double calculateXp() {
        return XP_AMOUNT + 20d;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
