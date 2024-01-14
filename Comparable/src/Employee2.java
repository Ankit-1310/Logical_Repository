import java.util.ArrayList;
import java.util.Collections;

public class Employee2 {
	private int eid;
	private String name;
	private String addr;
	
	public Employee2() {
		super();
	}
	public Employee2(int eid,String name,String addr) {
		this.eid=eid;
		this.name=name;
		this.addr=addr;
	}
	public void setEid(int eid) {
		this.eid=eid;
	}
	public int getEid() {
		return eid;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAddr(String addr) {
		this.addr=addr;
	}
	public String getAddr() {
		return addr;
	}
	
	@Override
	public String toString() {
		return " "+this.eid+" "+this.name+" "+this.addr;
	}
	public static void main(String[] args) {
		ArrayList<Employee2> list= new ArrayList<>();
		list.add(new Employee2(131,"Anku","sarsi"));
		list.add(new Employee2(111,"Snku","sarsi"));
		list.add(new Employee2(181,"Hnku","sarsi"));
		list.add(new Employee2(151,"Bnku","sarsi"));
		list.add(new Employee2(161,"Inku","sarsi"));
		System.out.println(list);
		Collections.sort(list,(o1,o2)-> o1.getName().compareTo(o2.getName()));
		System.out.println(list);
		
	}

	
	
}
