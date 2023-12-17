package com.theBongCoder.ORM.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student extends BasicEntity {

    private String name;

    private String about;

    @OneToOne(mappedBy = "student", optional = false, cascade = CascadeType.ALL)
    private Laptop laptop;

}
