import endpoints.UserController;
import javafx.application.Application;
import javafx.stage.Stage;
import service.UserService;

/**
 * Created by Mick on 15-5-2017.
 */
public class Main {
    public static void main(String[] args){
        new UserController(new UserService());
        System.out.println("got main");
    }

}
