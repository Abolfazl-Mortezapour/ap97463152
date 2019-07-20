package LastProject;

import java.util.Scanner;

public class Object {
    Main main = new Main();
    Scanner sc = new Scanner(System.in);
    Boolean repetitve;
    Boolean have;

    public void addStudent() {
        repetitve = false;
        System.out.println("Name:");
        String name = sc.next();
        System.out.println("Sur Name:");
        String surname = sc.next();
        System.out.println("Password:");
        String pass = sc.next();
        System.out.println("Student ID:");
        String id = sc.next();
        for (int i = 0; i < main.students.size(); i++) {
            if (main.students.get(i).getStudentid().equals(id)) {
                System.out.println("ERROR\nID is repetitive\ncan not been saved!");
                repetitve = true;
            }
        }
        if (!repetitve) {
            Main.students.add(new Student(name, surname, pass, id));
            System.out.println("SAVED");
        }
    }


    public void addMaster() {
        repetitve = false;
        System.out.println("Name:");
        String name = sc.next();
        System.out.println("Sur Name:");
        String surname = sc.next();
        System.out.println("Password:");
        String pass = sc.next();
        System.out.println("Personnle ID:");
        String id = sc.next();
        for (int i = 0; i < main.masters.size(); i++) {
            if (main.masters.get(i).getPersonnleid().equals(id)) {
                System.out.println("ERROR\nID is repetitive\ncan not been saved!");
                repetitve = true;
            }
        }
        if (!repetitve) {
            Main.masters.add(new Master(name, surname, pass, id));
            System.out.println("SAVED");
        }
    }


    public void addCourse() {
        have = false;
        repetitve = false;
        System.out.println("Class Number:");
        int classnum = sc.nextInt();
        System.out.println("Name:");
        String name = sc.next();
        System.out.println("Master ID:");
        int num = 0;
        String personnleid = sc.next();
        for (int i = 0; i < main.masters.size(); i++) {
            if (main.masters.get(i).getPersonnleid().equals(personnleid)) {
                have = true;
                num = i;
            }
        }
        if (!have) {
            System.out.println("Master Can not found");
        } else {
            System.out.println("Course ID:");
            int id = sc.nextInt();
            for (int i = 0; i < main.courses.size(); i++) {
                if (main.courses.get(i).getCourseid() == id) {
                    System.out.println("ERROR\nID is repetitive\ncan not been saved!");
                    repetitve = true;
                }
            }
            if (!repetitve) {
                System.out.println("Information:");
                String information = sc.next();
                main.courses.add(new Course(classnum, name, main.masters.get(num), id, information));
                System.out.println("SAVED");
            }
        }
    }

    public void showAllStudents() {
        System.out.println("Student list:");
        for (int i = 0; i < main.students.size(); i++) {
            System.out.println(main.students.get(i).toString());
        }
    }

    public void showAllMasters() {
        System.out.println("Masters list:");
        for (int i = 0; i < main.masters.size(); i++) {
            System.out.println(main.masters.get(i).toString());
        }
    }

    public void showAllCourse() {
        System.out.println("Course list:");
        for (int i = 0; i < main.courses.size(); i++) {
            System.out.println(main.courses.get(i).toString());
        }
    }

    public void studentCoursesShow(int num) {
        for (int i = 0; i < main.students.get(num).courses.size(); i++) {
            System.out.println(main.students.get(num).courses.get(i));
        }
    }

    public void courseStudentsShow(int num) {
        for (int i = 0; i < main.courses.get(num).studentlist.size(); i++) {
            System.out.println(main.courses.get(num).studentlist.get(i));
        }
    }

    public void studentAddCourse(int num) {
        have = false;
        int coursenum = 0;
        showAllCourse();
        System.out.println("Course ID:");
        int courseid = sc.nextInt();
        for (int i = 0; i < main.courses.size(); i++) {
            if (main.courses.get(i).getCourseid() == courseid) {
                System.out.println("ERROR\nCourse not found\ncan not been saved!");
                have = true;
                coursenum = i;
            }
        }
        if (have) {
            main.students.get(num).courses.add(main.courses.get(coursenum));
            main.courses.get(coursenum).studentlist.add(main.students.get(num));
            System.out.println("SAVED");
        }

    }


   /* public void getPassManager (){
        System.out.println("User name :");
        //      string
    }

    public void getPassStudent (){

    }*/



}
