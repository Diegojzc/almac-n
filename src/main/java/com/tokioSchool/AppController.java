package com.tokioSchool;

import com.tokioSchool.Dao.AlmacenDao;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import listeners.Listener;

import java.sql.SQLException;

public class AppController implements EventHandler<ActionEvent> {

    public AppView appView;


    public AppController(AppView appView) {
        this.appView = appView;

        addAcciones();


    }

    public void addAcciones() {
        appView.appPaneltexto.appBotones.btAgregar.setOnAction(this);
        appView.appPaneltexto.appBotones.btModificer.setUserData(this);
        appView.appTabla.setOnMouseClicked(new Listener(appView));
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        Node node = (Node) actionEvent.getSource();
        String userData = node.getUserData().toString();
        switch (userData) {
            case "agregar":

                String identificador = appView.appPaneltexto.tidentificador.getText();
                String nombrepro = appView.appPaneltexto.tproducto.getText();
                String stock = appView.appPaneltexto.tstock.getText();


                if (identificador.equals("") || nombrepro.equals("") || stock.equals("")) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "Error, Introducir todos los campos");
                    alert.showAndWait();


                } else {
                    AppAlmacen a = new AppAlmacen(identificador, nombrepro, stock);

                    if (!appView.appTabla.almacens.contains(a)) {

                        appView.appTabla.almacens.add(a);
                        try {
                            AlmacenDao almacenDao = new AlmacenDao();
                            almacenDao.add(a);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }


                    } else{
                        Alert alert = new Alert(Alert.AlertType.ERROR, "ya existe");
                    alert.show();
                }
                }


                appView.appPaneltexto.tidentificador.setText("");
                appView.appPaneltexto.tproducto.setText("");
                appView.appPaneltexto.tstock.setText("");
                break;
            case "modificar":
                AppAlmacen b = appView.appTabla.getSelectionModel().getSelectedItem();
                if (b == null) {
                    Alert alerta = new Alert(Alert.AlertType.ERROR);
                    alerta.show();
                } else {
                    String identificador1 = appView.appPaneltexto.tidentificador.getText();
                    String nombrepro1 = appView.appPaneltexto.tproducto.getText();
                    String stock1 = appView.appPaneltexto.tstock.getText();
                    AppAlmacen aux = new AppAlmacen(identificador1, nombrepro1, stock1);

                    if (!appView.appTabla.almacens.contains(aux)) {
                        b.setIdentificador(aux.getIdentificador());
                        b.setNombrepro(aux.getNombrepro());
                        b.setStock(aux.getStock());

                        appView.appTabla.refresh();
                    }
                }
                break;
        }

    }


}
