package componentes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class AppPaneltexto extends VBox {

    public Label lidentificador,lproducto,lstock;
    public TextField tidentificador, tproducto,tstock;
    public AppBotones appBotones;

    public AppPaneltexto(){
        super();
        iniciarComponentes();
        setPadding(new Insets(20));
        setSpacing(35);
        setAlignment(Pos.TOP_LEFT);

    }
    public void iniciarComponentes(){

        lidentificador = new Label("Identidicador");
        setVgrow(lidentificador, Priority.ALWAYS);
        lidentificador.setFont(Font.font(15));
        lproducto = new Label("Producto");
        setVgrow(lproducto, Priority.ALWAYS);
        lproducto.setFont(Font.font(15));
        lstock= new Label("Stock");
        setVgrow(lstock,Priority.ALWAYS);
        lstock.setFont(Font.font(15));
        tidentificador = new TextField();
        setVgrow(tidentificador, Priority.ALWAYS);
        tproducto = new TextField();
        setVgrow(tproducto, Priority.ALWAYS);
        tstock= new TextField();
        setVgrow(tstock, Priority.ALWAYS);

        appBotones = new AppBotones();

        getChildren().addAll(lidentificador,tidentificador,lproducto,tproducto,lstock,tstock,appBotones);
    }

}
