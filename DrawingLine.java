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
public class DrawingLine extends Application
{
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage)
	throws Exception
	{
		Text text = new Text("Welcome to anay@anay-Inspiron-3542");
		text.setFont(new Font(45));
		/* position*/
		text.setX(50);
		text.setY(150);

		Line line = new Line();
		line.setStartX(100.0);
		line.setStartY(150.0);
		line.setEndX(500.0);
		line.setEndY(150.0);

		Group root = new Group();
		root.getChildren().addAll(text,line);

		Scene scene = new Scene(root ,600,300);
		primaryStage.setTitle("Line");
		primaryStage.setScene(scene);
		primaryStage.show();
 	}
}
