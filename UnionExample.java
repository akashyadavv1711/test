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
public class UnionExample extends Application
{
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage)
	throws Exception
	{
			
		Circle circle1 = new Circle();
		circle1.setCenterX(250.0f);
		circle1.setCenterY(135.0f);
		circle1.setRadius(100.0f);
		circle1.setFill(Color.RED);

		Circle circle2 = new Circle();
		circle2.setCenterX(350.0f);
		circle2.setCenterY(135.0f);
		circle2.setRadius(100.0f);
		circle2.setFill(Color.BLUE);


      	//Performing union operation on the circle 
		Shape shape = Shape.union(circle1 ,circle2);
		shape.setFill(Color.DARKSLATEBLUE);

		Shape shape1 = Shape.intersect(circle1,circle2);
		shape1.setFill(Color.RED);
		Shape shape2 = Shape.subtract(circle1, circle2);
		shape2.setFill(Color.GREEN); 


		Group root = new Group();
		root.getChildren().addAll(shape,shape1 ,shape2);

		Scene scene = new Scene(root ,600,300);
		primaryStage.setTitle("Line");
		primaryStage.setScene(scene);
		primaryStage.show();
 	}
}
