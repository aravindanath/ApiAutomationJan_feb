package day1;

public class Students {


    public Students(String firstName, String lastName, String email, String programme) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.programme = programme;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }


    private String firstName;
    private String lastName;
    private String email;
    private String programme;

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    private Courses course;




}
