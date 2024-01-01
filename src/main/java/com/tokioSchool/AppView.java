package com.tokioSchool;

import componentes.AppPaneltexto;
import componentes.AppTabla;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppView {
    public AppPaneltexto appPaneltexto;
    public HBox hbox;
    public AppTabla appTabla;

    public AppView(Stage stage){
        iniciarComponentes();

        Scene scene = new Scene(hbox,730,500);
        stage.setScene(scene);
        stage.setTitle("Control de Stock");
        stage.show();
    }
    public void iniciarComponentes(){
        appTabla = new AppTabla();

      HBox.setMargin(appTabla,new Insets(60));

        appPaneltexto= new AppPaneltexto();
        hbox = new HBox(appPaneltexto,appTabla);

    }
}
