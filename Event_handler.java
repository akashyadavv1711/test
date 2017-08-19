import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.input.MouseEvent;
import javafx.animation.*;
import javafx.scene.canvas.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.collections.*;
import javafx.event.*;
import javafx.geometry.*;
import java.io.*;
import javafx.util.*;
public class Event_handler extends Application
{
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage)
	{	
		Circle circle = new Circle();
		circle.setCenterX(300.0f);
		circle.setCenterY(135.0f);
		circle.setRadius(25.0f);
		circle.setFill(Color.BROWN);
		circle.setStrokeWidth(20);

		Text text = new Text("Click here to change the color");
		text.setFont(Font.font(null,FontWeight.BOLD,15));
		text.setFill(Color.CRIMSON);
		text.setX(150);
		text.setY(50);
		
		  EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() { 
         
         public void handle(MouseEvent e) { 
            System.out.println("Hello World"); 
            circle.setFill(Color.DARKSLATEBLUE);
            
         } 
      }; 
      circle.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
     


		Group g = new Group();
		g.getChildren().addAll(text,circle);
		Scene scene = new Scene(g ,600,300);
		primaryStage.setTitle("BOX");
		primaryStage.setScene(scene);
		primaryStage.show();
 	}
}
