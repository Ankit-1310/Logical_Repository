
public class Student {
	private int sid;
	private String name;
	private long mno;
	private String email;
	private String branch;
	private String addr;
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMno() {
		return mno;
	}
	public void setMno(long mno) {
		this.mno = mno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public Student(int sid,String name,long mno,String email,String branch,String addr) {
		this.sid=sid;
		this.name=name;
		this.mno=mno;
		this.email=email;
		this.branch=branch;
		this.addr=addr;
	}
	public Student() {
		super();
	}
	
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", mno=" + mno + ", email=" + email + ", branch=" + branch
				+ ", addr=" + addr + "]";
	}
//	@Override
//	public int compareTo(Object o) {
//		Student s1=(Student)o;
//		return this.getName().length()-s1.getName().length();
//	}
//	
	
}
