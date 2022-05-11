import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String args[]) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

//        SpeakerService service = new SpeakerServiceImpl();
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        System.out.print(service.findAll().get(0).getFisrtName() + " ");
//        System.out.print(service.findAll().get(0).getLastName());
//
//        System.out.println();
//
//        System.out.print(service.findAll().get(1).getFisrtName() + " ");
//        System.out.print(service.findAll().get(1).getLastName());
    }
}
