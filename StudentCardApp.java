import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Arrays;

public class StudentCardApp extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Student student = new Student("Elvin", "Vincent", 200522075, Arrays.asList("Singing", "Football"), "https://github.com/noyaaljohny/Assignment01/blob/master/Screenshot%20(26).png");
        StudentCardController controller = new StudentCardController(student);
        controller.show(primaryStage);
    }
}