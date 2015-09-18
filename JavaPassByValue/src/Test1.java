
public class Test1 {

	public static void main( String[] args ){
		Dog aDog = new Dog("Max");
		foo(aDog);
		
		if(aDog.getName().equals("Fifi")){// true
			System.out.println("True");
		}; 

	    
	}

	
	

	public static void foo(Dog d) {
	    if(d.getName().equals("Max")){// true
			System.out.println("True");
	    }; 
	    d.setName("Fifi");
	}
	
}
