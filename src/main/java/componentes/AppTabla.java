package componentes;

import com.tokioSchool.AppAlmacen;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class AppTabla extends TableView<AppAlmacen>{

   public ObservableList<AppAlmacen> almacens;

    public AppTabla() {
        super();
        iniciarComponentes();
    }

    public void iniciarComponentes() {
        setPrefSize(400,300);
        setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);


        setMinSize(500,600);
        setMinSize(250,300);

        TableColumn<AppAlmacen, String> identificador = new TableColumn<>("Identificador");
        TableColumn<AppAlmacen, String> nopro = new TableColumn<>("No. Producto");
        TableColumn<AppAlmacen, String> stock = new TableColumn<>("Stock");

        identificador.setCellValueFactory(new PropertyValueFactory<>("identificador"));
        nopro.setCellValueFactory(new PropertyValueFactory<>("nombrepro"));
        stock.setCellValueFactory(new PropertyValueFactory<>("stock"));

       getColumns().add(identificador);
       getColumns().add(nopro);
       getColumns().add(stock);

        almacens= FXCollections.observableArrayList( new AppAlmacen("xhdkdkl","movil 1","10"),
                new AppAlmacen("xjdjdj","movil 2","15"));
        setItems(almacens);



    }

}
