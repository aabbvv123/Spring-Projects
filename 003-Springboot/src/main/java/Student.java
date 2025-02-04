import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int sid;
	private String sname;
	
	private List <String> Hobbies;
	private Set<Long> mono;
	
	private Map<String ,Integer> courses;

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

	public List<String> getHobbies() {
		return Hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		Hobbies = hobbies;
	}

	public Set<Long> getMono() {
		return mono;
	}

	public void setMono(Set<Long> mono) {
		this.mono = mono;
	}

	public Map<String, Integer> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, Integer> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", Hobbies=" + Hobbies + ", mono=" + mono + ", courses="
				+ courses + "]";
	}
	
	
 }
