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

    public int [] getCourseCodesForStudent (String nationalCode) {
        int courseCount = studentCourseRepository.countCoursesForStudent(nationalCode);
       return  studentCourseRepository.getCourseCodesForStudent(nationalCode , courseCount);

    }

    public boolean setGrade (String nationalCode , int courseCode , int grade)
    {
        StudentCourse  stCourse = studentCourseRepository.findStudentCourse( nationalCode ,  courseCode);
        if (stCourse != null ) {

            studentCourseRepository.setGradeWithNationalCodeAndCourseCode(stCourse , grade);

            return true ;


        }

        return false ;
    }

}
