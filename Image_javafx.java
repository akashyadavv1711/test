import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.animation.*;
import javafx.scene.canvas.*;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.PixelReader;
import javafx.scene.image.WritableImage;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.collections.*;
import javafx.event.*;
import javafx.geometry.*;
import java.io.*;
import javafx.util.*;
public class Image_javafx extends Application
{
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage)
	throws Exception
	{
		
		
		Image image = new Image(new FileInputStream("/home/anay/Pictures/luv.jpg"));
		int width = (int)image.getWidth();
		int height = (int)image.getHeight();

		// creating writeable image
		WritableImage wImage = new WritableImage(width, height);

		// reading colorfrom the loaded image
		PixelReader pr = new image.getPixelReader();
		PixelWriter pw = new wImage.getPixelWriter();

		for (int y=0;y<height ;y++ ) {
			for (int x =0; x<width ;x++ ) {
				Color color = pr.getColor(x,y);
				
				pw.setColor(x,y,color.darker());

			
				ImageView imageView = new ImageView(wImage);


				Group root = new Group();
				root.getChildren().addAll(imageView);
				Scene scene = new Scene(root ,600,300);
				primaryStage.setTitle("Line");
				primaryStage.setScene(scene);
				primaryStage.show();

		}
			
		}

 	}
}
