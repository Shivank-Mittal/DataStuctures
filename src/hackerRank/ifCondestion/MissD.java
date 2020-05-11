package hackerRank.ifCondestion;

import java.util.ArrayList;
import java.util.List;

public class MissD {

	public static void main(String[] args) {
		
		String triple = "( ?mem = <http://www.3ds.com/SampleModel/Membership.Bob5910> )";
		 String triple1 = "( ?obj = <http://www.3ds.com/SampleModel/Membership.Bob5910> )";
		 String triple2 = "( ?mem = <http://www.3ds.com/SampleModel/Membership.Bob5910> )";
		char prefix = '<';
		char suffix = '>';
		 List<String> triples = new ArrayList<String>();
		  triples.add(triple);
		  triples.add(triple1);
		  triples.add(triple2);
		  
		for (String trip : triples) {
			System.out.println(trip.substring(trip.indexOf(prefix), trip.indexOf(suffix) + 1));
//				  System.out.println(trip);
	
		}
	}

}

