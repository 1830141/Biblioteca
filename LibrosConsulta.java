package com.alanzap;

public class LibrosConsulta {

    private String ISBN;
    private String Autor;
    private String Titulo;
    private String Editorial;
    private String Anio;
    private String Direccion;
    private String Volumen;
    private String Serie;
    private String Edicion;
    private String Mes;
    private String Tipo;
    private String Disponibilidad;

    public LibrosConsulta(String ISBN, String autor, String titulo, String editorial, String anio, String direccion, String volumen, String serie, String edicion, String mes, String tipo, String disponibilidad) {
        this.ISBN = ISBN;
        Autor = autor;
        Titulo = titulo;
        Editorial = editorial;
        Anio = anio;
        Direccion = direccion;
        Volumen = volumen;
        Serie = serie;
        Edicion = edicion;
        Mes = mes;
        Tipo = tipo;
        Disponibilidad = disponibilidad;

    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String anio) {
        Anio = anio;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getVolumen() {
        return Volumen;
    }

    public void setVolumen(String volumen) {
        Volumen = volumen;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String serie) {
        Serie = serie;
    }

    public String getEdicion() {
        return Edicion;
    }

    public void setEdicion(String edicion) {
        Edicion = edicion;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String mes) {
        Mes = mes;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        Disponibilidad = disponibilidad;
    }
}
