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
public class TextNode extends Application
{
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage)
	throws Exception
	{	
		Text text = new Text("Hello how are you");
		text.setX(50);
		text.setY(50);
		/*
		You can change the font size and
		color of the text using the setFont() method. 
		This method accepts an object of the Font class.
		weight − This property represents the weight of the font. It accepts 9 values, which are 
		FontWeight.BLACK,
		FontWeight.BOLD, FontWeight.EXTRA_BOLD,
		FontWeight.EXTRA_LIGHT, LIGHT, 
		MEDIUM, NORMAL, 
		SEMI_BOLD, THIN.
		*/

		/*text.setFont(Font.font("family",FontWeight.BOLD , FontPosture,size)); */

		text.setFont(Font.font("verdana",FontWeight.EXTRA_BOLD,FontPosture.ITALIC,50));
		text.setFill(Color.BLACK);
		text.setStrokeWidth(2);
		text.setStroke(Color.RED);
		text.setStrikethrough(true);
		text.setUnderline(true);

		Group root = new Group();
		root.getChildren().addAll(text);

		Scene scene = new Scene(root ,600,300);
		primaryStage.setTitle("Line");
		primaryStage.setScene(scene);
		primaryStage.show();
 	}
}
