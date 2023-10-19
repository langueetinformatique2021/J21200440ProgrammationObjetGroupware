package atelier02;

/**
 * test des classes A et B
 * 
 * @author isha
 *
 */

public class testAB {

	public static void main(String[] args) {
		 int i = 1;
		 int m = 60;
		 
		 for(int j = 0; j < m; j++) {
			 System.out.println(j + " " + i);
			 i = B.divise(i);
		 }
	
	}

}
