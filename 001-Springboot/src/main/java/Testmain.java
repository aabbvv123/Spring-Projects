import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testmain {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
}
}
