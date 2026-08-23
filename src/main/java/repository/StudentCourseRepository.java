package repository;

import model.StudentCourse;

public class StudentCourseRepository {

    private static final StudentCourse [] studentCourseRepository = new StudentCourse[100];
    private  static int size;
    public void add ( StudentCourse studentCourse) {

        if (studentCourse==null)
        {
            throw new IllegalArgumentException("the student course is null");
        }
        for (int i = 0; i < studentCourseRepository.length; i++) {
            if (studentCourseRepository [i] == null) {
                studentCourse = studentCourseRepository [i];
                size++;
                return;
            }

        }

    }
    public int getNumberOfRegisterStudentCourse(int code){
        int count = 0;
        for (int i = 0; i < studentCourseRepository.length; i++) {

            if( studentCourseRepository [i]!= null && studentCourseRepository[i].getCourseCode() == code)
            {
                ++count;
            }
        }
        return count;
    }
}
