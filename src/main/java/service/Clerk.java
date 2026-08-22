package service;


import model.Student;

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
        return studentService.getAll();
    }


}
