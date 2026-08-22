package repository;

import model.Student;

public class StudentRepository {

    private final static Student [] students = new Student [100];
    private int size;




    public void register (Student student){

        if (student== null) {
            throw new IllegalArgumentException("Student cannot be null");
        }



        for (int i = 0; i < students.length; i++) {
            if (students[i]==null) {
                students[i]= student;
                size++;
                return;
            }


        }

        throw new IllegalStateException("The student array is full");

    }

    public Student findStudentByNationalCode(String nationalCode){
        for (Student student : students) {
            if (student != null && student.getNationalCode().equals(nationalCode)) {
                return student;
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
    public int getNumberOfStudents() {
        return size;
    }

    public Student[] getStudentByNumber() {
        Student[] studentsList = new Student[size];
        for (int i = 0; i < size; i++) {
            studentsList[i] = students[i];
        }
        return studentsList;
    }



}
