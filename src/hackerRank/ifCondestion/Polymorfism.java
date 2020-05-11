package hackerRank.ifCondestion;

public class Polymorfism extends Pojo {

	Polymorfism() {
		System.out.println("Its A counstractur ");
	}
	Polymorfism(String Name) {
		System.out.println("Its A counstractur with Name - " + Name);
	}
	public static void main(String args[]) {

		Polymorfism polymorfism = new Polymorfism("Poly");

		polymorfism.car("Mersidece", "Q3");

		polymorfism.car("Mersidece", 33000);

		polymorfism.printValue();

	}

	public void printValue() {
		System.out.println(" its working in poly");
	}

	void car(String name, int CC) {

		System.out.println("Your Car : " + name + " with cc : " + CC + "is ready");
	}

	void car(String name, String Model) {

		System.out.println("Your Car : " + name + " with Model :" + Model + " is ready");
	}

}
