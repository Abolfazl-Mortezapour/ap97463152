import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		//in barname 4 halghe darad ke dakhele 2 halgheye digar gharar gerefte shode and.
		//ke halghehaye dakheli tartibe ziad shodan va kam shodane setarehara(diamond)ra neshan midahand. 
		//halghehaye dakheli fazaye beine(distance) setare hara niz dorost mikonad. 
		
		int n, c, k, distance=1;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Number of Rows (for Diamond Dimension) : ");
        n = scan.nextInt();
		
        distance = n-1;
		
        for(k=1; k<=n; k++)
        {
            for(c=1; c<=distance; c++)
            {
                System.out.print(" ");
            }
            distance--;
            for(c=1; c<=(2*k-1); c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
		
        distance = 1;
		
        for(k=1; k<=(n-1); k++)
        {
            for(c=1; c<=distance; c++)
            {
                System.out.print(" ");
            }
            distance++;
            for(c=1; c<=(2*(n-k)-1); c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}
