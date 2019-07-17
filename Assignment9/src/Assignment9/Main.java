package Assignment9;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static long startTime = System.currentTimeMillis();

    static String Directory;
    static String FirstLoc;

    /*
   or we can use this in code...
    public static Map<String,String> map = new HashMap<>();


File dir = new File(d);
            for (File a : dir.listFiles()) {
                if (a.isDirectory() && layer > 0) {
                    layer--;
                    find(a.toString(), search, layer);
                }
                String name = a.toString().replace(dir.toString(), "");
                if (name.contains(search)) {
                    map.put(search, a.toString());
                    System.out.println(a.toString() + "\n");
                    isfind = true;
                }
            }

   */
    static ArrayList<String> addressList = new ArrayList<String>();
    static ArrayList<String> nameOfTheFile = new ArrayList<String>();

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your Location:\n ");
        FirstLoc = input.nextLine();

        System.out.print("Please enter the name of your directory:\n");
        Directory = input.next();

        System.out.print("Please enter how many layers we should search:\n ");
        int tedadLayeha = input.nextInt();

        ArrayList<Integer> FileCounter = new ArrayList<Integer>();

        int sizeOfFirstlevel = listOfDirectories(FirstLoc);
        int levelCounter = 0;

        for(int i = 0 ; i<sizeOfFirstlevel ; i++){

            FileCounter.add(    listOfDirectories(addressList.get(i))     );
            sizeOfFirstlevel = sizeOfFirstlevel + FileCounter.get(i);
            levelCounter ++;

            if(levelCounter == tedadLayeha){
                break;
            }
        }

    }

    public static int listOfDirectories(String address) throws IOException {

        File[] files = new File(address).listFiles();

        nameOfTheFile.clear();

        for (File file : files) {
            addressList.add(address + "\\" + file.getName());
            nameOfTheFile.add(file.getName());
        }
        DirectorySearcher(nameOfTheFile);

        return nameOfTheFile.size();
    }

    public static void DirectorySearcher(List<String> listOfFiles) throws IOException {

        File_Related file = new File_Related();

        for (int i = 0 ; i<listOfFiles.size() ; i++){

            if(listOfFiles.get(i).contains(Directory)){

                System.out.println(listOfFiles.get(i) + " is found in address : " + FirstLoc );

                file.writeToFile(listOfFiles.get(i) + " is found in address : " + FirstLoc
                        + "\t" + (System.currentTimeMillis() - startTime) + "ms");
            }
        }

    }

}