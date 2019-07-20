package LastProject;

import java.util.ArrayList;

public class Master extends Object {
    private String name;
    private String surname;
    private String password;
    private String personnleid;
    ArrayList<Course> courses = new ArrayList<>();


    public Master (String name,String surname,String password,String personnleid){
        this.name =name;
        this.surname = surname;
        this.password = password;
        this.personnleid = personnleid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonnleid() {
        return personnleid;
    }

    public void setPersonnleid(String personnleid) {
        this.personnleid = personnleid;
    }


}
