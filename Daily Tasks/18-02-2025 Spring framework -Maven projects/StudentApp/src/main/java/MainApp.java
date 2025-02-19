import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.student.service.StudentService;

public class MainApp {
    public static void main(String[] args) {
        // Load Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the bean from the Spring container
        StudentService studentService = (StudentService) context.getBean("studentService");

        // Create and set the student object
        studentService.displayStudentInfo();
    }
}
