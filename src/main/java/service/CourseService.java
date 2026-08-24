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

    public int getCapacityByCode(int code){

        return courseRepository.getCapacityByCode(code);
    }


    public String[] getCourseNamesByCodes(int[] courseCodes) {
        String[] courseNames = new String[courseCodes.length];

        for (int i = 0; i < courseCodes.length; i++) {

            String courseName = courseRepository.getCourseNameByCode(courseCodes[i]);
            courseNames[i]=courseName;


        }

        return courseNames;

    }

    
}
