package com.theBongCoder.ORM.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Laptop extends BasicEntity {

    private String brand;

    private String modelNumber;

    @OneToOne
    @JoinTable(name = "studentId")
    private Student student;
}
