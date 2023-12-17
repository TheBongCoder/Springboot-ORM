package com.theBongCoder.ORM;

import com.theBongCoder.ORM.entity.Laptop;
import com.theBongCoder.ORM.entity.Student;
import com.theBongCoder.ORM.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class OrmApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(OrmApplication.class, args);
    }


    public void run(String... args) {

        Student student = new Student();
        student.setName("sukesh");
        student.setAbout("java developer");

        Laptop laptop = new Laptop();
        laptop.setBrand("Acer");
        laptop.setModelNumber("Aspire 3");
        student.setLaptop(laptop);
        laptop.setStudent(student);
        studentRepository.save(student);
    }

}
