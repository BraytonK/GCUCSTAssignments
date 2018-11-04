//By: Brayton Kerekffy
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class main extends Application {

    @Override
    public void start(Stage primaryStage) {
    	
    	GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
    	Label label = new Label("helloWorld");
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        label.setRotate(90);
        
        for(int i = 0; i < 3; i++){
        	label.setTextFill(setColorAndOppacity());
        	pane.add(label, i, 0);
        }

        Scene scene = new Scene(pane, 250, 100);
        primaryStage.setTitle("helloWorld");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Color setColorAndOppacity() {
        return new Color(Math.random(), Math.random(), Math.random(), Math.random());
    }
    public static void main(String[] args) {

        Application.launch(args);
    }


}