
public class VarargsTest {

	
	//To use varargs, you follow the type of the last parameter by an ellipsis (three dots, ...), 
	//then a space, and the parameter name. 
	//The method can then be called with any number of that parameter, including none.
	
	private void varargsMethod(String... sentences){
		int numOfSentences = sentences.length;
		System.out.println("Number of sentences = " + numOfSentences);
		
		if(numOfSentences==0){
			System.out.println("Nothing inputted");
			return;
		}
		
		//print all of items in an Array using for each
		System.out.println("All of sentences:");
		for(String aSentence : sentences){
			System.out.println("- " + aSentence);
		}
	}
	
	
	public static void main(String[] args){
		VarargsTest varargsTest = new VarargsTest();
		
		
		//you can call a varags method with no parameter
		System.out.println("\n>>> Call varargs method with no parameter");
		varargsTest.varargsMethod();
		
		//you can call a varags method with 1 parameter
		System.out.println("\n>>> Call varargs method with 1 parameter");
		varargsTest.varargsMethod("One sentence only");
		
		//you can call a varags method with more parameters
		System.out.println("\n>>> Call varargs method with more parameters");
		varargsTest.varargsMethod("Sentence 1", "Sentence 2", "Sentence 3");
	}
	
	
}
