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
import javafx.scene.transform.*; 
import javafx.event.*;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.geometry.*;
import java.io.*;
public class Transformation extends Application
{
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage)
	throws Exception
	{
		
		Rectangle rectangle1 = new Rectangle(150,75,200,150);
		rectangle1.setFill(Color.BLUE);
		rectangle1.setStroke(Color.BLACK);
		Rectangle rectangle2 = new Rectangle(150,75,200,150);
		rectangle2.setFill(Color.BURLYWOOD);
		rectangle2.setStroke(Color.BLACK);

		Rotate rotate = new Rotate();
		rotate.setAngle(30);
		rotate.setPivotX(150);
		rotate.setPivotY(225);
		
		Scale scale = new Scale();
		scale.setX(1.5);
		scale.setY(1.5);
		scale.setPivotX(150);
		scale.setPivotY(225);

		Translate translate = new Translate();       
      
      //Setting the X,Y,Z coordinates to apply the translation 
      translate.setX(300); 
      translate.setY(50); 
      translate.setZ(100);

      Shear shear = new Shear(); 
      
      //Setting the pivot points 
      shear.setPivotX(200); 
      shear.setPivotY(250); 
      
      //Setting the dimensions for the shear 
      shear.setX(0.5); 
      shear.setY(0.0);

		rectangle2.getTransforms().addAll(rotate,scale,translate,shear);


		Group root = new Group();
		root.getChildren().addAll(rectangle1,rectangle2);

		Scene scene = new Scene(root ,600,300);
		primaryStage.setTitle("Complex");
		primaryStage.setScene(scene);
		primaryStage.show();
 	}
}
