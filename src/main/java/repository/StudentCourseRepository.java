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
                studentCourses [i] = studentCourse;
                size++;
                return;
            }

        }

    }


    public int countStudentsInCourse(int courseCode){
        int count = 0;
        for (int i = 0; i < studentCourses.length; i++) {

            if( studentCourses [i]!= null && studentCourses[i].getCourseCode() == courseCode)
            {
                ++count;
            }
        }
        return count;
    }




    public int countCoursesForStudent (String nationalCode) {
        int count = 0 ;
        for (int i = 0; i < studentCourses.length; i++) {

            if (studentCourses[i] != null && studentCourses[i].getNationalCode().equals(nationalCode) )
            {
                ++count;
            }

        }
        return count ;
    }




    public  int [] getCourseCodesForStudent(String nationalCode, int count) {
        int [] courseCodes = new int [count];
        int j= 0;

        for (int i = 0; i < studentCourses.length; i++) {
            if (studentCourses [i] != null && studentCourses[i].getNationalCode().equals(nationalCode))
            {
               courseCodes [j]= studentCourses[i].getCourseCode();
                j++;
            }

        }

        return courseCodes;
    }




    public StudentCourse findStudentCourse (String nationalCode , int courseCode)
    {
        for (int i = 0; i < studentCourses.length; i++) {
            if (studentCourses[i] != null && studentCourses[i].getCourseCode()==courseCode && studentCourses[i].getNationalCode().equals(nationalCode))
            {
                return studentCourses[i];

            }

        }

         return null;
    }




    public void setGrade(StudentCourse studentCourse, int grade) {

        if (studentCourse != null) {
            studentCourse.setGrade(grade);
        }
    }


}
