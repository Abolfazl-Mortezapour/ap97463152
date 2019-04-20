import java.util.*;


public class Assignment5 {
	public static void main(String[] args) {
		
		Long startTime=System.currentTimeMillis();
		
		double f;
		double max;
		max = 1414.2135/((1000*Math.sin(2000))+(1000*Math.cos(2000)));
		
		for(int x=-1000; x<1000 ; x++ ) {
			
			for(int y=x; y<1000 ; y++) {
				
				f = Math.sqrt((x*x)+(y*y))/((x*Math.sin(x+y))+(y*Math.cos(x+y)));

				//max =Math.max(max, f);
				
				if (f>max) {
					double temp = max;
					max = f;
					f = temp;
				}
				
				
			}
		}
		System.out.println(max);
		System.out.println((System.currentTimeMillis()-startTime)+" ms");
	}
}
