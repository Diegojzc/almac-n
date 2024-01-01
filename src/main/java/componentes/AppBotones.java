package componentes;

import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class AppBotones extends HBox {

    public Button btAgregar;
    public Button btModificer;

    public AppBotones(){
        super();
        iniciarComponentes();
        setSpacing(17);
    }
    public void iniciarComponentes(){
        btAgregar = new Button("Agregar");
        btAgregar.setUserData("agregar");
       btAgregar.setBackground(Background.fill(Color.DARKGREY));
        btModificer = new Button("Modificar");
        btModificer.setUserData("modificar");
       btModificer.setBackground(Background.fill(Color.DARKGRAY));
        getChildren().addAll(btAgregar,btModificer);
    }
}
