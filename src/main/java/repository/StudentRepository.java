package repository;

import model.Student;

public class StudentRepository {

    private final static Student [] students = new Student [100];


    public void register (Student student){

        if (student== null) {
            throw new IllegalArgumentException("Student cannot be null");
        }



        for (int i = 0; i < students.length; i++) {
            if (students[i]==null) {
                students[i]= student;
                return;
            }


        }

        throw new IllegalStateException("The student array is full");

    }

    public Student findStudentByNationalCode(String nationalCode){
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getNationalCode().equals(nationalCode))
            {
                return  students[i] ;
            }

        }
        return null ;

    }

   public void acceptStudent(String nationalCode) {
      Student student = findStudentByNationalCode(nationalCode);
      if (student==null) {
          throw new IllegalArgumentException("Student not found");
      }
      student.setAccepted(true);

    }

    public  void updateFirstname (String nationalCode , String firstname)
    {
        Student student = findStudentByNationalCode(nationalCode);
        if (student==null) {
            throw new IllegalArgumentException("Student not found");
        }
        student.setFirstname(firstname);

    }




}
