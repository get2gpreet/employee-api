package com.preet.repository;

import com.preet.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDAO extends JpaRepository<EmployeeEntity, Integer> {

}
