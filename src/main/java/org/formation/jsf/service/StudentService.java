package org.formation.jsf.service;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;

import org.formation.jsf.dao.IStudentDao;
import org.formation.jsf.model.Student;

@Dependent
public class StudentService implements IStudentService,Serializable {

	@Inject
	private IStudentDao studentDao;

	@PostConstruct
	public void initService() {
		System.out.println(this.getClass().getName()+"je suis aps construit !"+studentDao);
	}


	/* (non-Javadoc)
	 * @see org.formation.jsf.IStudentService#getStudents()
	 */
	@Override
	public List<Student> getStudents() throws Exception {
		List<Student> students = studentDao.getStudents();
		return students;
	}

	/* (non-Javadoc)
	 * @see org.formation.jsf.IStudentService#addStudent(org.formation.jsf.Student)
	 */
	@Override
	public void addStudent(Student student) throws Exception {
		studentDao.addStudent(student);

	}

	/* (non-Javadoc)
	 * @see org.formation.jsf.IStudentService#getStudent(int)
	 */
	@Override
	public Student getStudent(int id) throws Exception {
		Student student = studentDao.getStudent(id);
		return student;
	}

	/* (non-Javadoc)
	 * @see org.formation.jsf.IStudentService#updateStudent(org.formation.jsf.Student)
	 */
	@Override
	public void updateStudent(Student student) throws Exception {
		studentDao.updateStudent(student);

	}

	/* (non-Javadoc)
	 * @see org.formation.jsf.IStudentService#deleteStudent(int)
	 */
	@Override
	public void deleteStudent(int id) throws Exception {
		studentDao.deleteStudent(id);
	}
}
