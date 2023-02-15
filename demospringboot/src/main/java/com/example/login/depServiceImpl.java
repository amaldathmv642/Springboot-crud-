package com.example.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class depServiceImpl implements departmentService{
	@Autowired
    private departmentRepository departmentRepository;

	@Override
	public department saveDepartment(department department) {
		// TODO Auto-generated method stub
        return departmentRepository.save(department);
	}

	@Override
	public List<department> fetchDepartmentList() {
		// TODO Auto-generated method stub
		return (List<department>)
	            departmentRepository.findAll();
		}

	@Override
	public department updateDepartment(department department, Long departmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		
	}
	
}
