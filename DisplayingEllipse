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
public class DisplayingEllipse extends Application
{
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage)
	throws Exception
	{
		// Rectangle rectangle = new Rectangle(x,y,width,height);
		Ellipse ellipse = new Ellipse();
		ellipse.setCenterX(300.0f);
		ellipse.setCenterY(150.0f);
		ellipse.setRadiusX(150.0f);
		ellipse.setRadiusY(75.0f);

		Group root = new Group();
		root.getChildren().addAll(ellipse);

		Scene scene = new Scene(root ,600,300);
		primaryStage.setTitle("Line");
		primaryStage.setScene(scene);
		primaryStage.show();
 	}
}
