package com.example.login;

import java.util.List;

public interface departmentService {

	
	// Save operation
    department saveDepartment(department department);
 
    // Read operation
    List<department> fetchDepartmentList();
 
    // Update operation
    department updateDepartment(department department,
                                Long departmentId);
 
    // Delete operation
    void deleteDepartmentById(Long departmentId);
  
}
