package hackerRank.ifCondestion;

public class GenericArrayPrinter<T>{
	
	public void printArray(T[] array){
		
		for(T element : array) {
			System.out.println(element);
		}
	}
	

}
