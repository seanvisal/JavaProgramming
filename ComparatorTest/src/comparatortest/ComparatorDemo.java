package comparatortest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ComparatorDemo {
	public static void main(String[] str) {
//		//WAY 1: initialize list 
//		List<Person> lstPeople = Arrays.asList(
//                new Person("Jonh", 24, 1.8),
//                new Person("Pete", 18, 1.5),
//                new Person("Chris", 21, 1.6),
//                new Person("David", 14, 1.7)
//        );
		
		

//		//WAY 2: initialize list 
		List<Person> lstPeople = new ArrayList<>();
		lstPeople.add(new Person("Jonh", 24, 1.8));
		lstPeople.add(new Person("Pete", 18, 1.5));
		lstPeople.add(new Person("Chris", 21, 1.6));
		lstPeople.add(new Person("David", 14, 1.7));
		
		
		//Using age to compare
		Collections.sort(lstPeople, new AgeComparator());
		System.out.print("Using age to sort: ");
		System.out.println(lstPeople);
		
		
		
		//Using height to compare
		Collections.sort(lstPeople, new HeightComparator());
		System.out.print("Using height to sort: ");
		System.out.println(lstPeople);
	}
}
