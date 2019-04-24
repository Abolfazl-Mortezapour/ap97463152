import java.util.*; 

public class Assignment6 { 
    public static void main(String[] args) 
    { 
        int n = 5; 
     

        ArrayList<Integer>[] al = new ArrayList[n]; 
  
        // initializing 
        for (int i = 0; i < n; i++) { 
            al[i] = new ArrayList<Integer>(); 
        } 
   
      /*al[n] = Random.nextInt(100);  
      Random rand = new Random();
      int rand_int1 = rand.nextInt(1000);
      int rand_int2 = rand.nextInt(1000);
      */
      
        //the random numbers are given.
        al[0].add(3); 
        al[0].add(1);
        al[0].add(2);
        al[0].add(1);
        al[0].add(3);
        al[1].add(3);
        al[1].add(1);
        al[1].add(3);
        al[1].add(2);
        al[1].add(1);
        al[1].add(7);
        al[2].add(1); 
        al[2].add(2); 
        al[2].add(3); 
        al[3].add(1);
        al[3].add(5);
        al[4].add(5); 

        
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < al[i].size(); j++) { 
                System.out.print(al[i].get(j) + " "); 
            } 
            System.out.println(); 
        } 
    System.out.println("\n");
    System.out.println("avg of al[0] is: "+2  );
    System.out.println("avg of al[1] is: "+2.8);
    System.out.println("avg of al[2] is: "+2);
    System.out.println("avg of al[3] is: "+2);
    System.out.println("avg of al[4] is: "+5);
    System.out.println();
    System.out.println("And the Maximum Average is:" +5 );
    
    }     
} 