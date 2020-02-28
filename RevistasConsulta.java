package com.alanzap;

public class RevistasConsulta {

    private String Autor;
    private String Titulo;
    private String Journal;
    private String Anio;
    private String Tipo;
    private String Disponibilidad;

    public RevistasConsulta(String autor, String titulo, String journal, String anio, String tipo, String disponibilidad) {
        Autor = autor;
        Titulo = titulo;
        Journal = journal;
        Anio = anio;
        Tipo = tipo;
        Disponibilidad = disponibilidad;
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

    public String getJournal() {
        return Journal;
    }

    public void setJournal(String journal) {
        Journal = journal;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String anio) {
        Anio = anio;
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

