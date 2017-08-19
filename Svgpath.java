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
public class Svgpath extends Application
{
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage)
	throws Exception
	{
		/*
		In javaFx we cannot construct images by passing svg paths.
		such shapes are represented by the class named SVGPath.
		
		to draw a shape by parsing an svg path, you need to pass values to this 
		proprerty, using the method named setContent() of this class as follows-
		*/
		SVGPath svgpath = new SVGPath();
		String path = "M 100 100 L 300 100 L 200 300 z";
		svgpath.setContent(path);
		Group root = new Group();
		root.getChildren().addAll(svgpath);

		Scene scene = new Scene(root ,600,300);
		primaryStage.setTitle("Line");
		primaryStage.setScene(scene);
		primaryStage.show();
 	}
}
