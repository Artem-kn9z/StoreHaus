package com.example.storehaus;

public class User {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private  int nubOfLinID;
    private  int lastLineID;

    public User() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.nubOfLinID = nubOfLinID;
        this.lastLineID = lastLineID;
    }

    public int getNubOfLinID() { return nubOfLinID; }

    public int getLastLineID() { return lastLineID; }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() { return userName; }

    public String getPassword() { return password; }

    public void setNubOfLinID(int nubOfLinID) { this.nubOfLinID = nubOfLinID; }

    public void setLastLineID(int lastLineID) { this.lastLineID = lastLineID; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setUserName(String userName) { this.userName = userName; }

    public void setPassword(String password) {
        this.password = password;
    }
}
