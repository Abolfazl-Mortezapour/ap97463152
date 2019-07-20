package LastProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    //static Object object = new Object();


    static ArrayList<Master> masters = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Course> courses = new ArrayList<>();


    public static void main(String[] args) {

       /*
        please read this comment
        actually i wantesd to use the code but didn't have the time
        */
       /*
        File newfile = new File("file.txt");
        Scanner input = new Scanner(newfile);
        input.useDelimiter("-");
        //creating an array of students
        Student[] s = new Student[10];
        for (int i=0 ; i<s.length ; i++){
            s[i] = new Student();
        }
        int i=0;
        for (i=0;input.hasNext();i++){
            s[i].setName(input.next());
            s[i].setSurname(input.next());
            //and ...
        for (int j=0 ; j<i ; j++){
        System.out.println(s[j].getName()+" " +s[j].getSurname());
        }
        }

         */


       /*
       For reading a code from file using Stream and also ""java8"":



       */

       /*
       public class ReadFile{
           public static void main(String[] args) {
               String filename = "file.txt";
               List <String> list = new ArrayList<>();
               try (Stream<String> stream =Files.lines(Paths.get(filename))){

                   list = stream
                           .filter(line -> !line.startsWith("line1"))
                           .map(String::toUpperCase)
                           .collect(Collectors.toList());
               }catch (IOException e){
                   e.printStackTrace();
               }
               list.forEach(System.out::println);
           }
        }

        */

        Object object = new Object();
        System.out.println("WELCOME To the Managing Logging Page...!");
        System.out.println("_____________________________________________");
        boolean c = true;
        Scanner sc = new Scanner(System.in);
        int whattodo;
        while(c){
            System.out.println("Enter 1 for manager /// 2 for master /// 3 for Student /// and other number for Exit:");
            whattodo = sc.nextInt();

            Scanner scan = new Scanner(System.in);

            if(whattodo == 1) {
                System.out.println("What do you want to do manager? >>>");

                int choice1;
                //Scanner scan = new Scanner(System.in);
                System.out.println("Add a Course ? --> Enter 11");
                System.out.println("Add a Master ? --> Enter 12");
                System.out.println("Add a Student ? --> Enter 13");
                System.out.println("want to see all courses? --> Enter 14");
                System.out.println("want to see a Course's informations? --> Enter 15");
                choice1 = scan.nextInt();
                if(choice1 == 11){
                    object.addCourse();
                }
                else if(choice1 == 12){
                    object.addMaster();
                }
               else if(choice1 == 13){
                   object.addStudent();
                }
                else if(choice1 == 14){
                    object.showAllCourse();
                }
                else if(choice1 == 15){
                    object.studentAddCourse(3);
                    object.studentCoursesShow(3);
                }
            }


            else if ( whattodo == 2){
                int choice2;
                System.out.println("What do u want to do master?");
                System.out.println("See the courses and info ? --> Enter 11");
                System.out.println("See the students in each class ? --> Enter 12");
                System.out.println("remove a student ? --> Enter 13");
                System.out.println("give the students a score? --> Enter 14");
                choice2 = scan.nextInt();
                if(choice2 == 11){
                    object.showAllCourse();
                    //object.studentAddCourse(3);
                    object.studentCoursesShow(3);
                }
                else if(choice2 == 12){
                    object.courseStudentsShow(3);
                }
                else if(choice2 == 13){
                    // ___
                }
                else if(choice2 == 14){
                    // ___
                }


            }
            else if (whattodo == 3){
                int choice3;
                System.out.println("What do u want to do mr/ms ?");
                System.out.println("See all the courses and info ? --> Enter 11");
                System.out.println("Remove a course ? --> Enter 12");
                System.out.println("add a course ? --> Enter 13");
                System.out.println("see your courses? --> Enter 14");
                choice3 = scan.nextInt();

                if(choice3 == 11){
                    object.showAllCourse();
                    //object.studentAddCourse(3);
                    object.studentCoursesShow(3);
                }
                else if(choice3 == 12){
                   // ___
                }
                else if(choice3 == 13){
                    object.addCourse();
                }
                else if(choice3 == 14){
                    object.showAllCourse();
                }

            }
            else
                c=false;

        }
    }


}
