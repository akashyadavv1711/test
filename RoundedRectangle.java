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
public class RoundedRectangle extends Application
{
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage)
	throws Exception
	{
		// Rectangle rectangle = new Rectangle(x,y,width,height);
		Rectangle rectangle = new Rectangle();
		rectangle.setX(150.0f);
		rectangle.setY(75.0f);
		rectangle.setWidth(300.0f);
		rectangle.setHeight(150.0f);
		rectangle.setArcWidth(50.0);
		rectangle.setArcHeight(50.0);
		Group root = new Group();
		root.getChildren().addAll(rectangle);

		Scene scene = new Scene(root ,600,300);
		primaryStage.setTitle("Line");
		primaryStage.setScene(scene);
		primaryStage.show();
 	}
}
