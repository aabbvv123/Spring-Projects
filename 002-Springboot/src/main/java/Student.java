import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	int sid;
	String sname;
	float marks;

	@Autowired
	private Address add;
	public int getSid() {
		return sid;
		}
	
	public void setSid(int sid) {
		this.sid = sid;
		}
	
	public String getSname() {
		return sname;
		}
	
	public void setSname(String sname) {
		this.sname = sname;
		}
	
	public float getMarks() {
		return marks;
		}
	
	public void setMarks(float marks) {
		this.marks = marks;
		}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
	}
	


}
