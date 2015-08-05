package comparatortest;

import java.util.Comparator;

public class HeightComparator implements Comparator<Person> {

	@Override
	public int compare(Person a, Person b) {
		if(a.getHeight()<b.getHeight())
			return -1;
		else if(a.getHeight()==b.getHeight())
			return 0;
		else 
			return 1;
	}

}
