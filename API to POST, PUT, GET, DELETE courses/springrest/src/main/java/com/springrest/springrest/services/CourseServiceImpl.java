package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;
	

	public CourseServiceImpl() {
		list= new ArrayList<>();
		list.add(new Course(100,"Vivek","Good"));
		list.add(new Course(120,"Java","Bad"));
	}


	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c= null;
		for (Course course:list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}


	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}


	@Override
	public Course putCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}


	@Override
	public void deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		
		
		for(Course course: list) {
			if(course.getId()==courseId) {
				list.remove(course);
				break;
			}
		}
		System.out.println("Deleted Successfully");
		
	}

}
