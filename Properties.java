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
public class Properties extends Application
{
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage)
	throws Exception
	{
		// Rectangle rectangle = new Rectangle(x,y,width,height);
		Rectangle rectangle = new Rectangle(100.0f,100.0f,500.0f,100.0f);
		rectangle.setStrokeType(StrokeType.CENTERED);
		/*
				rectangle.setStrokeType(StrokeType.CENTERED);

		rectangle.setStrokeType(StrokeType.OUTSIDE);

		rectangle.setStrokeType(StrokeType.INSIDE);


		*/

		rectangle.setStrokeWidth(5.0);
		rectangle.setFill(Color.DARKSLATEBLUE);
		rectangle.setStroke(Color.RED);
		//rectangle.setStrokeLineJoin(StrokeLineJoin.BEVEL);
		rectangle.setStrokeMiterLimit(10);
		rectangle.setStrokeLineCap(StrokeLineCap.SQUARE);
		rectangle.setSmooth(true);
		/*
		setStrokeLineCap(StrokeLineCap.SQUARE);
		setStrokeLineCap(StrokeLineCap.BUTT);
		setStrokeLineCap(StrokeLineCap.ROUND);

		*/
		Group root = new Group();
		root.getChildren().addAll(rectangle);

		Scene scene = new Scene(root ,600,300);
		primaryStage.setTitle("Line");
		primaryStage.setScene(scene);
		primaryStage.show();
 	}
}
