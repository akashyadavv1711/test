import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.input.*;
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
import javafx.scene.transform.*;
import javafx.geometry.*;
import java.io.*;
import javafx.util.*;
public class AddingAndRemovingEvent_handler extends Application
{
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage)
	{	
		
		 Box box = new Box(); 
      
      //Setting the properties of the Box 
	      box.setWidth(150.0); 
	      box.setHeight(150.0);   
	      box.setDepth(100.0); 
	       
	      //Setting the position of the box 
	      box.setTranslateX(350);  
	      box.setTranslateY(150); 
	      box.setTranslateZ(50); 

		Text text = new Text("Click to change color");
		text.setFont(Font.font(null,FontWeight.BOLD,15));
		text.setX(150);
		text.setY(50);
		text.setFill(Color.RED);

		PhongMaterial material  = new PhongMaterial();
		material.setDiffuseColor(Color.DARKSLATEBLUE);
		box.setMaterial(material);

		RotateTransition rotateTransition = new RotateTransition();
		rotateTransition.setDuration(Duration.millis(1000));

		rotateTransition.setNode(box);
		rotateTransition.setAxis(Rotate.Y_AXIS);
		rotateTransition.setByAngle(360);
		rotateTransition.setCycleCount(50);
		rotateTransition.setAutoReverse(false);

		TextField textField = new TextField();
		textField.setLayoutX(50);
		textField.setLayoutY(100);

		EventHandler<KeyEvent> eventHandlerTextField = new EventHandler<KeyEvent> (){
			public void handle (KeyEvent e)
			{
				rotateTransition.play();
			}
		};

		textField.addEventHandler(KeyEvent.KEY_TYPED , eventHandlerTextField);

		EventHandler<MouseEvent> eventHandlerBox= new EventHandler<MouseEvent> (){
			public void handle (MouseEvent me)
			{
				rotateTransition.stop();
			}
		};

		box.addEventHandler(MouseEvent.MOUSE_CLICKED,eventHandlerBox);


		Group g = new Group();
		g.getChildren().addAll(box,textField,text);
		Scene scene = new Scene(g ,600,300);
		 PerspectiveCamera camera = new PerspectiveCamera(false); 
      camera.setTranslateX(0); 
      camera.setTranslateY(0); 
      camera.setTranslateZ(0); 
      scene.setCamera(camera);
		primaryStage.setTitle("BOX");
		primaryStage.setScene(scene);
		primaryStage.show();
 	}
}
