package langpackage;

class AnkitException extends Exception{
	String sname;
	public AnkitException(){
		
	}
	public AnkitException(String sname) {
		this.sname = sname;
	}
@Override
public String toString() {
	return "Name Always A String not a number"+getMessage();
}
	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
class Himanshu extends RuntimeException{
	
	int a =10;
	public Himanshu() {
		  
	}
	public Himanshu(int a) {
		
	}
	@Override
	public String toString() {
		return getMessage();
	}
	@Override
	public String getMessage() {
		return "this is himanshu Exceptions";
	}
}
public class AnkitExceotion{
	public static void main(String[] args) throws AnkitException {
		try {
			int a  = Integer.parseInt( args[0]);
		} catch (Himanshu e) {
			System.out.println(e);
		}
	}
}

