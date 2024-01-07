import javafx.application.Application; //aplikacia typu abstract
import javafx.stage.Stage;  // podium
import javafx.scene.Scene; // scena
import javafx.scene.layout.VBox; // manazer
import javafx.scene.layout.HBox;

import javafx.scene.control.Label; //komponenty
import javafx.geometry.Pos;
import javafx.scene.text.*;
import javafx.scene.text.FontWeight;

public class App extends Application{ //dedime z trieda Application
  
  // komponenta stitok 
  private Label label_hello, label_helloJava;
  
  
  public void start(Stage stage){ //abstract tu nedavame lebo uz sme predefinovali abstractnu metodu - len sme dedili z triedy Application
    
    
    //=== vytvarame stitok ===
    label_hello = new Label("Hello");
    label_helloJava = new Label("Hello Java");
    
    label_hello.setFont(Font.font("Times New Roman", FontWeight.BOLD,24));
    
    
    
    //=== manazer ===
    VBox vbox = new VBox();
    HBox hbox = new HBox();
    
    //zobrazenie komponentu vo vbox na stred
    vbox.setAlignment(Pos.CENTER);
    
    // getChildren - ArrayList, kt. obsahuje zoznam komponentov na scene
    /*vbox.getChildren().add(label_hello);
    vbox.getChildren().add(label_helloJava);*/
    
    //vbox.getChildren().addAll(label_hello,label_helloJava); // namiesto po jednom pridame vsetky komponenty naraz
    hbox.getChildren().addAll(label_hello,label_helloJava);
    
    
    //=== definujeme scenu - prebera 3 parametre(Layout Manazer, sirka, vyska, farba(optional))===
    //Scene scene = new Scene(vbox,500,250);
    Scene scene = new Scene(hbox,500,250);
    
    
    //=== na podium pridame scenu ===
    stage.setScene(scene);
    
    
    //=== nastavenie titulku okna ===
    stage.setTitle("TEST JavaFX");
    stage.setResizable(false); //mozeme menit velkost, prebera parametre boolean - true,false
    
    
    //=== zobrazit okno ===
    stage.show();
    
   
    
    
    
  }

    //nepotrebujeme metodu main ale zadefinujeme ju, ak budeme chciet brat paramtere z prikazoveho riadku
   public static void main(String arg[]) {
      //metoda umoznuje preberanie parametrov z prikazoveho riadku
      Application.launch();
      
    }  

  
  }
  

