import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.Event;



public class App extends Application{
  
  //deklaracia komponentov - objektov
  
  private Label lb_hello;
  private Button bt_click;
  
  public void start(Stage stage){
          ;

    // definujeme komponenty -- vbox
    
    lb_hello = new Label("hello");
    bt_click = new Button("Click me");
    
    //vnorena trieda -- appn1
    //bt_click.setOnAction(new ButtonClick());
    
    //bez vnorenej triedy bt_click.setOnAction(new ButtonClick());-- appn2
    bt_click.setOnAction(new EventHandler(){;
    private boolean click = true;
          public void handle(Event event){
      if(click){
        lb_hello.setText("Ahoj svet");
        click = false;

      } else{
      
        lb_hello.setText("hello");
        click = true;
    }
    }
      
    });

    //definicia vbox 
    VBox vbox = new VBox(10);
    
    //pridanie komponentov do array listu -- children
    vbox.getChildren().addAll(lb_hello,bt_click);
    vbox.setAlignment(Pos.CENTER);
    
    //definujeme scenu
    Scene scene = new Scene(vbox, 250, 250);
    
    //pridanie scene na podium
    
    stage.setScene(scene);
    stage.show();
     
  }
  
  //vnorena trieda
  //objekt tejto triedy bude odchytavat udalosti - kliknutie na tlacidlo
  //aby mal tuto vlastnost musime implementovat rozhranie EventHandler
 /* class ButtonClick implements EventHandler{
    private boolean click = true;
    public void handle(Event event){
      if(click){
      
              lb_hello.setText("Ahoj svet");
        click = false;

      } else{
      
        lb_hello.setText("hello");
        click = true;
    }
    }

    
    
  }   */


  
}
