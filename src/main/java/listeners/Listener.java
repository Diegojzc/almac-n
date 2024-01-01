package listeners;

import com.tokioSchool.AppAlmacen;
import com.tokioSchool.AppView;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Listener implements EventHandler<MouseEvent> {

    private final AppView appView;

    public Listener(AppView appView){
        this.appView = appView;
    }
    @Override
    public void handle(MouseEvent mouseEvent) {

        if(appView.appTabla.getSelectionModel().getSelectedIndex()==-1){
            return;
        }
        AppAlmacen appAlmacen = appView.appTabla.getSelectionModel().getSelectedItem();
        appView.appPaneltexto.tidentificador.setText(appAlmacen.getIdentificador());
        appView.appPaneltexto.tproducto.setText(appAlmacen.getNombrepro());
        appView.appPaneltexto.tstock.setText(appAlmacen.getStock());
    }
}
