package me.dio.challenge.model;

import java.util.*;
import java.util.stream.DoubleStream;

public class Dev {
    private String name;
    private Set<Content> registeredContent = new LinkedHashSet<>();
    private Set<Content> finishedContent = new LinkedHashSet<>();

    public void bootcampSubscribe(Bootcamp bootcamp) {
        this.registeredContent.addAll(bootcamp.getContentSet());
        bootcamp.getDevSet().add(this);
    }

    public void progress() {
        Optional<Content> firstContent = this.registeredContent.stream().findFirst();
        if (firstContent.isPresent()) {
            this.finishedContent.add(firstContent.get());
            this.registeredContent.remove(firstContent.get());
        } else {
            System.err.println("Dev not subscribed to Bootcamp " + this.name);
        }
    }

    public double calculateTotalXp() {
        Iterator<Content> it = this.registeredContent.iterator();
        double total = 0;
        while (it.hasNext()) {
            double x = it.next().calculateXp();
            total += x;
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getRegisteredContent() {
        return registeredContent;
    }

    public void setRegisteredContent(Set<Content> registeredContent) {
        this.registeredContent = registeredContent;
    }

    public Set<Content> getFinishedContent() {
        return finishedContent;
    }

    public void setFinishedContent(Set<Content> finishedContent) {
        this.finishedContent = finishedContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(registeredContent, dev.registeredContent) && Objects.equals(finishedContent, dev.finishedContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, registeredContent, finishedContent);
    }
}
