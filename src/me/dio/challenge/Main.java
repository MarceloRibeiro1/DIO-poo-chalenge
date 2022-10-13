package me.dio.challenge;

import me.dio.challenge.model.Bootcamp;
import me.dio.challenge.model.Course;
import me.dio.challenge.model.Dev;
import me.dio.challenge.model.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Course course1 = new Course();
        course1.setTitle("Course Java");
        course1.setDescription("Course description");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("Course JavaScript");
        course2.setDescription("Course 2 description");
        course2.setWorkload(4);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Mentoring Java");
        mentoring.setDescription("Mentoring description");
        mentoring.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java");
        bootcamp.setDescription("Bootcamp description");
        bootcamp.getContentSet().add(course1);
        bootcamp.getContentSet().add(course2);
        bootcamp.getContentSet().add(mentoring);

        Dev dev1 = new Dev();
        dev1.setName("Dev Camila");
        dev1.bootcampSubscribe(bootcamp);
        System.out.println("Subscribed contents " + dev1.getName() + ": " + dev1.getRegisteredContent());
        dev1.progress();
        System.out.println("--");
        System.out.println("Subscribed contents " + dev1.getName() + ": " + dev1.getRegisteredContent());
        System.out.println("Finished contents " + dev1.getName() + ": " + dev1.getFinishedContent());
        System.out.println(dev1.calculateTotalXp());


        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------");

        Dev dev2 = new Dev();
        dev2.setName("Dev Marcelo");
        dev2.bootcampSubscribe(bootcamp);
        System.out.println("Subscribed contents " + dev2.getName() + ": " + dev2.getRegisteredContent());
        dev2.progress();
        System.out.println("--");
        System.out.println("Subscribed contents " + dev2.getName() + ": " + dev2.getRegisteredContent());
        System.out.println("Subscribed contents " + dev2.getName() + ": " + dev2.getFinishedContent());
        System.out.println(dev2.calculateTotalXp());


    }
}
