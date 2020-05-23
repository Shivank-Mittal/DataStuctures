package hackerRank.ifCondestion;

public class TestGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericArrayPrinter myPrinter = new GenericArrayPrinter();
		
		Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);

	}

}
