package service;

import model.Course;
import repository.CourseRepository;

public class CourseService {

    CourseRepository courseRepository = new CourseRepository() ;

    public boolean addCourse (Course course) {

        courseRepository.addCourse(course);

        return true;

    }
}
