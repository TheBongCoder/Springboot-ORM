package com.theBongCoder.ORM.repository;

import com.theBongCoder.ORM.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
