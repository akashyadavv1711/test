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
public class DispPolyline extends Application
{
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage)
	throws Exception
	{
		Polyline polyline = new Polyline();
		polyline.getPoints().addAll(new Double[]{
			200.0,50.0,
			400.0 ,50.0,
			450.0,150.0,
			400.0,250.0,
			200.0,250.0,
			150.0,150.0
		});
		
		Group root = new Group(polyline);
		
		Scene scene = new Scene(root ,600,300);
		primaryStage.setTitle("Polygon");
		primaryStage.setScene(scene);
		primaryStage.show();
 	}
}
n