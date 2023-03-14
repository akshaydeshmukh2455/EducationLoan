package com.webcorestone.EduFinance.app.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcorestone.EduFinance.app.model.Student;
import com.webcorestone.EduFinance.app.repository.StudentRepository;
import com.webcorestone.EduFinance.app.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentRepository sr;
	
	
	public StudentServiceImpl(StudentRepository sr) {
		super();
		this.sr = sr;
	}
	@Override
	public Student saveStudentData(Student stu) 
	{
		return sr.save(stu);
	}
	@Override
	public List<Student> getAllStudent() {
		
		return (List<Student>) sr.findAll();
	}
	@Override
	public Student searchStudent(String firstName) {
		return sr.findByFirstName(firstName);
	}
	@Override
	public void deleteStudent(int sid) {
		sr.deleteById(sid);
	}
	@Override
	//@Transactional
	public Student updateStudent(int sid) {
		
		return sr.findById(sid);
	}
	@Override
	public Student queryStudentLogin(String emailId, String password) 
	{
		
		return sr.findByEmailIdAndPassword(emailId,password);
	}
	@Override
	public Student getByEmailAndPassword(String emailId, String password) {
		
		return sr.findByEmailIdAndPassword(emailId, password);
	}
	


}
