package com.alanzap;

public class TesisConsulta {

    private String Autor;
    private String Titulo;
    private String Universidad;
    private String Anio;
    private String Tipo;
    private String Disponibilidad;

    public TesisConsulta(String autor, String titulo, String universidad, String anio, String tipo, String disponibilidad) {
        Autor = autor;
        Titulo = titulo;
        Universidad = universidad;
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

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String universidad) {
        Universidad = universidad;
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
