package repository;

import model.StudentCourse;

public class StudentCourseRepository {

    private static final StudentCourse [] studentCourses = new StudentCourse[100];
    private  static int size;
    public void add ( StudentCourse studentCourse) {

        if (studentCourse==null)
        {
            throw new IllegalArgumentException("the student course is null");
        }
        for (int i = 0; i < studentCourses.length; i++) {
            if (studentCourses [i] == null) {
                studentCourse = studentCourses [i];
                size++;
                return;
            }

        }

    }
    public int getNumberOfRegisterStudentCourse(int code){
        int count = 0;
        for (int i = 0; i < studentCourses.length; i++) {

            if( studentCourses [i]!= null && studentCourses[i].getCourseCode() == code)
            {
                ++count;
            }
        }
        return count;
    }
}
