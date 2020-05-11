package hackerRank.ifCondestion;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Map<String, Integer> phoneBook = new LinkedHashMap<String, Integer>();
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			in.nextLine();
			phoneBook.put(name, phone);
			System.out.println("Book Created");
		}
		List<String> query = new ArrayList<String>();
		while (in.hasNext() && n > 1) {

			String s = in.nextLine();
			query.add(s);
			n--;
			System.out.println("Names Take ");
		}

		for (String string : query) {
			System.out.println(string);
		}

		for (int i = 0; i < query.size(); i++) {
			int value = 0;
			try {
				System.out.println(query.get(i));
				value = phoneBook.get(query.get(i));
			} catch (Exception e) {
				System.out.println("No Name");
			}

			System.out.println(value);
		}

	}

}
