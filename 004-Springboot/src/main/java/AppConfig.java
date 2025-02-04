import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name ="stu")
	public Student stu () {
		Student stu = new Student ();
		stu.setSid(101);
		stu.setSname("Akash");
		return stu;
	}
	
	@Bean (name="add")
	public Address add()
	{
		Address add = new Address();
		add.setCity("pune");
		add.setCountry("India");
		return add;
		
	}
	
	@Bean (name = "add1")
	public Address add1()
	{
		Address add = new Address();
		add.setCity("Pcmc");
		add.setCountry("India");
		return add;
		
	}
 }
