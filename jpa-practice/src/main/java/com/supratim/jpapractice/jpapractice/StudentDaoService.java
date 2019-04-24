package com.supratim.jpapractice.jpapractice;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional

public class StudentDaoService {
@PersistenceContext
private EntityManager entityManager;


public long insertStudent(Student student)
{
	entityManager.persist(student);
	return student.getId();
}

}
