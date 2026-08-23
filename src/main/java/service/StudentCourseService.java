package service;

import model.Course;
import model.StudentCourse;
import repository.CourseRepository;
import repository.StudentCourseRepository;


public class StudentCourseService {

CourseRepository courseRepository = new CourseRepository();
    StudentCourseRepository studentCourseRepository = new StudentCourseRepository();





    public boolean addStudentCourse (StudentCourse studentCourse){

        int capacityByCode = courseRepository.getCapacityByCode(studentCourse.getCourseCode());
        int numberOfRegisterStudentCourse
                = studentCourseRepository.getNumberOfRegisterStudentCourse(studentCourse.getCourseCode());
        if(numberOfRegisterStudentCourse == capacityByCode)
            return false;
        studentCourseRepository.add(studentCourse);
        return true;
    }

}
