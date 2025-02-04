import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
		
		Address add = context.getBean(Address.class);
		Student stu = context.getBean(Student.class);
		
		Address add2 = context.getBean(Address.class);
		Student stu2 = context.getBean(Student.class);
	}
}
