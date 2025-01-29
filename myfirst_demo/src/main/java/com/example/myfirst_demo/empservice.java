package com.example.myfirst_demo;

import java.util.List;

public interface empservice {

String createmployees(Employee employee);
List<Employee> getemployees();
boolean deletemployees(Long id);
String updatemp(Long id,Employee employee);
    
}
