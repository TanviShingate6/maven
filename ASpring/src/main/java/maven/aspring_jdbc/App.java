package maven.aspring_jdbc;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		SportsTemplate et = (SportsTemplate) context.getBean("sportsjdbctemp");
		System.out.println("Records Creation");
		et.insert("Sita", "Indoor", 2 );
		et.insert("Rita", "Outdoor", 11);
		et.insert("Mita", "Indoor", 5);
		et.insert("Gita", "Outdoor", 10);
		et.insert("Tina", "Indoor", 4);
		System.out.print("Deleting Records");
		et.delete(1);
	}
}