package repository;

import model.Teacher;

public class TeacherRepository {

    private final static Teacher [] teachers = new Teacher [100];


    public void register (Teacher teacher){

        if (teacher== null) {
            throw new IllegalArgumentException("teacher cannot be null");
        }



        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i]==null) {
                teachers[i]= teacher;
                return;
            }


        }

        throw new IllegalStateException("The teacher array is full");

    }

    public Teacher findTeacherByNationalCode(String nationalCode){
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null && teachers[i].getNationalCode().equals(nationalCode))
            {
                return  teachers[i] ;
            }

        }
        return null ;

    }

    public void acceptTeacher(String nationalCode) {
        Teacher teacher = findTeacherByNationalCode(nationalCode);
        if (teacher==null) {
            throw new IllegalArgumentException("Teacher not found");
        }
        teacher.setAccepted(true);

    }

    public  void updateFirstname (String nationalCode , String firstname)
    {
        Teacher teacher = findTeacherByNationalCode(nationalCode);
        if (teacher==null) {
            throw new IllegalArgumentException("Teacher not found");
        }
        teacher.setFirstname(firstname);

    }




}
