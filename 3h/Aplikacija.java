/*    < - ### --- ONEBUTTON + ANONYM CONSTRUCTOR --- ### - >  */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class Aplikacija extends Application{
  
  private Label lb_text;
  private Button btn_tlacitko;
  
  public void start(Stage stage){
    
    lb_text = new Label("Cauko kakauko");
    btn_tlacitko = new Button("Stlac ma!");
    
    //anonymny konstruktor na odchytavanie udalosti
    //anonymny konstruktor => new EventHandler()
    btn_tlacitko.setOnAction(new EventHandler(){
      
      //definicia anonymneho konstruktora
      
      private boolean buttonWasClicked = false;
      
      public void handle(Event event){
        if(buttonWasClicked == false){
          lb_text.setText("Cauko kakauko");
          
          buttonWasClicked = true;
        }else{
          lb_text.setText("cau cica");
            
          buttonWasClicked = false;
         }
      }

        
    });
    
    VBox vbox = new VBox(4);
    Scene scene = new Scene(vbox, 330, 330);
    
    vbox.setAlignment(Pos.CENTER);
    
    vbox.getChildren().addAll(lb_text, btn_tlacitko);
    
    
    stage.setScene(scene);
    stage.setTitle("Okienko");
    stage.setResizable(false);
    stage.show();
  }

  
}
