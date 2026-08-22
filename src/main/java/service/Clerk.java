package service;


import model.Student;
import model.Teacher;

public class Clerk {
    TeacherService teacherService = new TeacherService();
    StudentService studentService = new StudentService();
    public boolean acceptStudent(String nationalCode) {
        return  studentService.acceptStudent(nationalCode);

    }

    public boolean acceptTeachert(String nationalCode) {
        return  teacherService.acceptTeacher(nationalCode);

    }
    public boolean updateStudent (String nationalCode , String firstname) {

        return  studentService.updateFirstname(nationalCode,firstname);


    }
    public boolean updateTeacher (String nationalCode , String firstname) {

        return  teacherService.updateFirstname(nationalCode,firstname);


    }
    public Student[] getAllStudent() {
        return studentService.getStudentListr();
    }

    public Teacher[] getAllTeacher() {
        return teacherService.getTeacher();
    }


}
