package model;

public class StudentCourse {
    private String nationalCode;
    private int courseCode;
    private int grade;
    public StudentCourse (String nationalCode , int courseCode)
    {
        this.nationalCode = nationalCode;
        this.courseCode = courseCode;
        this.grade = 0;
    }

    public String getNationalCode () {
        return nationalCode;
    }

    public int getCourseCode () {
        return courseCode;
    }

    public void setGrade(int grade) {
        if(grade > 20)
            this.grade = 20;
        else
            this.grade = grade;
    }
}
