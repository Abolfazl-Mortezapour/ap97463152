import javax.imageio.stream.FileCacheImageInputStream;
import java.io.FileInputStream;
import java.util.*;
import java.io.IOException;
import java.io.File;
import java.util.List;

import static java.io.FileInputStream.*;
import static java.util.Arrays.stream;

public class Assignment9 {

    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();

        System.out.println("Enter the path to search for files in folders :");
        Scanner s1 = new Scanner(System.in);
        String folderPath = s1.next();
        File folder = new File(folderPath);

        // yek halghe(ba for?!) baraye tedade vorood be folder ha lazem ast.
        if (folder.isDirectory()) {

            File[] listOfFiles = folder.listFiles();

            if (listOfFiles.length < 1)System.out.println(

                    "There is no File inside Folder");
            else System.out.println("List of Folder and Files in this Directory:");
            for (File file : listOfFiles) {
                if(file.isDirectory()) {
                    try {
                        System.out.println(
                                file.getCanonicalPath().toString());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        //*************************************************************
        // demonstration of filter method
        //List<String> result = FileCacheImageInputStream.stream().filter(s->s.startsWith("")).
          //      collect(Collectors.toList());
        //System.out.println(result);
        //Eliminate empty strings or files
        /*List<String> filtered = deleteEmptyStringsUsingJava8(strings);
        System.out.println("Filtered List: " + filtered);*/
        //*************************************************************



       /* File[] listOfFiles = folder.listFiles();
                .stream()
                .filter(s -> {
                    return s.startsWith("a");
                })
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
        */


        else System.out .println("There is no Folder from this given path :" + folderPath);


        System.out.println("*************************************");
        System.out.println("*************************************");
        System.out.println("Estimated time for search:");
        System.out.println((System.currentTimeMillis() - startTime) + " ms");
    }
}
