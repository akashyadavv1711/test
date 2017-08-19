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
public class Color_javafx extends Application
{
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage)
	throws Exception
	{

		Rectangle rectangle = new Rectangle();
		rectangle.setX(150.0f);
		rectangle.setY(75.0f);
		rectangle.setWidth(300.0f);
		rectangle.setHeight(150.0f);
		


		Rectangle rectangle1 = new Rectangle();
		rectangle1.setX(550.0f);
		rectangle1.setY(75.0f);
		rectangle1.setWidth(300.0f);
		rectangle1.setHeight(150.0f);


		
		
		Image image = new Image("anay.jpg");
		ImagePattern radialGradient = new ImagePattern(image , 20 ,20,50,50,false);
		rectangle.setFill(radialGradient);

		Stop[] stops = new Stop[]{
									new Stop(0,Color.DARKSLATEBLUE),
									new Stop(1,Color.DARKRED)
									};

		LinearGradient linearGradient = new LinearGradient(0,0,1,0,true,CycleMethod.NO_CYCLE,stops);
		rectangle1.setFill(linearGradient);

		Rectangle rectangle2 = new Rectangle();
		rectangle2.setX(950.0f);
		rectangle2.setY(75.0f);
		rectangle2.setWidth(300.0f);
		rectangle2.setHeight(150.0f);

		 RadialGradient radialGradient1 = 
         new RadialGradient(0, 0, 300, 178, 60, false, CycleMethod.NO_CYCLE, stops); 
         rectangle2.setFill(radialGradient1);

	
		Group root = new Group();
		root.getChildren().addAll(rectangle,rectangle1,rectangle2);
		Scene scene = new Scene(root ,600,300);
		primaryStage.setTitle("Line");
		primaryStage.setScene(scene);
		primaryStage.show();
 	}
}
