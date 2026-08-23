package model;

public class Person {

    private String firstname;
    private String lastname;
    private String password;
    private String nationalCode;
    private boolean accepted;


    public Person (String firstname , String lastname ,String nationalCode ,  String password ) {

        this.firstname = firstname;
        this.lastname = lastname;

        this.password = password;
        this. nationalCode = nationalCode;

    }

    public String getFirstname () {
        return firstname;
    }

    public String getLastname () {

        return lastname;
    }

    public String getPassword() {
        return password;
    }


    public String getNationalCode() {
        return nationalCode;
    }


    public void setPassword (String password) {

        this.password = password;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname (String lastname){
        this.firstname= lastname;
    }

    public void setAccepted (boolean accepted)
    {
        this.accepted=accepted;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
