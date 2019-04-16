

import java.util.*;

//import javax.naming.ldap.SortResponseControl;
import java.util.*;
    public class Assignment4 {

        public static void main(String[] args) {

        	int r;
        	int c;
        	
            System.out.println("in code yek matrix e tasadofi sakhte va taghierate lazem ra anjam midahad.\n ");
           
            System.out.println("please enter your 1st number for: ");
            Scanner scan = new Scanner(System.in);
            c = scan.nextInt();
            // c is for colomns (sotoon) 
            
            
            System.out.println("please enter your 2nd number: ");
           //comment: Scanner input = new Scanner(System.in); it was for a new scanner. 
            r = scan.nextInt();
            // r is for rows (satr)
             
            Random random = new Random();

            //int square[][];
            
            
            int [] [] square = new int[r][c];
            System.out.println("Your Original Matrix: ");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {

                    square[i][j] = random.nextInt(100);
                    System.out.printf("%5d", square[i][j]);
                }
                System.out.print("\n");
   
            }

           
            System.out.println();

            // code ta inja yek matrixe tasadofi ro chap mikone...
            // az inja be ba'd voroudi ro be soorate (row)va (column) migire. shomare anha ra ham migirad.
            // va ba'd taghierate lazem rooye (rows) va (columns) ro anjam mide.


           System.out.println("please enter an input like: r1 or c1. "); 
           /*String a;
           a = scan.next();
           String ch ,ch1;
	        int n;
	        ch = a.toString();
	        n = (int)a.charAt(1);
	        n -= 48;
*/
            String a = scan.next();
            int b = scan.nextInt();
            
	        if (a.equals("r") && b < r) {
	        	int i, j, temp;  //be sure that the temp variable is the same "type" as the array
	            for ( i = 0; i < r-2; i ++ ) 
	            {
	                 for ( j = 0; j < c-1; j ++ )
	                 {
	                      if( square[b][j] > square[b][j+1] )         //sorting into descending order
	                      for(int k=0;k<r-1;k++)
	                      {
	                              temp = square[k][i+1];   //swapping
	                              square[ k ][i+1] = square[ k ][i];
	                              square[ k ][i] = temp; 
	                       }           
	                 }
	            }
	            for(i = 0; i<r ; i++) {
	            	for(j = 0; j<c ; j++) {
	            		System.out.format("%5d", square[i][j]);
	            	}
	            	System.out.println("");
	            }
	        }
	        else if (a.equals("c") && b < c) {
	        	int i, j, temp;  //be sure that the temp variable is the same "type" as the array
	            for ( i = 0; i < r ; i ++ ) 
	            {
	                 for ( j = 0; j < r-1; j ++ )
	                 {
	                      if( square[j][b] > square[j+1][b] )         //sorting into descending order
	                      for(int k=0;k<c;k++)
	                      {
	                              temp = square[j+1][k];   //swapping
	                              square[ j+1 ][k] = square[ j ][k];
	                              square[ j ][k] = temp; 
	                       }           
	                 }
	            } 
	            for(i = 0; i<r ; i++) {
	            	for(j = 0; j<c ; j++) {
	            		System.out.format("%5d", square[i][j]);
	            	}
	            	System.out.println("");
	            }
	        }
	        else {
	            System.out.println("ERROR");
	        }
           
           
          /* int i, j, temp;  //be sure that the temp variable is the same "type" as the array
           for ( i = 0; i < c - 1; i ++ ) 
           {
                for ( j = i + 1; j < r; j ++ )
                {
                     if( square[i][] < square[j][] )         //sorting into descending order
                     {
                             temp = square[ i ];   //swapping
                             square[ i ] = square[ j ];
                             square[ j ] = temp; 
                      }           
                }
           }*/
           
           
         }      
    }
        
    
    
    
    //int row[];
	//int column[];
	
    
 // String a;
    //a = scan.next();
  //char ch = a.charAt(0);
    //int h =(int) a.charAt(1);
    //h -= 48;
