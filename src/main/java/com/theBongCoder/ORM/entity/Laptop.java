package com.theBongCoder.ORM.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Laptop extends BasicEntity {

    private String brand;

    private String modelNumber;

    @OneToOne
    private Student student;
}
