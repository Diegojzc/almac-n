package com.tokioSchool;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.Objects;

public class AppAlmacen {
    public StringProperty identificador;
    public StringProperty nombrepro;
    public StringProperty stock;

    public AppAlmacen(String identificador, String nombrepro, String stock){
        this.identificador = new SimpleStringProperty(identificador);
        this.nombrepro =new SimpleStringProperty(nombrepro) ;
        this.stock = new SimpleStringProperty(stock);

    }


    public String getIdentificador() {
        return identificador.get();
    }

    public StringProperty identificadorProperty() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador.set(identificador);
    }

    public String getNombrepro() {
        return nombrepro.get();
    }

    public StringProperty nombreproProperty() {
        return nombrepro;
    }

    public void setNombrepro(String nombrepro) {
        this.nombrepro.set(nombrepro);
    }

    public String getStock() {
        return stock.get();
    }

    public StringProperty stockProperty() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock.set(stock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, nombrepro, stock);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AppAlmacen)) return false;
        AppAlmacen that = (AppAlmacen) o;
        System.out.println(that + "," + this + "" + Objects.equals(identificador, that.identificador));
        return identificador.get().equals(that.identificador.get());
    }

    @Override
    public String toString() {
        return "AppAlmacen{" +
                "identificador=" + identificador +
                ", nombrepro=" + nombrepro +
                ", stock=" + stock +
                '}';
    }
}
