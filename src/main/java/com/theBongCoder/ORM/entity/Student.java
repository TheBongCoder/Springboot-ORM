package com.theBongCoder.ORM.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student extends BasicEntity {

    private String name;

    private String about;


    @OneToOne(mappedBy = "student")
    private Laptop laptop;
}
