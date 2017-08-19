import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
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
public class Animation_1 extends Application
{
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage)
	throws Exception
	{

		/*
		To apply a particular animation to a node, you have to follow the steps given below −
		Create a require node using respective class.
		Instantiate the respective transition (animation) class that is to be applied
		Set the properties of the transition and
		Finally play the transition using the play() method of the Animation class.

		*/
		// Rectangle rectangle = new Rectangle(x,y,width,height);
		Rectangle rectangle = new Rectangle();
		rectangle.setX(150.0f);
		rectangle.setY(75.0f);
		rectangle.setWidth(300.0f);
		rectangle.setHeight(150.0f);
		rectangle.setArcWidth(50.0);
		rectangle.setArcHeight(50.0);
		rectangle.setFill(Color.DARKRED);
		Image image = new Image("anay.jpg");
		ImagePattern radialGradient = new ImagePattern(image , 20 ,20,40,40,false);
		rectangle.setFill(radialGradient);

		
		
/*
		RotateTransition rotateTransition = new RotateTransition();
		rotateTransition.setDuration(Duration.millis(10000));
		rotateTransition.setNode(rectangle);
		rotateTransition.setByAngle(360);
		rotateTransition.setCycleCount(50);
		rotateTransition.setAutoReverse(false);
		rotateTransition.play();


		/*ScaleTransition scaleTransition = new ScaleTransition();
		scaleTransition.setDuration(Duration.millis(10000));
		scaleTransition.setNode(rectangle);
		scaleTransition.setByY(0.5);
		scaleTransition.setByX(0.5);
		scaleTransition.setCycleCount(50);
		scaleTransition.play();
		*/

		TranslateTransition translateTransition = new TranslateTransition();
		translateTransition.setDuration(Duration.millis(1000));
		translateTransition.setNode(rectangle);
		translateTransition.setByX(1000);
		translateTransition.setCycleCount(500);
		translateTransition.setAutoReverse(false);
		translateTransition.play();


		Group root = new Group();
		root.getChildren().addAll(rectangle);
		Scene scene = new Scene(root ,600,300);
		primaryStage.setTitle("Line");
		primaryStage.setScene(scene);
		primaryStage.show();
 	}
}
