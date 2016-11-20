package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by rajgopal on 20/11/16.
 */

@Entity
@Table(name = "user")
public class User {

    @Column(name="firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;

    private int age;

    private String dob;

    private String gender;

    private int contact;

    private String info;

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public String getDob() { return dob; }

    public void setDob(String dob) { this.dob = dob; }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public int getContact() { return contact; }

    public void setContact(int contact) { this.contact = contact; }

    public String getInfo() { return info; }

    public void setInfo(String info) { this.info = info; }

    public User(String firstName, String lastName, int age, String dob, String gender, int contact, String info) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dob = dob;
        this.gender = gender;
        this.contact = contact;
        this.info = info;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", contact=" + contact +
                ", info='" + info + '\'' +
                '}';
    }
}
