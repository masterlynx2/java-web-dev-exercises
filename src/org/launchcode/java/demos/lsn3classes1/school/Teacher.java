package org.launchcode.java.demos.lsn3classes1.school;

public class Teacher {
    private String firstName;
    private String lastName;
    private String Subject;
    private Integer yearsTeaching;

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public Integer getYearsTeaching() {
        return yearsTeaching;
    }

    public void setYearsTeaching(Integer yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }
}
