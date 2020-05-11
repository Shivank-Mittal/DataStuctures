package hackerRank.ifCondestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManupulation {


	public static void main(String[] args) {

		List<Integer> L = null;

		Scanner sc = new Scanner(System.in);

		int lLength = sc.nextInt();
		L = new ArrayList<Integer>();

		for (int i = 0; i < lLength; i++) {
			L.add(sc.nextInt());
		}
		
		int noOfqueries = sc.nextInt();
		
		for(int count = 0 ; count < noOfqueries; count++ ) {
			
			String conditon = sc.next();
			
			if (conditon.equalsIgnoreCase("insert")) {
				int index = sc.nextInt();
				int inValue = sc.nextInt();
				L.add(index, inValue);
			} else if (conditon.equalsIgnoreCase("delete")) {
				int index = sc.nextInt();
				L.remove(index);
			}
		}

		for (int value : L) {
			System.out.print(value + " ");
		}

	}
	

}
