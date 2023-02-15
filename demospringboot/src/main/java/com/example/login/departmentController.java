package com.example.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class departmentController {

	// Annotation
    @Autowired private departmentService departmentService;
 
    // Save operation
    @PostMapping("/departments")
    public department saveDepartment(
         @RequestBody department department)
    {
        return departmentService.saveDepartment(department);
        
    }
 
    // Read operation
    @GetMapping("/departments")
    public List<department> fetchDepartmentList()
    {
        return departmentService.fetchDepartmentList();
    }
 
    // Update operation
    @PutMapping("/departments/{id}")
    public department
    updateDepartment(@RequestBody department department,
                     @PathVariable("id") Long departmentId)
    {
        return departmentService.updateDepartment(
            department, departmentId);
    }
 
    // Delete operation
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id")
                                       Long departmentId)
    {
        departmentService.deleteDepartmentById(
            departmentId);
        return "Deleted Successfully";
    }

	
}
