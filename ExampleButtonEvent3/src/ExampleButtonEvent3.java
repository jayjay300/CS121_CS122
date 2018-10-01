import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class ExampleButtonEvent3 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        
        Stage stage = new Stage(); // Create a new stage
        stage.setTitle("Second Stage"); // Set the stage title
        Stage stage3 = new Stage();
        stage3.setTitle("Third Stage");
        Stage stage4 = new Stage();
        stage4.setTitle("Fourth Stage");
        Stage stage5 = new Stage();
        stage5.setTitle("Fifth Stage");
        Stage stage6 = new Stage();
        Button stage2button = new Button();
        Button stage3button = new Button();
        Button stage4button = new Button();
        Button stage5button = new Button();
        Button stage6button = new Button();
        stage2button.setText("OK");
        stage3button.setText("HI");
        stage4button.setText("Nice");
        stage5button.setText("Spicey");
        
        
        
        stage6.setScene(new Scene(stage6button,500,500));
        stage5.setScene(new Scene(stage5button,200,50));
        
        stage6button.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event){
        	primaryStage.close();
        	stage.close();
        	stage3.close();
        	stage4.close();
        	stage5.close();
        	stage6.close();
        	}
        });
        
        stage5button.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event){
        		primaryStage.show();
        		stage.show();
        		stage3.show();
        		stage6.show();
        		stage6button.setText("Get me out of this mess");
        	}
        });
        
        stage4.setScene(new Scene(stage4button,300,100));
        stage4button.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event){
        	stage3.close();
        	stage5.show();
        	}
        });
        
        stage3.setScene(new Scene(stage3button,350,100));//button3
        stage3button.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event){
        	stage.close();
        	stage4.show();
        	}
        });
        
        stage.setScene(new Scene(stage2button, 350, 100));//button2        
        stage2button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            
            	stage2button.setText("You Clicked Me :-)");
            	stage.show();
            	primaryStage.close();
            	stage3.show();
            }
        });
        
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        StackPane root = new StackPane();
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	root.setRotate(45);
            	btn.setText("You Clicked Me :-)");
            	stage.show();
            }
        });
        
       
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
/*

the 3rd window, when clicked, closes button 2 and opens button 4...

button 4, when clicked....  closes button 3 and opens button 5....

so...at this point.... button 4 and button 5 are open...

then, clicking button 5 re-opens buttons 1, 2 and 3....*/