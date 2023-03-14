package com.webcorestone.EduFinance.app.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.webcorestone.EduFinance.app.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>
{
	
	

	Student findByFirstName(String firstName);

	//@Transactional
	Student findById(int sid);

	Student findByEmailIdAndPassword(String emailId, String password);


}
