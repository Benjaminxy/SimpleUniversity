package service;

import model.Course;
import repository.CourseRepository;

public class CourseService {

    CourseRepository courseRepository = new CourseRepository() ;

    public boolean addCourse (Course course) {
        if(courseRepository.isDuplicateCourse(course.getName())) {

           return false ;
        }
        courseRepository.addCourse(course);
        return true;

    }
}
