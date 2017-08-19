import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
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
public class Shape_3D extends Application
{
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage)
	{	
		Box box = new Box();
		box.setWidth(200.0);
		box.setHeight(500.0);
		box.setDepth(250.0);
		box.setTranslateX(200);
		box.setTranslateY(450);
		box.setTranslateZ(100);
		box.setCullFace(CullFace.FRONT);
		/*

		As mentioned above for this method, you need to pass an object of the type Material. The PhongMaterial class of the package javafx.scene.paint is a sub class of this class and provides 7 properties that represent a Phong shaded material. You can apply all these type of materials to the surface of a 3D shape using the setter methods of these properties.

		Following are the type of materials that are available in JavaFX −

		bumpMap − This represents a normal map stored as a RGB Image.

		diffuseMap − This represents a diffuse map.

		selfIlluminationMap − This represents a self-illumination map of this PhongMaterial.

		specularMap − This represents a specular map of this PhongMaterial.

		diffuseColor − This represents a diffuse color of this PhongMaterial.

		specularColor − This represents a specular color of this PhongMaterial.

		specularPower − This represents a specular power of this PhongMaterial.

		*/
		PhongMaterial material1 = new PhongMaterial();  
      	material1.setBumpMap(new Image
         ("anay.jpg"));   
		box.setMaterial(material1);

		Cylinder cylinder= new Cylinder();
		cylinder.setRadius(25.0f);
		cylinder.setHeight(100.0f);
		cylinder.setTranslateX(400);
		cylinder.setTranslateY(450);
		cylinder.setCullFace(CullFace.FRONT);
		//cylinder.setDrawMode(DrawMode.FILL);
		PhongMaterial material2 = new PhongMaterial();
      material2.setDiffuseMap(new Image
         ("anay.jpg"));
      cylinder.setMaterial(material2);

		Sphere sphere = new Sphere();
		sphere.setRadius(150.0);
		sphere.setTranslateX(700);
		sphere.setTranslateY(450);
		sphere.setCullFace(CullFace.NONE);
		//sphere.setDrawMode(DrawMode.LINE);
		PhongMaterial material3 = new PhongMaterial();  
      material3.setSelfIlluminationMap(new Image
         ("anay.jpg"));
      sphere.setMaterial(material3);

		Group g = new Group();
		g.getChildren().addAll(box,cylinder,sphere);
		Scene scene = new Scene(g ,600,300);

		PerspectiveCamera camera = new PerspectiveCamera(false);
		camera.setTranslateX(0);
		camera.setTranslateY(0);
		camera.setTranslateZ(-10);
		scene.setCamera(camera);

		primaryStage.setTitle("BOX");
		primaryStage.setScene(scene);
		primaryStage.show();
 	}
}
