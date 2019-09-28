import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //FXMLLoader - pobranie zasoby .fxml z ścieżki
        Parent root = FXMLLoader.load(getClass().getResource("view/loginView.fxml"));
        primaryStage.setTitle("Panel logowania");
        Scene scene = new Scene(root);
        scene.getStylesheets().add("css/init.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

// uruchamianie aplikacji
    public static void main(String[] args) {
        launch(args);
    }
}
