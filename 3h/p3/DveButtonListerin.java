import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.Event;


public class DveButtonListerin extends Application{
  
  private Label lb_text;
  private Button btn_java, btn_javafx;
  
  public void initGUI(Stage stage){
      //deklarujeme komponenty, ktore sa ulozia do vboxu
    lb_text = new Label("text");
    btn_java = new Button("java");
    btn_javafx = new Button("javafx");
    
    btn_java.setOnAction(new EventHandler(){
      public void handle(Event event){
        lb_text.setText("java");
      }

    });
    
    btn_javafx.setOnAction(new EventHandler(){
      public void handle(Event event){
        lb_text.setText("javafx");
      }

    });
    
    VBox vbox = new VBox(4);
    
    vbox.getChildren().addAll(lb_text, btn_java, btn_javafx);
    vbox.setAlignment(Pos.CENTER);
    
    Scene scene = new Scene(vbox, 432, 380);
    
    stage.setScene(scene);
    stage.setTitle("Profesijonalna aplikacija z dvomi tlacitkami");
    stage.show();
  }
  
  public void start(Stage stage){
    
    initGUI(stage);
    
  }
  }
