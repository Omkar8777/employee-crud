package com.example.myfirst_demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class controller {

  @Autowired  
empservice empservice;
@GetMapping("employees")
public List<Employee> getAllEmployees() {
    return empservice.getemployees();
}

@PostMapping("employees")
public String createEmp(@RequestBody Employee employee) {
    
       return empservice.createmployees(employee);
    
    
}

@DeleteMapping("employees/{id}")

    public String deleteemp(@PathVariable long id){
    if(empservice.deletemployees(id)){
        return"delete successfully";
    };
return"not found";
    }


    @PutMapping("employees/{id}")
    public String putMethodName(@PathVariable long id, @RequestBody Employee employee) {
       
        
        return empservice.updatemp(id, employee);
    }

}


    

