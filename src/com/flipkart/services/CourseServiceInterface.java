package com.flipkart.services;

//import com.flipkart.exception.CourseNotFoundException; 
import com.flipkart.bean.Course;
import com.flipkart.bean.Student;

/** 
 * @desc this interface is implemented by CourseServiceOperation class
 * @author Anushka
 */
public interface CourseServiceInterface {

	public void displayCourses(Student student);
	public void insertCourse(Course course) ;
	public void deleteCourse(int courseId);
	public void displayCoursesProfessor();
}