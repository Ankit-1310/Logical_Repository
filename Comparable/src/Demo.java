import java.util.ArrayList;
import java.util.Collections;

public class Demo {
public static void main(String[] args) {
//	ArrayList<Employee> emp = new ArrayList<Employee>();
//	emp.add(new Employee(21,"Ankit","753101353"));
//	emp.add(new Employee(12,"Anku","6201524998"));
//	emp.add(new Employee(35,"Nikku","9973820581"));
//	emp.add(new Employee(14,"Priyansh","8564213278"));
//	emp.add(new Employee(51,"Suman","8956231245"));
//	
//	System.out.println(emp);
//	Collections.sort(emp,new MyComparator());
//	System.out.println(emp);
//	ArrayList<Employee> emp1 = new ArrayList<>(emp);
//	System.out.println(emp1);
//	Collections.sort(emp1,new NameComparator());
//	System.out.println(emp1);
	ArrayList<Student> stu= new ArrayList<>();
	stu.add(new Student(91,"Ankit",6201524998l,"dt@gmail.com","MCA","Purnea"));
	stu.add(new Student(22,"An",45687l,"a@gmail.com","M.tech","Hyd"));
	stu.add(new Student(36,"Nit",6564879,"bk@gmail.com","B.tech","Pune"));
	stu.add(new Student(84,"Sfggggita",62235998l,"zk@gmail.com","B.com","Pitampura"));
	stu.add(new Student(58,"R",6289758l,"yk@gmail.com","CS","Sarsi"));
	System.out.println(stu);
	Collections.sort(stu,new StudentComparator());
	System.out.println(stu);
	ArrayList<Student> stu1=new ArrayList<>();
	Collections.sort(stu,new StudentComparator());
	stu.forEach(System.out::println);
}
}
