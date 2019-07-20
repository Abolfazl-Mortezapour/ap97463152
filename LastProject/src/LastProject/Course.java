package LastProject;

import java.util.ArrayList;

public class Course {
    private int classnum;
    private String name;
    private int courseid;
    private String information;
    //ArrayList<Float> score = new ArrayList<>() ;
    Master master;
    ArrayList<Student> studentlist = new ArrayList<>();
    public Course (int classnum , String name , Master master,int courseid,String information){
        this.master = master;
        this.name = name;
        this.classnum = classnum;
        this.courseid = courseid;
        this.information = information;
    }

    public int getClassnum() {
        return classnum;
    }

    public void setClassnum(int classnum) {
        this.classnum = classnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    @Override
    public String toString() {
        return courseid +"\t\t"+ name +"\t\t"+ classnum +"\t\t"+ master.getName()+"\t\t"+information;
    }


    public void setInformation(String information) {
        this.information = information;
    }
    public void setTeacher (Master t){
        this.master = t;
    }
}
