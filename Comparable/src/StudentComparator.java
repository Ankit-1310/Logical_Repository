import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {		
		return o1.getSid()-o2.getSid();
	}
	/*
	 * @Override public boolean equals(Object obj) { return super.equals(obj); }
	 */

}
