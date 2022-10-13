package me.dio.challenge;

import me.dio.challenge.model.Course;
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
    }

}
