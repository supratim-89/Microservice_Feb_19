package com.supratim.jpapractice.jpapractice;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentDaoServiceCommandLineRunner implements CommandLineRunner {
	
	//@Autowired
//	private StudentDaoService studentDaoService;
	
	@Autowired
	private StudentDaoSpringDataImpl studentDaoSpringDataImpl;
	
	
	private static final Logger log = LoggerFactory.getLogger(StudentDaoServiceCommandLineRunner.class);


	@Override
	public void run(String... args) throws Exception {
		Student student=new Student("Lakshmi","class2",1L);
		Student student1=new Student("Venkatesh","class3",2L);
	//	long l1=studentDaoService.insertStudent(student1);
		studentDaoSpringDataImpl.save(student);
		studentDaoSpringDataImpl.save(student1);
		log.info("the inserted record id are:"+student);
		List<Student> studentList=studentDaoSpringDataImpl.findAll();
		log.info("the inserted list of students are:"+studentList);
		Optional<Student> studentFound=studentDaoSpringDataImpl.findById(2L);
		log.info("the student with id2 is:"+studentFound);
	}

}
