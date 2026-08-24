package service;

import model.Course;
import model.Student;
import model.StudentCourse;
import repository.CourseRepository;
import repository.StudentCourseRepository;
import repository.StudentRepository;


public class StudentCourseService {

    CourseRepository courseRepository = new CourseRepository();
    StudentCourseRepository studentCourseRepository = new StudentCourseRepository();
    StudentRepository studentRepository = new StudentRepository();


    public boolean addStudentCourse(StudentCourse studentCourse) {
        if (studentCourse == null) {
            return false;
        }

        Student student = studentRepository.findStudentByNationalCode(studentCourse.getNationalCode());
        if (student == null) {
            return false;
        }

        Course course = courseRepository.findByCode(studentCourse.getCourseCode() );
        if (course == null) {return false; }

        StudentCourse existingRegistration = studentCourseRepository.findStudentCourse(studentCourse.getNationalCode(), studentCourse.getCourseCode());
        if (existingRegistration != null) {return false;}


        int registeredCount = studentCourseRepository.countStudentsInCourse(studentCourse.getCourseCode());
        if (registeredCount >= course.getCapacity()) {
            return false;
        }

        studentCourseRepository.add(studentCourse);
        return true;
    }



    public int [] getCourseCodesForStudent (String nationalCode) {
        int courseCount = studentCourseRepository.countCoursesForStudent(nationalCode);
         return  studentCourseRepository.getCourseCodesForStudent(nationalCode , courseCount);

    }




    public boolean setGrade (String nationalCode , int courseCode , int grade)
    {
        StudentCourse  studentCourse = studentCourseRepository.findStudentCourse( nationalCode ,  courseCode);
        if (studentCourse != null ) {
            studentCourseRepository.setGrade(studentCourse , grade);
            return true ;
        }
        return false ;
    }



}
