package hackerRank.ifCondestion;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Shivank";
		String r = "";
		char[] sc = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = sc.length - 1; i >= 0; i--) {

			sb.append(sc[i]);
		}
		System.out.println(sb);
	}

}
