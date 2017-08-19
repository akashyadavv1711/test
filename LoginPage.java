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
import javafx.geometry.*;
import java.io.*;
import javafx.util.*;
public class LoginPage extends Application
{
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage)
	{	
		Text text1 = new Text("Email");
		Text text2  = new Text("Password");
		TextField tf = new TextField();
		PasswordField tf2 = new PasswordField();
		Button b1 ,b2;
		b1 = new Button("Submit");
		b2 = new Button("Clear");

		GridPane gp = new GridPane();
		// setting the vertical and horizontal gaps b\w the col
		gp.setVgap(5);
		gp.setHgap(5);
		gp.setAlignment(Pos.CENTER);

		gp.add(text1,0,0);
		gp.add(tf,1,0);
		gp.add(text2,0,1);
		gp.add(tf2,1,1);
		gp.add(b1,0,2);
		gp.add(b2,1,2);

		b1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		b2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

		text1.setStyle("-fx-font: normal bold 20px 'serif' ");
		text2.setStyle("-fx-font: normal bold 20px 'serif' ");
		
	      //Creating a Group object  
		Scene scene = new Scene(gp ,600,300);
		primaryStage.setTitle("Login Page");
		primaryStage.setScene(scene);
		primaryStage.show();
 	}
}
