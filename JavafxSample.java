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
public class JavafxSample extends Application
{
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage)
	throws Exception
	{
		/* Group -  it collects the node   */
		Button buton ;
		buton = new Button("Hello"); 
		Group root = new Group();
		ObservableList list = root.getChildren();
		list.add(buton);

		/* Region (Chart ,Pane, Control)*/

		/*StackPane pane = new StackPane();
		ObservableList list = pane.getChildren();
		list.add(NodeObject);*/

		Scene scene = new Scene(root ,600,300);
		primaryStage.setTitle("Sample apllication");
		primaryStage.setScene(scene);
		primaryStage.show();
 	}
}
