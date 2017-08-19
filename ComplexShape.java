import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
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
public class ComplexShape extends Application
{
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage)
	throws Exception
	{
		Path path = new Path();
		
		/*
		To draw such complex structures JavaFX provides a class named Path. 
		This class represents the geometrical outline of a shape.
		*/

		MoveTo moveTo = new MoveTo(108,71);
		LineTo line1 = new LineTo(5000,150);
		path.getElements().addAll(moveTo,line1);
		/*Line line = new Line();
		line.setStartX(150.0);
		line.setStartY(150.0);
		line.setEndX(500.0);
		line.setEndY(800.0);*/


		Group root = new Group();
		root.getChildren().addAll(path);

		Scene scene = new Scene(root ,600,300);
		primaryStage.setTitle("Complex");
		primaryStage.setScene(scene);
		primaryStage.show();
 	}
}
