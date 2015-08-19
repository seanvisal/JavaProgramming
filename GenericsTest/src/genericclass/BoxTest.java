package genericclass;

/*
 * ref: https://docs.oracle.com/javase/tutorial/java/generics/types.html
 * */

public class BoxTest {
	public static void main(String[] str){
		
		
		
		//Since its (Box) methods accept or return an Object, 
		//you are free to pass in whatever you want, 
		//provided that it is not one of the primitive types. 
		//There is no way to verify, at compile time, how the class is used. 
		
		//One part of the code may place an Integer in the box and expect to get Integers out of it, 
		//while another part of the code may mistakenly pass in a String, resulting in a runtime error.
		
		
		
		//test 1
		Box<Integer> box1 = new Box<Integer>(); 
		box1.set(new Integer(12));
		Integer boxData1 = (Integer) box1.get();
		
		
		
		
		//test 2
		//In Java SE 7 and later, you can replace the type arguments required
		//to invoke the constructor of a generic class with an empty set of type arguments (<>) 
		//as long as the compiler can determine, or infer, the type arguments from the context. 
		Box<Integer> box2 = new Box<>();
		box2.set("abc");	//compile error
		Integer boxData2 = (Integer) box2.get();

	}
}
