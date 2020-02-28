package com.alanzap;

public class UsuariosConsulta {

    private String ID;
    private String Nombre;
    private String Apellido;
    private String Telefono;

    public UsuariosConsulta(String ID, String nombre, String apellido, String telefono) {
        this.ID = ID;
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
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

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
}
