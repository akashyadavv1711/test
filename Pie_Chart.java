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
import javafx.scene.chart.*;
import javafx.geometry.*;
import java.io.*;
import javafx.util.*;
public class Pie_Chart extends Application
{
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage)
	{	
		
		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList( new PieChart.Data("Iphone",13),new PieChart.Data("Samsung",25),new PieChart.Data("Moto G",10),new PieChart.Data("Nokia",22));
		PieChart pieChart = new PieChart(pieChartData);
		pieChart.setTitle("Mobile sales");
		pieChart.setClockwise(true);
		pieChart.setLabelLineLength(50);
		pieChart.setLabelsVisible(true);
		pieChart.setStartAngle(180);
		Group root = new Group(pieChart);


	      //Creating a Group object  
		Scene scene = new Scene(root ,600,300);
		primaryStage.setTitle("Login Page");
		primaryStage.setScene(scene);
		primaryStage.show();
 	}
}
