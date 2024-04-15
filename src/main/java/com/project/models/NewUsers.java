package com.project.models;

public class NewUsers {

    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String confirmPassword;


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public NewUsers setEmail(String email) {
        this.email = email;
        return this;
    }

    public NewUsers setPassword(String password) {
        this.password = password;
        return this;
    }

    public NewUsers setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public NewUsers setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public NewUsers setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    @Override
    public String toString() {
        return "NewUser{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }
}