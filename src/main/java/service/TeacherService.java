package service;

import model.Teacher;
import repository.TeacherRepository;
import utility.Validator;

public class TeacherService {


    private final TeacherRepository teacherRepository = new TeacherRepository();
    private final Validator validator = new Validator();



    public boolean register(Teacher teacher) {
        if (!validator.isValidName(teacher.getFirstname()))
            return false;
        if (!validator.isValidName(teacher.getLastname()))
            return false;
        if (!validator.isValidNationalCode(teacher.getNationalCode()))
            return false;


        if (!validator.isValidPassword(teacher.getPassword()))
            return false;

        teacherRepository.register(teacher);
        return true;
    }

    public boolean acceptTeacher(String nationalCode) {
        Teacher teacherByNationalCode = teacherRepository.findTeacherByNationalCode(nationalCode);

        if(teacherByNationalCode==null) {
            return false;
        }
        teacherRepository.acceptTeacher(nationalCode);

        return true;
    }

    public  boolean updateFirstname (String nationalCode , String firstname)
    {
        if(!validator.isValidName(firstname))
        {
            return false;
        }
        teacherRepository.updateFirstname(nationalCode,firstname);
        return true;

    }

    public Teacher [] getAllTeachers () {
        return teacherRepository.getAllTeachers();
    }
}
