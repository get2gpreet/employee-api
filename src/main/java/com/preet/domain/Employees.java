package com.preet.domain;

import com.preet.dto.EmployeeTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Employees {

    List<EmployeeTO> employees;
}
