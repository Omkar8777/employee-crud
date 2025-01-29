package com.example.myfirst_demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class empserviceimp implements empservice {

@Autowired
    emprepositry emprepositry;


    @Override
    public String createmployees(Employee employee) {
      empentity empentity = new empentity();

      BeanUtils.copyProperties(employee, empentity);
      emprepositry.save(empentity);
       return "saved successfully";
    }

    @Override
    public boolean deletemployees(Long id) {
     empentity emp = emprepositry.findById(id).get();
     emprepositry.delete(emp);

     return true;
    }

    @Override
    public List<Employee> getemployees() {
        List<Employee> employees = new ArrayList<Employee>();
        List<empentity> employeelist = emprepositry.findAll();

        for (empentity empentity : employeelist) {
           Employee emp = new Employee();
           emp.setId(empentity.getId());
           emp.setName(empentity.getName());
           emp.setPhone(empentity.getPhone());
           emp.setEmail(empentity.getEmail());
           
           
            employees.add(emp);
        }
        return employees;
    }

    @Override
    public String updatemp(Long id, Employee employee) {
        empentity existingemp= emprepositry.findById(id).get();
        
        existingemp.setId(employee.getId());
        existingemp.setName(employee.getName());
        existingemp.setEmail(employee.getEmail());
        existingemp.setPhone(employee.getPhone());

        emprepositry.save(existingemp);
        return "update successfully";
    }
    
}
