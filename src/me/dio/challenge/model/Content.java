package me.dio.challenge.model;

public abstract class Content {
    String title;
    String description;
    protected static final double XP_AMOUNT = 10d;

    public abstract double calculateXp();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
