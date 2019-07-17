package Assignment8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class File_Reader {
    String filename = "newfile.txt";


    public void creatFile () throws Exception{

        File file = new File(filename);
        if (file.createNewFile()) {
            System.out.println("file created...");
        }
        else
            System.out.println("File already exists.");
    }
    // this part makes a file...





    public ArrayList<Student> read() throws Exception {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner scfile = new Scanner(new File(filename));
    //it makes an arraylist of students which we want to give the informations to it...
    // graduated or studing ...

        for (int i = 0;scfile.hasNext();i++) {
            String sfile = scfile.next();
            StringTokenizer st = new StringTokenizer(sfile,"_");
            // ettela'ate rikhte shode dar file ro ba stringtokenizer(_) moshakhas mikonad...

            if (st.nextToken().equals("11")) {
                students.add(new Student_Studing());
            }
            else{
                students.add(new Graduated_Student());
            }
            students.get(i).setName(st.nextToken());
            students.get(i).setFname(st.nextToken());
            students.get(i).setStudentid(Long.parseLong(st.nextToken()));
            students.get(i).setEntering_year(Integer.parseInt(st.nextToken()));
            students.get(i).set(Integer.parseInt(st.nextToken()));
        }
        return students;
    }

    // in ghesmat ham informatione voroodi ro migire ke student ya graduated bashe ya studing...



    public void saveToFile(ArrayList<Student> save) throws Exception{

        FileWriter fileWriter = new FileWriter(filename);
        BufferedWriter buffer = new BufferedWriter(fileWriter);

        for ( int i = 0 ; i < save.size() ; i++){

            buffer.write(save.get(i).sendToFile());
            buffer.newLine();
        }
        buffer.close();
        fileWriter.close();
        System.out.println("Informations Saved to file...!");
    }

}