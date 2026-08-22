package model;

public class Teacher extends Person {



    public Teacher (String firstname , String lastname ,String nationalCode ,  String password ) {
        super(firstname,lastname,nationalCode,password);

    }


    @Override
    public String toString() {
        return "Teacher is: \n" + super.toString();
    }
}
