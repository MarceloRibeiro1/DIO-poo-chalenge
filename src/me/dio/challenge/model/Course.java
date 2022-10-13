package me.dio.challenge.model;

public class Course extends Content{

    private int workload;

    @Override
    public double calculateXp() {
        return 0;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", workload=" + workload +
                '}';
    }
}
