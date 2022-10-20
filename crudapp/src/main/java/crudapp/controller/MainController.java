package crudapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import crudapp.dao.Dao;
import crudapp.model.Student;

@Controller
public class MainController {

	@Autowired
	private Dao dao;

	@RequestMapping("/")
	public String home(ModelMap m) {

		List<Student> students = dao.getStudents();
		m.addAttribute("students", students);
		return "index";
	}

//	Show add student form
	@RequestMapping("/add-student")
	public String addStudent(ModelMap m) {
		m.addAttribute("title", "Add Student");
		return "add_student_form";
	}

//	Handle student form

	@RequestMapping(value = "/handle-student", method = RequestMethod.POST)
	public RedirectView handleStudent(@ModelAttribute Student student, HttpServletRequest req) {
		System.out.println(student);
		dao.createStudent(student);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(req.getContextPath() + "/");
		return redirectView;
	}
	
//	Delete Students
	@RequestMapping("/delete/{studentId}")
	public RedirectView deleteStudent(@PathVariable("studentId") int studentId, HttpServletRequest req) {
		dao.deleteStudent(studentId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(req.getContextPath() + "/");
		return redirectView;
	}
	
//	Update students
	@RequestMapping("/update/{studentId}")
	public String updateStudent(@PathVariable("studentId") int studentId, ModelMap model) {
		Student student = dao.getStudent(studentId);
		model.addAttribute("student", student);
		return "update_form";
	}
}
