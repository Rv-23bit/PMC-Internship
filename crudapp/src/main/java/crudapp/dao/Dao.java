package crudapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import crudapp.model.Student;

@Component
public class Dao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

//	Register/Update a student
	@Transactional
	public void createStudent(Student student) {
		this.hibernateTemplate.saveOrUpdate(student);
	}

//	Get all student list
	public List<Student> getStudents() {
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}

//	Delete a student detail
	@Transactional
	public void deleteStudent(int sid) {
		Student s = this.hibernateTemplate.load(Student.class, sid);
		this.hibernateTemplate.delete(s);
	}

//	Get single student detail
	public Student getStudent(int sid) {
		return this.hibernateTemplate.get(Student.class, sid);
	}
}
