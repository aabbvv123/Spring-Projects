import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private int sid;
	private String sname;
	
	@Autowired
	@Qualifier("add1")
	private Address add;
	
	public Student() {
		System.out.println("Student constructor  called...!");
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", add=" + add + "]";
	}
	
	
}
