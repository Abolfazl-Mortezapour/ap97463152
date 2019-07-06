 import java.util.*;

    public class Assignment3 {

        public static void main(String[] args) {

            System.out.println("Please Enter a Number for making The Matrix: ");
            Scanner scan = new Scanner(System.in);

            int n;

            int square[][];
            n = scan.nextInt();

            Random random = new Random();

            square = new int[n][n];
            System.out.println("Your Original Matrix: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    square[i][j] = random.nextInt(100);
                    System.out.printf("%5d", square[i][j]);
                }
                System.out.print("\n");
            }

           
            System.out.println();

            for (int temp =0; temp <= (n-1) * (n-1); temp++) {
                for (int i = 0; i < square.length; i++) {
                    for (int j = 0; j < square.length; j++) {
                        if (i + j == temp)
                            System.out.print(square[i][j] + " ");
                    }
                }
           }
		
		/*
		 //for print number
       --n;
       System.out.println("\n");
       for(int j = 0 ; j <= n ; j++){
           for(int i = 0 , h = i ; h >= 0 ; i++ , h--){
               System.out.printf("%5d",square[i][j]);
           }
       }
       for(int j = 1 ; j <= n ; j++){
           for(int h = n , i = j ; i <=n ; h-- , i++){
               System.out.printf("%5d",square[i][j]);
           }
       }
		
		*/
		

		/*comment: gives a random number.
		 Random dice = new Random();    
	        for (int counter=1 ; counter <= n ; counter++) {
	        	int number = 1+dice.nextInt(100);
	        	System.out.print(number + " " );
	        }
		*/
		
		
	}

}
