package com.preet.service;

import com.preet.dto.EmployeeTO;

import java.util.List;

public interface InfoEmployeeService {

    /**
     * @return
     * @throws Exception
     */
    List<EmployeeTO> getAllEmployee() throws Exception;

    /**
     * @param id
     * @return
     * @throws Exception
     */
    EmployeeTO getEmployeeById(String id) throws Exception;
}
