package com.example.login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface departmentRepository extends JpaRepository<department, Long>{

}
