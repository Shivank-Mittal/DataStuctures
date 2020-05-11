package hackerRank.ifCondestion;

public class CheckIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int p = 5;
		int side = Math.abs(p / 2);
		int page = 0;

		if (n <= side) {

			page = n / 2;

		} else {
			n = p - n;
			if (p % 2 == 0 && n == 1) {
				System.out.println("in mod");
				page = 1;
			} else {
				page = n / 2;
			}

		}
		System.out.println(page);
	}

}
