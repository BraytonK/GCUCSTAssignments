//By: Brayton Kerekffy
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class main extends Application {

 @Override
 public void start(Stage primaryStage) {
  Pane pane = new Pane();
  int i = 0;
  int j = 0;
  int x = 0;
  int y = 0;
   for(j = 0; j < 64; j++) {
	if(j % 4 == 0){
		y++;
		x=0;
	}
    Rectangle rec = new Rectangle();
    rec.setX(x * 10);
    rec.setY(y * 10);
    rec.setWidth(10);
    rec.setHeight(10);
    if(x + y % 2 == 1) {
     rec.setFill(Color.BLACK);
    } else {
     rec.setFill(Color.WHITE);
    }
    
    pane.getChildren().add(rec);
    x++;
   }
  
  Scene scene = new Scene(pane, 160, 160);
  primaryStage.setTitle("Checkboard");
  primaryStage.setScene(scene);
  primaryStage.show();
 }

 public static void main(String[] args) {
  launch(args);
 }
}