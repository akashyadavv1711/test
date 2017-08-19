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
public class ConvenienceEvent_handler extends Application
{
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage)
	{	
		
		//Drawing a Circle 
		Circle circle = new Circle(); 

		//Setting the position of the circle 
		circle.setCenterX(300.0f); 
		circle.setCenterY(135.0f); 

		//Setting the radius of the circle 
		circle.setRadius(25.0f);  

		//Setting the color of the circle 
		circle.setFill(Color.BROWN); 

		//Setting the stroke width of the circle 
		circle.setStrokeWidth(20);      

		//Creating a Path 
		Path path = new Path(); 

		//Moving to the staring point 
		MoveTo moveTo = new MoveTo(208, 71);               

		//Creating 1st line 
		LineTo line1 = new LineTo(421, 161);        

		//Creating 2nd line 
		LineTo line2 = new LineTo(226,232); 

		//Creating 3rd line 
		LineTo line3 = new LineTo(332,52);        

		//Creating 4th line 
		LineTo line4 = new LineTo(369, 250);        

		//Creating 5th line 
		LineTo line5 = new LineTo(208, 71);       

		//Adding all the elements to the path 
		path.getElements().add(moveTo); 
		path.getElements().addAll(line1 ,line2, line3, line4, line5
									);     

		//Creating the path transition 
		PathTransition pathTransition = new PathTransition(); 

		//Setting the duration of the transition 
		pathTransition.setDuration(Duration.millis(1000));       

		//Setting the node for the transition 
		pathTransition.setNode(circle); 

		//Setting the path for the transition 
		pathTransition.setPath(path); 

		//Setting the orientation of the path 
		pathTransition.setOrientation(
		PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);

		//Setting the cycle count for the transition 
		pathTransition.setCycleCount(50); 

		//Setting auto reverse value to true 
		pathTransition.setAutoReverse(false);

		//Creating play button 
		Button playButton = new Button("Play"); 
		playButton.setLayoutX(300); 
		playButton.setLayoutY(250); 

		circle.setOnMouseClicked (new EventHandler<MouseEvent>() 
		{ 

			public void handle(MouseEvent e)
			{ 
				System.out.println("Hello World"); 
				circle.setFill(Color.DARKSLATEBLUE);             
			} 
		});   
		playButton.setOnMouseClicked((new EventHandler<MouseEvent>()
		{ 
			public void handle(MouseEvent event) 
			{ 
			System.out.println("play");  
			pathTransition.play(); 
		} 
		})); 
       
      //Creating stop button 
      Button stopButton = new Button("stop"); 
      stopButton.setLayoutX(250); 
      stopButton.setLayoutY(250); 
      
      stopButton.setOnMouseClicked((new EventHandler<MouseEvent>() 
      { 
         public void handle(MouseEvent event) 
         { 
            System.out.println("stop"); 
            pathTransition.stop(); 
         } 
      }));
      //Creating a Group object  
	Group root = new Group(circle, playButton, stopButton); 
	Scene scene = new Scene(root ,600,300);
	PerspectiveCamera camera = new PerspectiveCamera(false); 
	camera.setTranslateX(0); 
	camera.setTranslateY(0); 
	camera.setTranslateZ(0); 
	scene.setCamera(camera);
	primaryStage.setTitle("BOX");
	primaryStage.setScene(scene);
	primaryStage.show();
 	}
}
