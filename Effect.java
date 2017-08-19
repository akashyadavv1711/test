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
import javafx.scene.effect.*;
import javafx.event.*;
import javafx.geometry.*;
import java.io.*;
public class Effect extends Application
{
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage)
	throws Exception
	{	
		Image image = new Image("anay.jpg");
		ImageView imageView = new ImageView(image);
		imageView.setX(100);
		imageView.setY(70);
		imageView.setFitHeight(200);
		imageView.setFitWidth(400);

		//Setting the preserve ratio of the image view 
		imageView.setPreserveRatio(true);

		// prperty of effect 
		Glow glow = new Glow();
		glow.setLevel(0.9);
		imageView.setEffect(glow);

		ColorAdjust colorAdjust = new ColorAdjust();
		colorAdjust.setContrast(0.4);
		colorAdjust.setHue(-0.05);
		colorAdjust.setBrightness(0.9);
      	colorAdjust.setSaturation(0.8); 
      	imageView.setEffect(colorAdjust);

      	 Light.Spot light = new Light.Spot(); 
      
      //Setting the color of the light 
      light.setColor(Color.RED); 
      
      //setting the position of the light 
      light.setX(70); 
      light.setY(55); 
      light.setZ(45); 
       
      //Instantiating the Lighting class  
      Lighting lighting = new Lighting(); 
      
      //Setting the light source 
      lighting.setLight(light);  
      
      //Applying lighting effect to the text 
      imageView.setEffect(lighting);      
      
      //Applying lighting effect to the circle 
      

		Group root = new Group();
		root.getChildren().addAll(imageView);

		Scene scene = new Scene(root ,600,300);
		primaryStage.setTitle("Line");
		primaryStage.setScene(scene);
		primaryStage.show();
 	}
}
