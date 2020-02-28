package com.alanzap;

public class PrestamosConsulta {

    private String ID;
    private String Nombre;
    private String ISBN;

    public PrestamosConsulta(String ID, String nombre, String ISBN) {
        this.ID = ID;
        Nombre = nombre;
        this.ISBN = ISBN;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
