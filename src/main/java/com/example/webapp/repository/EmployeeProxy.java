package com.example.webapp.repository;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.webapp.model.Employee;

@Component
public class EmployeeProxy {

    /**
    * Get all employees
    * @return An iterable of all employees
    */

    public Iterable<Employee> getEmployees() {
        String getEmployeesUrl = "/employees";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Iterable<Employee>> response = restTemplate.exchange(
               getEmployeesUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Iterable<Employee>>() {}
                );
        
        return response.getBody();
    }

}
