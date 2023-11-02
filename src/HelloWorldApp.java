import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloWorldApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group group = new Group();
	
		//Scene
		Scene scene = new Scene(group, 300, 300);
		
		primaryStage.setTitle("Shembull 1 javafx");//setting stage title
		
		//shtojme scene tek stage
		primaryStage.setScene(scene);
		
		//tregojme skenen
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
