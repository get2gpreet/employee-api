package com.preet.service.impl;

import com.preet.dto.EmployeeTO;
import com.preet.entity.EmployeeEntity;
import com.preet.repository.EmployeeDAO;
import com.preet.service.InfoEmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class InfoEmployeeServiceImpl implements InfoEmployeeService {

    private static final Logger logger = LoggerFactory.getLogger(InfoEmployeeServiceImpl.class);

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public List<EmployeeTO> getAllEmployee() throws Exception {
        logger.info("from getAllEmployee - calling employee repo");
        return employeeDAO.findAll().stream()
                .map(this::transform)
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeTO getEmployeeById(String id) throws Exception {
        logger.info("getEmployeeById : {}", id);
        EmployeeTO employeeTO = null;
        Optional<EmployeeEntity> employeeEntityOptional = employeeDAO.findById(Integer.parseInt(id));
        if (employeeEntityOptional.isPresent()) {
            EmployeeEntity employeeEntity = employeeEntityOptional.get();
            employeeTO = transform(employeeEntity);
        } else {
            logger.info("no data found for id : {}", id);
        }
        return employeeTO;
    }

    private EmployeeTO transform(EmployeeEntity employeeEntity) {
        EmployeeTO employeeTO = new EmployeeTO();
        employeeTO.setId(employeeEntity.getId());
        employeeTO.setName(employeeEntity.getName());
        employeeTO.setSurname(employeeEntity.getSurname());
        return employeeTO;
    }

}
