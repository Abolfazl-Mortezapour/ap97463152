package Assignment8;

import java.util.*;
public  class Main {


    public static void main(String[] args) throws Exception {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        File_Reader file = new File_Reader();

        file.creatFile();
        file.read();
        students = file.read();


        boolean istrue = true;
        int chk;

        for (int i = students.size(); ; i++) {
            System.out.println("to add a graduated student press \"10\" or a studing student press \"11\" or  do u want to Exit? enter another number:");
            chk = sc.nextInt();
            if (chk == 10) {
                students.add(new Graduated_Student());
                students.get(i).enterData();

                if (students.get(i).getIstrue() == false) {
                    students.remove(i);
                    i--;
                }

            }



            else if (chk == 11) {
                students.add(new Student_Studing());
                students.get(i).enterData();


                if (students.get(i).getIstrue() == false) {
                    students.remove(i);
                    i--;
                }

            } else
                break;

        }


        students.sort(Student::compareTo);


        file.saveToFile(students);
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());
        }




    }



}
