package comparatortest;
import java.util.Comparator;


public class AgeComparator implements Comparator<Person>{

	@Override
	public int compare(Person a, Person b) {
		
//		//Way 1
//		return a.getAge() < b.getAge() ? -1 : a.getAge() == b.getAge() ? 0 : 1;
		
		
//		//Way 2
//		if(a.getAge()<b.getAge())
//			return -1;
//		else if(a.getAge()==b.getAge())
//			return 0;
//		else 
//			return 1;
		 
		
		
		//Compares its two arguments for order. 
		//Returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
		return a.getAge()-b.getAge();
	}

}
