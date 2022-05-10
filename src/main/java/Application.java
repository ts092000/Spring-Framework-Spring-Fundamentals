import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;

public class Application {
    public static void main(String args[]) {
        SpeakerService service = new SpeakerServiceImpl();

        System.out.print(service.findAll().get(0).getFisrtName() + " ");
        System.out.print(service.findAll().get(0).getLastName());

        System.out.println();

        System.out.print(service.findAll().get(1).getFisrtName() + " ");
        System.out.print(service.findAll().get(1).getLastName());
    }
}
