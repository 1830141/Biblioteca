package com.alanzap;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;

import java.util.ResourceBundle;


public class FXMLController implements Initializable {

    @FXML
    Button btnConsulta;
    @FXML
    Button btnConsultaLibros;
    @FXML
    Button btnConsultaTesis;
    @FXML
    Button btnConsultaRevistas;
    @FXML
    Button btnAgregarLibros;
    @FXML
    Button btnAddLib;
    @FXML
    Button btnDeleteLib;
    @FXML
    Button btnModifLibro;
    @FXML
    Button btnSelecLibro;
    @FXML
    Button btnBTXLibros;
    @FXML
    Button btnVolverRC;
    @FXML
    Button btnVolverAL;
    @FXML
    Button btnVolverRF;
    @FXML
    Button btnConsultaUsuarios;
    @FXML
    Button btnAgregarRF;
    @FXML
    Button btnAddRev;
    @FXML
    Button btnAbrirAddUser;
    @FXML
    Button btnAddUser;
    @FXML
    Button btnEliminarUser;
    @FXML
    Button btnSelecUsers;
    @FXML
    Button btnModifUsers;
    @FXML
    Button btnEliminarRevistas;
    @FXML
    Button btnSeleccionarRevistas;
    @FXML
    Button btnModificarRevistas;
    @FXML
    Button btnMostrarAgregarTT;
    @FXML
    Button btnAgregarTesis;
    @FXML
    Button btnEliminarTesis;
    @FXML
    Button btnSeleccionarTesis;
    @FXML
    Button btnModificarTesis;
    @FXML
    Button btnAgregarPrestamo;
    @FXML
    Button btnEliminarPrestamo;
    @FXML
    Button btnCargarPrestamos;
    @FXML
    Button btnVolverPrestamo;
    @FXML
    Button btnVolverTRef;
    @FXML
    Button btnCargarTesis;
    @FXML
    Button btnVolverRRef;
    @FXML
    Button btnCargarRevistas;
    @FXML
    Button btnCargarLibros;
    @FXML
    Button btnVolverUMenu;
    @FXML
    Button btnCargarUsuarios;
    @FXML
    Button btnConsultaPrestamos;
    @FXML
    Button btnVolverBTXLibros;
    @FXML
    Button btnBTXRevistas;
    @FXML
    Button btnAgregarBTXRevistas;
    @FXML
    Button btnVolverBTXRevistas;
    @FXML
    Button btnBTXTesis;
    @FXML
    Button btnVolverBTXTesis;
    @FXML
    Button btnAgregarBTXTesis;
    @FXML
    Button btnAgregarBTXLibros;


    @FXML
    TextArea BTXLibros;
    @FXML
    TextArea BTXRevistas;
    @FXML
    TextArea BTXTesis;


    @FXML
    TextField txtISBN; //Libros
    @FXML
    TextField txtAutor;
    @FXML
    TextField txtTitulo;
    @FXML
    TextField txtEditorial;
    @FXML
    TextField txtAnio;
    @FXML
    TextField txtDireccion;
    @FXML
    TextField txtVolumen;
    @FXML
    TextField txtSerie;
    @FXML
    TextField txtEdicion;
    @FXML
    TextField txtMes;
    @FXML
    TextField txtTipo;
    @FXML
    TextField txtDisp;
    @FXML
    TextField txtModifISBN;
    @FXML
    TextField txtModifAutor;
    @FXML
    TextField txtModifTitulo;
    @FXML
    TextField txtModifEditorial;
    @FXML
    TextField txtModifAnio;
    @FXML
    TextField txtModifDireccion;
    @FXML
    TextField txtModifVolumen;
    @FXML
    TextField txtModifSerie;
    @FXML
    TextField txtModifEdicion;
    @FXML
    TextField txtModifMes;
    @FXML
    TextField txtModifTipo;
    @FXML
    TextField txtModifDisp;


    @FXML
    TextField txtAutorR; // Revistas
    @FXML
    TextField txtTituloR;
    @FXML
    TextField txtJournalR;
    @FXML
    TextField txtAnioR;
    @FXML
    TextField txtTipoR;
    @FXML
    TextField txtDispR;
    @FXML
    TextField txtModifAutorR;
    @FXML
    TextField txtModifTituloR;
    @FXML
    TextField txtModifJournalR;
    @FXML
    TextField txtModifAnioR;
    @FXML
    TextField txtModifTipoR;
    @FXML
    TextField txtModifDispR;


    @FXML
    TextField txtAgregarAutorTT; //Tesis/Tesinas
    @FXML
    TextField txtAgregarTituloTT;
    @FXML
    TextField txtAgregarUniTT;
    @FXML
    TextField txtAgregarAnioTT;
    @FXML
    TextField txtAgregarTipoTT;
    @FXML
    TextField txtAgregarDispTT;
    @FXML
    TextField txtModifAutorTT;
    @FXML
    TextField txtModifTituloTT;
    @FXML
    TextField txtModifUniTT;
    @FXML
    TextField txtModifAnioTT;
    @FXML
    TextField txtModifTipoTT;
    @FXML
    TextField txtModifDispTT;

    @FXML
    TextField txtIDU; //Usuarios
    @FXML
    TextField txtNombreU;
    @FXML
    TextField txtApellidoU;
    @FXML
    TextField txtTelefonoU;
    @FXML
    TextField txtModifIDU;
    @FXML
    TextField txtModifNomU;
    @FXML
    TextField txtModifApeU;
    @FXML
    TextField txtModifTelU;

    @FXML
    TextField txtIDPrestamo;
    @FXML
    TextField txtNombrePrestamo;
    @FXML
    TextField txtISBNPrestamo;


    @FXML
    TableView<LibrosConsulta> tablaLibrosC;
    @FXML
    TableColumn<LibrosConsulta, String> columnaISBNLC;
    @FXML
    TableColumn<LibrosConsulta, String> columnaautorLC;
    @FXML
    TableColumn<LibrosConsulta, String> columnatituloLC;
    @FXML
    TableColumn<LibrosConsulta, String> columnaeditorialLC;
    @FXML
    TableColumn<LibrosConsulta, String> columnaanioLC;
    @FXML
    TableColumn<LibrosConsulta, String> columnadireccionLC;
    @FXML
    TableColumn<LibrosConsulta, String> columnavolumenLC;
    @FXML
    TableColumn<LibrosConsulta, String> columnaserieLC;
    @FXML
    TableColumn<LibrosConsulta, String> columnaedicionLC;
    @FXML
    TableColumn<LibrosConsulta, String> columnamesLC;
    @FXML
    TableColumn<LibrosConsulta, String> columnatipoLC;
    @FXML
    TableColumn<LibrosConsulta, String> columnadispLC;

    @FXML
    TableView<RevistasConsulta> tablaRevistas;
    @FXML
    TableColumn<RevistasConsulta, String> columnaautorR;
    @FXML
    TableColumn<RevistasConsulta, String> columnatituloR;
    @FXML
    TableColumn<RevistasConsulta, String> columnajournalR;
    @FXML
    TableColumn<RevistasConsulta, String> columnaanioR;
    @FXML
    TableColumn<RevistasConsulta, String> columnatipoR;
    @FXML
    TableColumn<RevistasConsulta, String> columnadispR;

    @FXML
    TableView<TesisConsulta> tablaTesis;
    @FXML
    TableColumn<TesisConsulta, String> columnaautorTT;
    @FXML
    TableColumn<TesisConsulta, String> columnatituloTT;
    @FXML
    TableColumn<TesisConsulta, String> columnauniTT;
    @FXML
    TableColumn<TesisConsulta, String> columnaanioTT;
    @FXML
    TableColumn<TesisConsulta, String> columnatipoTT;
    @FXML
    TableColumn<TesisConsulta, String> columnadispTT;

    @FXML
    TableView<UsuariosConsulta> tablaUsuarios;
    @FXML
    TableColumn<UsuariosConsulta, String> columnaIDU;
    @FXML
    TableColumn<UsuariosConsulta, String> columnaNombreU;
    @FXML
    TableColumn<UsuariosConsulta, String> columnaApellidoU;
    @FXML
    TableColumn<UsuariosConsulta, String> columnaTelefonoU;

    @FXML
    TableView<PrestamosConsulta> tablaPrestamos;
    @FXML
    TableColumn<PrestamosConsulta, String> columnaIDP;
    @FXML
    TableColumn<PrestamosConsulta, String> columnaNombreP;
    @FXML
    TableColumn<PrestamosConsulta, String> columnaISBNP;


    String ISBN = "", autor = "", titulo = "", editorial = "", anio = "", direccion = "", volumen = "", serie = "", edicion = "", mes = "", tipo = "", disponibilidad = "", journal = "", universidad = "", ID = "", nombre = "", apellido = "", telefono = "";
    App app = new App();
    ObtenerDatos obtenerdatos = new ObtenerDatos();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void SigConsultaLibros() {
        app.RecursosConsulta();
        Stage stage = (Stage) this.btnConsultaLibros.getScene().getWindow();
        stage.close();
    }

    public void SigMenuR() {
        app.Referencias();
        Stage stage = (Stage) this.btnConsulta.getScene().getWindow();
        stage.close();
    }

    public void AgregarL() {
        app.AgregarLibros();
        Stage stage = (Stage) this.btnAgregarLibros.getScene().getWindow();
        stage.close();
    }

    public ObservableList<LibrosConsulta> getLibros() {
        ObtenerDatos obtenerdatos = new ObtenerDatos();
        ObservableList<LibrosConsulta> LibrosC = FXCollections.observableArrayList();
        ArrayList<LibrosConsulta> arrayLibrosC = new ArrayList<>();

        arrayLibrosC = obtenerdatos.ObtenerLibros();

        for (int i = 1; i < arrayLibrosC.size(); i++) {
            ISBN = arrayLibrosC.get(i).getISBN();
            autor = arrayLibrosC.get(i).getAutor();
            titulo = arrayLibrosC.get(i).getTitulo();
            editorial = arrayLibrosC.get(i).getEditorial();
            anio = arrayLibrosC.get(i).getAnio();
            direccion = arrayLibrosC.get(i).getDireccion();
            volumen = arrayLibrosC.get(i).getVolumen();
            serie = arrayLibrosC.get(i).getSerie();
            edicion = arrayLibrosC.get(i).getEdicion();
            mes = arrayLibrosC.get(i).getMes();
            tipo = arrayLibrosC.get(i).getTipo();
            disponibilidad = arrayLibrosC.get(i).getDisponibilidad();
            LibrosC.add(new LibrosConsulta(ISBN, autor, titulo, editorial, anio, direccion, volumen, serie, edicion, mes, tipo, disponibilidad));
        }

        return LibrosC;
    }

    public void CargarLibros() {
        try {

            columnaISBNLC.setCellValueFactory(new PropertyValueFactory<LibrosConsulta, String>("ISBN"));
            columnaautorLC.setCellValueFactory(new PropertyValueFactory<LibrosConsulta, String>("Autor"));
            columnatituloLC.setCellValueFactory(new PropertyValueFactory<LibrosConsulta, String>("Titulo"));
            columnaeditorialLC.setCellValueFactory(new PropertyValueFactory<LibrosConsulta, String>("Editorial"));
            columnaanioLC.setCellValueFactory(new PropertyValueFactory<LibrosConsulta, String>("Anio"));
            columnadireccionLC.setCellValueFactory(new PropertyValueFactory<LibrosConsulta, String>("Direccion"));
            columnavolumenLC.setCellValueFactory(new PropertyValueFactory<LibrosConsulta, String>("Volumen"));
            columnaserieLC.setCellValueFactory(new PropertyValueFactory<LibrosConsulta, String>("Serie"));
            columnaedicionLC.setCellValueFactory(new PropertyValueFactory<LibrosConsulta, String>("Edicion"));
            columnamesLC.setCellValueFactory(new PropertyValueFactory<LibrosConsulta, String>("Mes"));
            columnatipoLC.setCellValueFactory(new PropertyValueFactory<LibrosConsulta, String>("Tipo"));
            columnadispLC.setCellValueFactory(new PropertyValueFactory<LibrosConsulta, String>("Disponibilidad"));
            tablaLibrosC.setItems(getLibros());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void nuevoLibro() {

        ObservableList<LibrosConsulta> ObservarLibros = FXCollections.observableArrayList();
        try {
            String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\LibrosConsulta.xlsx";
            ArrayList<LibrosConsulta> arrayLibrosC = new ArrayList<>();
            arrayLibrosC = obtenerdatos.ObtenerLibros();

            String hoja = "Hoja1";
            XSSFWorkbook libro = new XSSFWorkbook();
            XSSFSheet hoja1 = libro.createSheet(hoja);
            int celdasAsignadas = 0;

            if (!txtISBN.getText().equals("") || !txtAutor.getText().equals("") || !txtTitulo.getText().equals("") || !txtEditorial.getText().equals("") || txtAnio.getText().equals("") || txtDireccion.getText().equals("") || txtVolumen.getText().equals("") || txtSerie.getText().equals("") || txtEdicion.getText().equals("") || txtMes.getText().equals("") || txtTipo.getText().equals("") || !txtDisp.getText().equals("")) {
                System.out.println("Entra al if");
                arrayLibrosC.add(new LibrosConsulta(txtISBN.getText(), txtAutor.getText(), txtTitulo.getText(), txtEditorial.getText(), txtAnio.getText(), txtDireccion.getText(), txtVolumen.getText(), txtSerie.getText(), txtEdicion.getText(), txtMes.getText(), txtTipo.getText(), txtDisp.getText()));

                for (int i = 0; i < arrayLibrosC.size(); i++) {
                    XSSFRow row = hoja1.createRow(i);
                    for (int j = 0; j < 12; j++) {
                        XSSFCell cell = row.createCell(j);
                        if (celdasAsignadas == 0) {
                            cell.setCellValue(arrayLibrosC.get(i).getISBN());
                        } else if (celdasAsignadas == 1) {
                            cell.setCellValue(arrayLibrosC.get(i).getAutor());
                        } else if (celdasAsignadas == 2) {
                            cell.setCellValue(arrayLibrosC.get(i).getTitulo());
                        } else if (celdasAsignadas == 3) {
                            cell.setCellValue(arrayLibrosC.get(i).getEditorial());
                        } else if (celdasAsignadas == 4) {
                            cell.setCellValue(arrayLibrosC.get(i).getAnio());
                        } else if (celdasAsignadas == 5) {
                            cell.setCellValue(arrayLibrosC.get(i).getDireccion());
                        } else if (celdasAsignadas == 6) {
                            cell.setCellValue(arrayLibrosC.get(i).getVolumen());
                        } else if (celdasAsignadas == 7) {
                            cell.setCellValue(arrayLibrosC.get(i).getSerie());
                        } else if (celdasAsignadas == 8) {
                            cell.setCellValue(arrayLibrosC.get(i).getEdicion());
                        } else if (celdasAsignadas == 9) {
                            cell.setCellValue(arrayLibrosC.get(i).getMes());
                        } else if (celdasAsignadas == 10) {
                            cell.setCellValue(arrayLibrosC.get(i).getTipo());
                        } else if (celdasAsignadas == 11) {
                            cell.setCellValue(arrayLibrosC.get(i).getDisponibilidad());
                        }
                        celdasAsignadas++;
                    }
                    celdasAsignadas = 0;
                }
                File file;
                file = new File(rutaArchivo);
                try (FileOutputStream fileOuS = new FileOutputStream(file)) {
                    if (file.exists()) {
                        file.delete();
                        System.out.println("Eliminado");
                    }
                    libro.write(fileOuS);
                    fileOuS.flush();
                    fileOuS.close();
                    System.out.println("Creado");

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            app.RecursosConsulta();
            Stage stage = (Stage) this.btnAddLib.getScene().getWindow();
            stage.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Efffffffffe");
        }

    }

    public void EliminarLibro() {
        String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\LibrosConsulta.xlsx";
        ArrayList<LibrosConsulta> arrayLibrosC = new ArrayList<>();

        try {
            LibrosConsulta librosConsulta = tablaLibrosC.getSelectionModel().getSelectedItem();
            arrayLibrosC = obtenerdatos.ObtenerLibros();

            for (int i = 0; i < arrayLibrosC.size(); i++) {
                if (librosConsulta.getISBN().equals(arrayLibrosC.get(i).getISBN()) && librosConsulta.getAutor().equals(arrayLibrosC.get(i).getAutor())) {
                    arrayLibrosC.remove(i);
                }
            }

            String hoja = "Hoja1";
            XSSFWorkbook libro = new XSSFWorkbook();
            XSSFSheet hoja1 = libro.createSheet(hoja);
            int celdasAsignadas = 0;

            for (int i = 0; i < arrayLibrosC.size(); i++) {
                XSSFRow row = hoja1.createRow(i);

                for (int j = 0; j < 12; j++) {
                    XSSFCell cell = row.createCell(j);
                    if (celdasAsignadas == 0) {
                        cell.setCellValue(arrayLibrosC.get(i).getISBN());
                    } else if (celdasAsignadas == 1) {
                        cell.setCellValue(arrayLibrosC.get(i).getAutor());
                    } else if (celdasAsignadas == 2) {
                        cell.setCellValue(arrayLibrosC.get(i).getTitulo());
                    } else if (celdasAsignadas == 3) {
                        cell.setCellValue(arrayLibrosC.get(i).getEditorial());
                    } else if (celdasAsignadas == 4) {
                        cell.setCellValue(arrayLibrosC.get(i).getAnio());
                    } else if (celdasAsignadas == 5) {
                        cell.setCellValue(arrayLibrosC.get(i).getDireccion());
                    } else if (celdasAsignadas == 6) {
                        cell.setCellValue(arrayLibrosC.get(i).getVolumen());
                    } else if (celdasAsignadas == 7) {
                        cell.setCellValue(arrayLibrosC.get(i).getSerie());
                    } else if (celdasAsignadas == 8) {
                        cell.setCellValue(arrayLibrosC.get(i).getEdicion());
                    } else if (celdasAsignadas == 9) {
                        cell.setCellValue(arrayLibrosC.get(i).getMes());
                    } else if (celdasAsignadas == 10) {
                        cell.setCellValue(arrayLibrosC.get(i).getTipo());
                    } else if (celdasAsignadas == 11) {
                        cell.setCellValue(arrayLibrosC.get(i).getDisponibilidad());
                    }
                    celdasAsignadas++;
                }
                celdasAsignadas = 0;
            }
            File file;
            file = new File(rutaArchivo);
            try (FileOutputStream fileOuS = new FileOutputStream(file)) {
                if (file.exists()) {
                    file.delete();
                    System.out.println("Eliminado");
                }
                libro.write(fileOuS);
                fileOuS.flush();
                fileOuS.close();
                System.out.println("Creado");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

            tablaLibrosC.setItems(getLibros());

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("EFffffffffisima");
        }
    }

    public void SelectL() {
        String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\LibrosConsulta.xlsx";
        LibrosConsulta librosConsulta = tablaLibrosC.getSelectionModel().getSelectedItem();
        ArrayList<LibrosConsulta> arrayLibrosC = new ArrayList<>();
        arrayLibrosC = obtenerdatos.ObtenerLibros();

        try {
            for (int i = 0; i < arrayLibrosC.size(); i++) {
                if (librosConsulta.getISBN().equals(arrayLibrosC.get(i).getISBN())) {
                    txtModifISBN.setText(librosConsulta.getISBN());
                    txtModifAutor.setText(librosConsulta.getAutor());
                    txtModifTitulo.setText(librosConsulta.getTitulo());
                    txtModifEditorial.setText(librosConsulta.getEditorial());
                    txtModifAnio.setText(librosConsulta.getAnio());
                    txtModifDireccion.setText(librosConsulta.getDireccion());
                    txtModifVolumen.setText(librosConsulta.getVolumen());
                    txtModifSerie.setText(librosConsulta.getSerie());
                    txtModifEdicion.setText(librosConsulta.getEdicion());
                    txtModifMes.setText(librosConsulta.getMes());
                    txtModifTipo.setText(librosConsulta.getTipo());
                    txtModifDisp.setText(librosConsulta.getDisponibilidad());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void ModificarLibro() {
        String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\LibrosConsulta.xlsx";
        LibrosConsulta librosConsulta = tablaLibrosC.getSelectionModel().getSelectedItem();
        ArrayList<LibrosConsulta> arrayLibrosC = new ArrayList<>();
        arrayLibrosC = obtenerdatos.ObtenerLibros();

        for (int i = 0; i < arrayLibrosC.size(); i++) {
            if (librosConsulta.getISBN().equals(arrayLibrosC.get(i).getISBN()) && !txtModifAutor.getText().equals("") && !txtModifTitulo.getText().equals("") && !txtModifEditorial.getText().equals("") && !txtModifAnio.getText().equals("") && !txtModifDireccion.getText().equals("") && !txtModifVolumen.getText().equals("") && !txtModifSerie.getText().equals("") && !txtModifEdicion.getText().equals("") && !txtModifMes.getText().equals("") && !txtModifTipo.getText().equals("") && !txtModifDisp.getText().equals("")) {
                arrayLibrosC.get(i).setISBN(txtModifISBN.getText());
                arrayLibrosC.get(i).setAutor(txtModifAutor.getText());
                arrayLibrosC.get(i).setTitulo(txtModifTitulo.getText());
                arrayLibrosC.get(i).setEditorial(txtModifEditorial.getText());
                arrayLibrosC.get(i).setAnio(txtModifAnio.getText());
                arrayLibrosC.get(i).setDireccion(txtModifDireccion.getText());
                arrayLibrosC.get(i).setVolumen(txtModifVolumen.getText());
                arrayLibrosC.get(i).setSerie(txtModifSerie.getText());
                arrayLibrosC.get(i).setEdicion(txtModifEdicion.getText());
                arrayLibrosC.get(i).setMes(txtModifMes.getText());
                arrayLibrosC.get(i).setTipo(txtModifTipo.getText());
                arrayLibrosC.get(i).setDisponibilidad(txtModifDisp.getText());

            }
        }
        String hoja = "Hoja1";
        XSSFWorkbook libro = new XSSFWorkbook();
        XSSFSheet hoja1 = libro.createSheet(hoja);
        int celdasAsignadas = 0;

        for (int i = 0; i < arrayLibrosC.size(); i++) {
            XSSFRow row = hoja1.createRow(i);

            for (int j = 0; j < 12; j++) {
                XSSFCell cell = row.createCell(j);
                if (celdasAsignadas == 0) {
                    cell.setCellValue(arrayLibrosC.get(i).getISBN());
                } else if (celdasAsignadas == 1) {
                    cell.setCellValue(arrayLibrosC.get(i).getAutor());
                } else if (celdasAsignadas == 2) {
                    cell.setCellValue(arrayLibrosC.get(i).getTitulo());
                } else if (celdasAsignadas == 3) {
                    cell.setCellValue(arrayLibrosC.get(i).getEditorial());
                } else if (celdasAsignadas == 4) {
                    cell.setCellValue(arrayLibrosC.get(i).getAnio());
                } else if (celdasAsignadas == 5) {
                    cell.setCellValue(arrayLibrosC.get(i).getDireccion());
                } else if (celdasAsignadas == 6) {
                    cell.setCellValue(arrayLibrosC.get(i).getVolumen());
                } else if (celdasAsignadas == 7) {
                    cell.setCellValue(arrayLibrosC.get(i).getSerie());
                } else if (celdasAsignadas == 8) {
                    cell.setCellValue(arrayLibrosC.get(i).getEdicion());
                } else if (celdasAsignadas == 9) {
                    cell.setCellValue(arrayLibrosC.get(i).getMes());
                } else if (celdasAsignadas == 10) {
                    cell.setCellValue(arrayLibrosC.get(i).getTipo());
                } else if (celdasAsignadas == 11) {
                    cell.setCellValue(arrayLibrosC.get(i).getDisponibilidad());
                }
                celdasAsignadas++;
            }
            celdasAsignadas = 0;
        }
        File file;
        file = new File(rutaArchivo);
        try (FileOutputStream fileOuS = new FileOutputStream(file)) {
            if (file.exists()) {
                file.delete();
                System.out.println("Eliminado");
            }
            libro.write(fileOuS);
            fileOuS.flush();
            fileOuS.close();
            System.out.println("Creado");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        tablaLibrosC.setItems(getLibros());
        txtModifISBN.setText("");
        txtModifAutor.setText("");
        txtModifTitulo.setText("");
        txtModifEditorial.setText("");
        txtModifAnio.setText("");
        txtModifDireccion.setText("");
        txtModifVolumen.setText("");
        txtModifSerie.setText("");
        txtModifEdicion.setText("");
        txtModifMes.setText("");
        txtModifTipo.setText("");
        txtModifDisp.setText("");

    }

    public void AbrirBTXLibros() {
        app.BTXLibros();
        Stage stage = (Stage) this.btnBTXLibros.getScene().getWindow();
        stage.close();
    }

    public void AgregarBTXLibros() {
        ObservableList<LibrosConsulta> ObservarLibros = FXCollections.observableArrayList();

        try {
            String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\LibrosConsulta.xlsx";
            ArrayList<LibrosConsulta> arrayLibrosC = new ArrayList<>();
            arrayLibrosC = obtenerdatos.ObtenerLibros();

            String hoja = "Hoja1";
            XSSFWorkbook libro = new XSSFWorkbook();
            XSSFSheet hoja1 = libro.createSheet(hoja);
            int celdasAsignadas = 0;
            int n = 1;
            String libro1 = BTXLibros.getText();
            String parteCadena = "";

            int tamañoCadena = libro1.length();

            while ((libro1.indexOf('{')) != -1) {
                parteCadena = libro1.substring(libro1.indexOf('{') + 1, libro1.indexOf('}'));
                switch (n) {
                    case 7:
                        ISBN = parteCadena;
                        break;
                    case 1:
                        autor = parteCadena;
                        break;
                    case 2:
                        titulo = parteCadena;
                        break;
                    case 3:
                        editorial = parteCadena;
                        break;
                    case 4:
                        anio = parteCadena;
                        break;
                    case 5:
                        direccion = parteCadena;
                        break;
                    case 8:
                        volumen = parteCadena;
                        break;
                    case 9:
                        serie = parteCadena;
                        break;
                    case 6:
                        edicion = parteCadena;
                        break;
                    case 10:
                        mes = parteCadena;
                        break;
                }

                libro1 = libro1.substring(libro1.indexOf('}') + 1, tamañoCadena);
                tamañoCadena = libro1.length();
                n++;
            }

            tipo = "";
            disponibilidad = "Disponible";

            if (ISBN.equals("") || autor.equals("") || titulo.equals("") || editorial.equals("") || anio.equals("") || direccion.equals("") || volumen.equals("") || serie.equals("") || edicion.equals("") || mes.equals("") || tipo.equals("") || disponibilidad.equals("")) {
                arrayLibrosC.add(new LibrosConsulta(ISBN, autor, titulo, editorial, anio, direccion, volumen, serie, edicion, mes, tipo, disponibilidad));
                for(int i=0; i<arrayLibrosC.size();i++){
                    XSSFRow row = hoja1.createRow(i);
                    for(int j=0;j<12;j++){
                        XSSFCell cell = row.createCell(j);
                        if(celdasAsignadas == 0){
                            cell.setCellValue(arrayLibrosC.get(i).getISBN());
                        } else if(celdasAsignadas == 1){
                            cell.setCellValue(arrayLibrosC.get(i).getAutor());
                        } else if(celdasAsignadas == 2){
                            cell.setCellValue(arrayLibrosC.get(i).getTitulo());
                        } else if(celdasAsignadas == 3){
                            cell.setCellValue(arrayLibrosC.get(i).getEditorial());
                        } else if(celdasAsignadas == 4){
                            cell.setCellValue(arrayLibrosC.get(i).getAnio());
                        } else if(celdasAsignadas == 5){
                            cell.setCellValue(arrayLibrosC.get(i).getDireccion());
                        } else if(celdasAsignadas == 6){
                            cell.setCellValue(arrayLibrosC.get(i).getVolumen());
                        } else if(celdasAsignadas == 7){
                            cell.setCellValue(arrayLibrosC.get(i).getSerie());
                        } else if(celdasAsignadas == 8){
                            cell.setCellValue(arrayLibrosC.get(i).getEdicion());
                        } else if(celdasAsignadas == 9){
                            cell.setCellValue(arrayLibrosC.get(i).getMes());
                        } else if(celdasAsignadas == 10){
                            cell.setCellValue(arrayLibrosC.get(i).getTipo());
                        } else if(celdasAsignadas == 11){
                            cell.setCellValue(arrayLibrosC.get(i).getDisponibilidad());
                        }
                        celdasAsignadas++;
                    }
                    celdasAsignadas = 0;
                }
                File file;
                file = new File(rutaArchivo);
                try(FileOutputStream fileOuS = new FileOutputStream(file)){
                    if(file.exists()){
                        file.delete();
                        System.out.println("Eliminado");
                    }
                    libro.write(fileOuS);
                    fileOuS.flush();
                    fileOuS.close();
                    System.out.println("Creado");

                }catch (FileNotFoundException e){
                    e.printStackTrace();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            app.RecursosConsulta();
            Stage stage = (Stage)this.btnAgregarBTXLibros.getScene().getWindow();
            stage.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("EFffffffffe");
        }
    }

    public void VolverBTXLibros() {
        app.RecursosConsulta();
        Stage stage = (Stage) this.btnVolverBTXLibros.getScene().getWindow();
        stage.close();
    }

    public void VolverAReferencias() {
        app.Referencias();
        Stage stage = (Stage) this.btnVolverRC.getScene().getWindow();
        stage.close();
    }

    public void VolverAReferenciasT() {
        app.Referencias();
        Stage stage = (Stage) this.btnVolverTRef.getScene().getWindow();
        stage.close();
    }

    public void VolverAReferenciasR() {
        app.Referencias();
        Stage stage = (Stage) this.btnVolverRRef.getScene().getWindow();
        stage.close();
    }

    public void VolverARecursosConsulta() {
        app.RecursosConsulta();
        Stage stage = (Stage) this.btnVolverAL.getScene().getWindow();
        stage.close();
    }

    public void EntraUsuarios() {
        app.Usuarios();
        Stage stage = (Stage) this.btnConsultaUsuarios.getScene().getWindow();
        stage.close();

    }

    public ObservableList<RevistasConsulta> getRevistas() {
        ObtenerDatos obtenerdatos = new ObtenerDatos();
        ObservableList<RevistasConsulta> RevistasC = FXCollections.observableArrayList();
        ArrayList<RevistasConsulta> arrayRevistasC = new ArrayList<>();

        arrayRevistasC = obtenerdatos.ObtenerRevistas();

        for (int i = 1; i < arrayRevistasC.size(); i++) {
            autor = arrayRevistasC.get(i).getAutor();
            titulo = arrayRevistasC.get(i).getTitulo();
            journal = arrayRevistasC.get(i).getJournal();
            anio = arrayRevistasC.get(i).getAnio();
            tipo = arrayRevistasC.get(i).getTipo();
            disponibilidad = arrayRevistasC.get(i).getDisponibilidad();
            RevistasC.add(new RevistasConsulta(autor, titulo, journal, anio, tipo, disponibilidad));
        }

        return RevistasC;
    }

    public void sigConsultaRevistas() {
        app.ReferenciasR();
        Stage stage = (Stage) this.btnConsultaRevistas.getScene().getWindow();
        stage.close();
    }

    public void CargarRevistas() {
        try {
            columnaautorR.setCellValueFactory(new PropertyValueFactory<RevistasConsulta, String>("Autor"));
            columnatituloR.setCellValueFactory(new PropertyValueFactory<RevistasConsulta, String>("Titulo"));
            columnajournalR.setCellValueFactory(new PropertyValueFactory<RevistasConsulta, String>("Journal"));
            columnaanioR.setCellValueFactory(new PropertyValueFactory<RevistasConsulta, String>("Anio"));
            columnatipoR.setCellValueFactory(new PropertyValueFactory<RevistasConsulta, String>("Tipo"));
            columnadispR.setCellValueFactory(new PropertyValueFactory<RevistasConsulta, String>("Disponibilidad"));
            tablaRevistas.setItems(getRevistas());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void AbrirBTXRevistas() {
        app.BTXRevistas();
        Stage stage = (Stage) this.btnBTXRevistas.getScene().getWindow();
        stage.close();
    }

    public void AgregarBTXRevistas() {
        ObservableList<RevistasConsulta> ObservarRevistas = FXCollections.observableArrayList();

        try {
            String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\RevistasConsulta.xlsx";
            ArrayList<RevistasConsulta> arrayRevistasC = new ArrayList<>();
            arrayRevistasC = obtenerdatos.ObtenerRevistas();

            String hoja = "Hoja1";
            XSSFWorkbook libro = new XSSFWorkbook();
            XSSFSheet hoja1 = libro.createSheet(hoja);
            int celdasAsignadas = 0;
            int n = 1;
            String libro1 = BTXRevistas.getText();
            String parteCadena = "";

            int tamañoCadena = libro1.length();

            while ((libro1.indexOf('{')) != -1) {
                parteCadena = libro1.substring(libro1.indexOf('{') + 1, libro1.indexOf('}'));
                switch (n) {
                    case 1:
                        autor = parteCadena;
                        break;
                    case 2:
                        titulo = parteCadena;
                        break;
                    case 3:
                        journal = parteCadena;
                        break;
                    case 4:
                        anio = parteCadena;
                        break;

                }

                libro1 = libro1.substring(libro1.indexOf('}') + 1, tamañoCadena);
                tamañoCadena = libro1.length();
                n++;
            }

            tipo = "";
            disponibilidad = "Disponible";

            if (autor.equals("") || titulo.equals("") || journal.equals("") || anio.equals("") || tipo.equals("") || disponibilidad.equals("")) {
                arrayRevistasC.add(new RevistasConsulta(autor, titulo, journal, anio, tipo, disponibilidad));
                for(int i=0; i<arrayRevistasC.size();i++){
                    XSSFRow row = hoja1.createRow(i);
                    for(int j=0;j<6;j++){
                        XSSFCell cell = row.createCell(j);
                        if(celdasAsignadas == 0){
                            cell.setCellValue(arrayRevistasC.get(i).getAutor());
                        } else if(celdasAsignadas == 1){
                            cell.setCellValue(arrayRevistasC.get(i).getTitulo());
                        } else if(celdasAsignadas == 2){
                            cell.setCellValue(arrayRevistasC.get(i).getJournal());
                        } else if(celdasAsignadas == 3){
                            cell.setCellValue(arrayRevistasC.get(i).getAnio());
                        } else if(celdasAsignadas == 4){
                            cell.setCellValue(arrayRevistasC.get(i).getTipo());
                        } else if(celdasAsignadas == 5){
                            cell.setCellValue(arrayRevistasC.get(i).getDisponibilidad());
                        }
                        celdasAsignadas++;
                    }
                    celdasAsignadas = 0;
                }
                File file;
                file = new File(rutaArchivo);
                try(FileOutputStream fileOuS = new FileOutputStream(file)){
                    if(file.exists()){
                        file.delete();
                        System.out.println("Eliminado");
                    }
                    libro.write(fileOuS);
                    fileOuS.flush();
                    fileOuS.close();
                    System.out.println("Creado");

                }catch (FileNotFoundException e){
                    e.printStackTrace();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            app.ReferenciasR();
            Stage stage = (Stage)this.btnAgregarBTXRevistas.getScene().getWindow();
            stage.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("EFffffffffe");
        }
    }

    public void VolverBTXRevistas() {
        app.ReferenciasR();
        Stage stage = (Stage) this.btnVolverBTXRevistas.getScene().getWindow();
        stage.close();
    }

    public void AgregarRevista() {
        app.AgregarRevistas();
        Stage stage = (Stage) this.btnAgregarRF.getScene().getWindow();
        stage.close();
    }

    public void AgregarR() {
        ObservableList<RevistasConsulta> ObservarRevistas = FXCollections.observableArrayList();
        try {
            String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\RevistasConsulta.xlsx";
            ArrayList<RevistasConsulta> arrayRevistasC = new ArrayList<>();
            arrayRevistasC = obtenerdatos.ObtenerRevistas();

            String hoja = "Hoja1";
            XSSFWorkbook libro = new XSSFWorkbook();
            XSSFSheet hoja1 = libro.createSheet(hoja);
            int celdasAsignadas = 0;

            if (!txtAutorR.getText().equals("") || !txtTituloR.getText().equals("") || !txtJournalR.getText().equals("") || !txtAnioR.getText().equals("") || txtTipoR.getText().equals("") || txtDispR.getText().equals("")) {
                System.out.println("Entra al if");
                arrayRevistasC.add(new RevistasConsulta(txtAutorR.getText(), txtTituloR.getText(), txtJournalR.getText(), txtAnioR.getText(), txtTipoR.getText(), txtDispR.getText()));

                for (int i = 0; i < arrayRevistasC.size(); i++) {
                    XSSFRow row = hoja1.createRow(i);
                    for (int j = 0; j < 6; j++) {
                        XSSFCell cell = row.createCell(j);
                        if (celdasAsignadas == 0) {
                            cell.setCellValue(arrayRevistasC.get(i).getAutor());
                        } else if (celdasAsignadas == 1) {
                            cell.setCellValue(arrayRevistasC.get(i).getTitulo());
                        } else if (celdasAsignadas == 2) {
                            cell.setCellValue(arrayRevistasC.get(i).getJournal());
                        } else if (celdasAsignadas == 3) {
                            cell.setCellValue(arrayRevistasC.get(i).getAnio());
                        } else if (celdasAsignadas == 4) {
                            cell.setCellValue(arrayRevistasC.get(i).getTipo());
                        } else if (celdasAsignadas == 5) {
                            cell.setCellValue(arrayRevistasC.get(i).getDisponibilidad());
                        }
                        celdasAsignadas++;
                    }
                    celdasAsignadas = 0;
                }
                File file;
                file = new File(rutaArchivo);
                try (FileOutputStream fileOuS = new FileOutputStream(file)) {
                    if (file.exists()) {
                        file.delete();
                        System.out.println("Eliminado");
                    }
                    libro.write(fileOuS);
                    fileOuS.flush();
                    fileOuS.close();
                    System.out.println("Creado");

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            app.ReferenciasR();
            Stage stage = (Stage) this.btnAddRev.getScene().getWindow();
            stage.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Efffffffffe");
        }

    }

    public void EliminarRevista() {
        String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\RevistasConsulta.xlsx";
        ArrayList<RevistasConsulta> arrayRevistasC = new ArrayList<>();

        try {
            RevistasConsulta revistasConsulta = tablaRevistas.getSelectionModel().getSelectedItem();
            arrayRevistasC = obtenerdatos.ObtenerRevistas();

            for (int i = 0; i < arrayRevistasC.size(); i++) {
                if (revistasConsulta.getAutor().equals(arrayRevistasC.get(i).getAutor())) {
                    arrayRevistasC.remove(i);
                }
            }

            String hoja = "Hoja1";
            XSSFWorkbook libro = new XSSFWorkbook();
            XSSFSheet hoja1 = libro.createSheet(hoja);
            int celdasAsignadas = 0;

            for (int i = 0; i < arrayRevistasC.size(); i++) {
                XSSFRow row = hoja1.createRow(i);

                for (int j = 0; j < 6; j++) {
                    XSSFCell cell = row.createCell(j);
                    if (celdasAsignadas == 0) {
                        cell.setCellValue(arrayRevistasC.get(i).getAutor());
                    } else if (celdasAsignadas == 1) {
                        cell.setCellValue(arrayRevistasC.get(i).getTitulo());
                    } else if (celdasAsignadas == 2) {
                        cell.setCellValue(arrayRevistasC.get(i).getJournal());
                    } else if (celdasAsignadas == 3) {
                        cell.setCellValue(arrayRevistasC.get(i).getAnio());
                    } else if (celdasAsignadas == 4) {
                        cell.setCellValue(arrayRevistasC.get(i).getTipo());
                    } else if (celdasAsignadas == 5) {
                        cell.setCellValue(arrayRevistasC.get(i).getDisponibilidad());
                    }
                    celdasAsignadas++;
                }
                celdasAsignadas = 0;
            }
            File file;
            file = new File(rutaArchivo);
            try (FileOutputStream fileOuS = new FileOutputStream(file)) {
                if (file.exists()) {
                    file.delete();
                    System.out.println("Eliminado");
                }
                libro.write(fileOuS);
                fileOuS.flush();
                fileOuS.close();
                System.out.println("Creado");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

            tablaRevistas.setItems(getRevistas());

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("EFffffffffisima");
        }
    }

    public void SeleccionarRevistas() {
        String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\RevistasConsulta.xlsx";
        RevistasConsulta revistasConsulta = tablaRevistas.getSelectionModel().getSelectedItem();
        ArrayList<RevistasConsulta> arrayRevistasC = new ArrayList<>();
        arrayRevistasC = obtenerdatos.ObtenerRevistas();

        try {
            for (int i = 0; i < arrayRevistasC.size(); i++) {
                if (revistasConsulta.getAutor().equals(arrayRevistasC.get(i).getAutor())) {
                    txtModifAutorR.setText(revistasConsulta.getAutor());
                    txtModifTituloR.setText(revistasConsulta.getTitulo());
                    txtModifJournalR.setText(revistasConsulta.getJournal());
                    txtModifAnioR.setText(revistasConsulta.getAnio());
                    txtModifTipoR.setText(revistasConsulta.getTipo());
                    txtModifDispR.setText(revistasConsulta.getDisponibilidad());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ModificarRevistas() {
        String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\RevistasConsulta.xlsx";
        RevistasConsulta revistasConsulta = tablaRevistas.getSelectionModel().getSelectedItem();
        ArrayList<RevistasConsulta> arrayRevistasC = new ArrayList<>();
        arrayRevistasC = obtenerdatos.ObtenerRevistas();

        for (int i = 0; i < arrayRevistasC.size(); i++) {
            if (revistasConsulta.getAutor().equals(arrayRevistasC.get(i).getAutor()) && !txtModifTituloR.getText().equals("") && !txtModifJournalR.getText().equals("") && !txtModifAnioR.getText().equals("") && !txtModifTipoR.getText().equals("") && !txtModifDispR.getText().equals("")) {
                arrayRevistasC.get(i).setAutor(txtModifAutorR.getText());
                arrayRevistasC.get(i).setTitulo(txtModifTituloR.getText());
                arrayRevistasC.get(i).setJournal(txtModifJournalR.getText());
                arrayRevistasC.get(i).setAnio(txtModifAnioR.getText());
                arrayRevistasC.get(i).setTipo(txtModifTipoR.getText());
                arrayRevistasC.get(i).setDisponibilidad(txtModifDispR.getText());

            }
        }
        String hoja = "Hoja1";
        XSSFWorkbook libro = new XSSFWorkbook();
        XSSFSheet hoja1 = libro.createSheet(hoja);
        int celdasAsignadas = 0;

        for (int i = 0; i < arrayRevistasC.size(); i++) {
            XSSFRow row = hoja1.createRow(i);

            for (int j = 0; j < 6; j++) {
                XSSFCell cell = row.createCell(j);
                if (celdasAsignadas == 0) {
                    cell.setCellValue(arrayRevistasC.get(i).getAutor());
                } else if (celdasAsignadas == 1) {
                    cell.setCellValue(arrayRevistasC.get(i).getTitulo());
                } else if (celdasAsignadas == 2) {
                    cell.setCellValue(arrayRevistasC.get(i).getJournal());
                } else if (celdasAsignadas == 3) {
                    cell.setCellValue(arrayRevistasC.get(i).getAnio());
                } else if (celdasAsignadas == 4) {
                    cell.setCellValue(arrayRevistasC.get(i).getTipo());
                } else if (celdasAsignadas == 5) {
                    cell.setCellValue(arrayRevistasC.get(i).getDisponibilidad());
                }
                celdasAsignadas++;
            }
            celdasAsignadas = 0;
        }
        File file;
        file = new File(rutaArchivo);
        try (FileOutputStream fileOuS = new FileOutputStream(file)) {
            if (file.exists()) {
                file.delete();
                System.out.println("Eliminado");
            }
            libro.write(fileOuS);
            fileOuS.flush();
            fileOuS.close();
            System.out.println("Creado");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        tablaRevistas.setItems(getRevistas());
        txtModifAutorR.setText("");
        txtModifTituloR.setText("");
        txtModifJournalR.setText("");
        txtModifAnioR.setText("");
        txtModifTipoR.setText("");
        txtModifDispR.setText("");
    }

    public ObservableList<TesisConsulta> getTesis() {
        ObtenerDatos obtenerdatos = new ObtenerDatos();
        ObservableList<TesisConsulta> TesisC = FXCollections.observableArrayList();
        ArrayList<TesisConsulta> arrayTesisC = new ArrayList<>();

        arrayTesisC = obtenerdatos.ObtenerTesis();

        for (int i = 1; i < arrayTesisC.size(); i++) {
            autor = arrayTesisC.get(i).getAutor();
            titulo = arrayTesisC.get(i).getTitulo();
            universidad = arrayTesisC.get(i).getUniversidad();
            anio = arrayTesisC.get(i).getAnio();
            tipo = arrayTesisC.get(i).getTipo();
            disponibilidad = arrayTesisC.get(i).getDisponibilidad();
            TesisC.add(new TesisConsulta(autor, titulo, universidad, anio, tipo, disponibilidad));
        }

        return TesisC;
    }

    public void sigConsultaTesis() {
        app.ReferenciasTT();
        Stage stage = (Stage) this.btnConsultaTesis.getScene().getWindow();
        stage.close();
    }

    public void MostrarAgregarTT() {
        app.AgregarTesis();
        Stage stage = (Stage) this.btnMostrarAgregarTT.getScene().getWindow();
        stage.close();
    }

    public void AbrirBTXTesis() {
        app.BTXTesis();
        Stage stage = (Stage) this.btnBTXTesis.getScene().getWindow();
        stage.close();
    }

    public void AgregarBTXTesis() {
        ObservableList<TesisConsulta> ObservarTesis = FXCollections.observableArrayList();

        try {
            String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\TesisConsulta.xlsx";
            ArrayList<TesisConsulta> arrayTesisC = new ArrayList<>();
            arrayTesisC = obtenerdatos.ObtenerTesis();

            String hoja = "Hoja1";
            XSSFWorkbook libro = new XSSFWorkbook();
            XSSFSheet hoja1 = libro.createSheet(hoja);
            int celdasAsignadas = 0;
            int n = 1;
            String libro1 = BTXTesis.getText();
            String parteCadena = "";

            int tamañoCadena = libro1.length();

            while ((libro1.indexOf('{')) != -1) {
                parteCadena = libro1.substring(libro1.indexOf('{') + 1, libro1.indexOf('}'));
                switch (n) {
                    case 1:
                        autor = parteCadena;
                        break;
                    case 2:
                        titulo = parteCadena;
                        break;
                    case 3:
                        universidad = parteCadena;
                        break;
                    case 4:
                        anio = parteCadena;
                        break;

                }

                libro1 = libro1.substring(libro1.indexOf('}') + 1, tamañoCadena);
                tamañoCadena = libro1.length();
                n++;
            }

            tipo = "";
            disponibilidad = "Disponible";

            if (autor.equals("") || titulo.equals("") || universidad.equals("") || anio.equals("") || tipo.equals("") || disponibilidad.equals("")) {
                arrayTesisC.add(new TesisConsulta(autor, titulo, universidad, anio, tipo, disponibilidad));
                for(int i=0; i<arrayTesisC.size();i++){
                    XSSFRow row = hoja1.createRow(i);
                    for(int j=0;j<6;j++){
                        XSSFCell cell = row.createCell(j);
                        if(celdasAsignadas == 0){
                            cell.setCellValue(arrayTesisC.get(i).getAutor());
                        } else if(celdasAsignadas == 1){
                            cell.setCellValue(arrayTesisC.get(i).getTitulo());
                        } else if(celdasAsignadas == 2){
                            cell.setCellValue(arrayTesisC.get(i).getUniversidad());
                        } else if(celdasAsignadas == 3){
                            cell.setCellValue(arrayTesisC.get(i).getAnio());
                        } else if(celdasAsignadas == 4){
                            cell.setCellValue(arrayTesisC.get(i).getTipo());
                        } else if(celdasAsignadas == 5){
                            cell.setCellValue(arrayTesisC.get(i).getDisponibilidad());
                        }
                        celdasAsignadas++;
                    }
                    celdasAsignadas = 0;
                }
                File file;
                file = new File(rutaArchivo);
                try(FileOutputStream fileOuS = new FileOutputStream(file)){
                    if(file.exists()){
                        file.delete();
                        System.out.println("Eliminado");
                    }
                    libro.write(fileOuS);
                    fileOuS.flush();
                    fileOuS.close();
                    System.out.println("Creado");

                }catch (FileNotFoundException e){
                    e.printStackTrace();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            app.ReferenciasTT();
            Stage stage = (Stage)this.btnAgregarBTXTesis.getScene().getWindow();
            stage.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("EFffffffffe");
        }
    }

    public void VolverBTXTesis() {
        app.ReferenciasTT();
        Stage stage = (Stage) this.btnVolverBTXTesis.getScene().getWindow();
        stage.close();
    }

    public void CargarTesis() {
        try {
            columnaautorTT.setCellValueFactory(new PropertyValueFactory<TesisConsulta, String>("Autor"));
            columnatituloTT.setCellValueFactory(new PropertyValueFactory<TesisConsulta, String>("Titulo"));
            columnauniTT.setCellValueFactory(new PropertyValueFactory<TesisConsulta, String>("Universidad"));
            columnaanioTT.setCellValueFactory(new PropertyValueFactory<TesisConsulta, String>("Anio"));
            columnatipoTT.setCellValueFactory(new PropertyValueFactory<TesisConsulta, String>("Tipo"));
            columnadispTT.setCellValueFactory(new PropertyValueFactory<TesisConsulta, String>("Disponibilidad"));
            tablaTesis.setItems(getTesis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void AgregarTesis() {
        ObservableList<TesisConsulta> ObservarTesis = FXCollections.observableArrayList();
        try {
            String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\TesisConsulta.xlsx";
            ArrayList<TesisConsulta> arrayTesisC = new ArrayList<>();
            arrayTesisC = obtenerdatos.ObtenerTesis();

            String hoja = "Hoja1";
            XSSFWorkbook libro = new XSSFWorkbook();
            XSSFSheet hoja1 = libro.createSheet(hoja);
            int celdasAsignadas = 0;

            if (!txtAgregarAutorTT.getText().equals("") || !txtAgregarTituloTT.getText().equals("") || !txtAgregarUniTT.getText().equals("") || !txtAgregarAnioTT.getText().equals("") || !txtAgregarTipoTT.getText().equals("") || !txtAgregarDispTT.getText().equals("")) {
                System.out.println("Entra al if");
                arrayTesisC.add(new TesisConsulta(txtAgregarAutorTT.getText(), txtAgregarTituloTT.getText(), txtAgregarUniTT.getText(), txtAgregarAnioTT.getText(), txtAgregarTipoTT.getText(), txtAgregarDispTT.getText()));

                for (int i = 0; i < arrayTesisC.size(); i++) {
                    XSSFRow row = hoja1.createRow(i);
                    for (int j = 0; j < 6; j++) {
                        XSSFCell cell = row.createCell(j);
                        if (celdasAsignadas == 0) {
                            cell.setCellValue(arrayTesisC.get(i).getAutor());
                        } else if (celdasAsignadas == 1) {
                            cell.setCellValue(arrayTesisC.get(i).getTitulo());
                        } else if (celdasAsignadas == 2) {
                            cell.setCellValue(arrayTesisC.get(i).getUniversidad());
                        } else if (celdasAsignadas == 3) {
                            cell.setCellValue(arrayTesisC.get(i).getAnio());
                        } else if (celdasAsignadas == 4) {
                            cell.setCellValue(arrayTesisC.get(i).getTipo());
                        } else if (celdasAsignadas == 5) {
                            cell.setCellValue(arrayTesisC.get(i).getDisponibilidad());
                        }
                        celdasAsignadas++;
                    }
                    celdasAsignadas = 0;
                }
                File file;
                file = new File(rutaArchivo);
                try (FileOutputStream fileOuS = new FileOutputStream(file)) {
                    if (file.exists()) {
                        file.delete();
                        System.out.println("Eliminado");
                    }
                    libro.write(fileOuS);
                    fileOuS.flush();
                    fileOuS.close();
                    System.out.println("Creado");

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            app.ReferenciasTT();
            Stage stage = (Stage) this.btnAgregarTesis.getScene().getWindow();
            stage.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Efffffffffe");
        }
    }

    public void EliminarTesis() {
        String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\TesisConsulta.xlsx";
        ArrayList<TesisConsulta> arrayTesisC = new ArrayList<>();

        try {
            TesisConsulta tesisConsulta = tablaTesis.getSelectionModel().getSelectedItem();
            arrayTesisC = obtenerdatos.ObtenerTesis();

            for (int i = 0; i < arrayTesisC.size(); i++) {
                if (tesisConsulta.getAutor().equals(arrayTesisC.get(i).getAutor())) {
                    arrayTesisC.remove(i);
                }
            }

            String hoja = "Hoja1";
            XSSFWorkbook libro = new XSSFWorkbook();
            XSSFSheet hoja1 = libro.createSheet(hoja);
            int celdasAsignadas = 0;

            for (int i = 0; i < arrayTesisC.size(); i++) {
                XSSFRow row = hoja1.createRow(i);

                for (int j = 0; j < 6; j++) {
                    XSSFCell cell = row.createCell(j);
                    if (celdasAsignadas == 0) {
                        cell.setCellValue(arrayTesisC.get(i).getAutor());
                    } else if (celdasAsignadas == 1) {
                        cell.setCellValue(arrayTesisC.get(i).getTitulo());
                    } else if (celdasAsignadas == 2) {
                        cell.setCellValue(arrayTesisC.get(i).getUniversidad());
                    } else if (celdasAsignadas == 3) {
                        cell.setCellValue(arrayTesisC.get(i).getAnio());
                    } else if (celdasAsignadas == 4) {
                        cell.setCellValue(arrayTesisC.get(i).getTipo());
                    } else if (celdasAsignadas == 5) {
                        cell.setCellValue(arrayTesisC.get(i).getDisponibilidad());
                    }
                    celdasAsignadas++;
                }
                celdasAsignadas = 0;
            }
            File file;
            file = new File(rutaArchivo);
            try (FileOutputStream fileOuS = new FileOutputStream(file)) {
                if (file.exists()) {
                    file.delete();
                    System.out.println("Eliminado");
                }
                libro.write(fileOuS);
                fileOuS.flush();
                fileOuS.close();
                System.out.println("Creado");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

            tablaTesis.setItems(getTesis());

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("EFffffffffisima");
        }
    }

    public void SeleccionarTesis() {
        String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\TesisConsulta.xlsx";
        TesisConsulta tesisConsulta = tablaTesis.getSelectionModel().getSelectedItem();
        ArrayList<TesisConsulta> arrayTesisC = new ArrayList<>();
        arrayTesisC = obtenerdatos.ObtenerTesis();

        try {
            for (int i = 0; i < arrayTesisC.size(); i++) {
                if (tesisConsulta.getAutor().equals(arrayTesisC.get(i).getAutor())) {
                    txtModifAutorTT.setText(tesisConsulta.getAutor());
                    txtModifTituloTT.setText(tesisConsulta.getTitulo());
                    txtModifUniTT.setText(tesisConsulta.getUniversidad());
                    txtModifAnioTT.setText(tesisConsulta.getAnio());
                    txtModifTipoTT.setText(tesisConsulta.getTipo());
                    txtModifDispTT.setText(tesisConsulta.getDisponibilidad());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ModificarTesis() {
        String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\TesisConsulta.xlsx";
        TesisConsulta tesisConsulta = tablaTesis.getSelectionModel().getSelectedItem();
        ArrayList<TesisConsulta> arrayTesisC = new ArrayList<>();
        arrayTesisC = obtenerdatos.ObtenerTesis();

        for (int i = 0; i < arrayTesisC.size(); i++) {
            if (tesisConsulta.getAutor().equals(arrayTesisC.get(i).getAutor()) && !txtModifTituloTT.getText().equals("") && !txtModifUniTT.getText().equals("") && !txtModifAnioTT.getText().equals("") && !txtModifTipoTT.getText().equals("") && !txtModifDispTT.getText().equals("")) {
                arrayTesisC.get(i).setAutor(txtModifAutorTT.getText());
                arrayTesisC.get(i).setTitulo(txtModifTituloTT.getText());
                arrayTesisC.get(i).setUniversidad(txtModifUniTT.getText());
                arrayTesisC.get(i).setAnio(txtModifAnioTT.getText());
                arrayTesisC.get(i).setTipo(txtModifTipoTT.getText());
                arrayTesisC.get(i).setDisponibilidad(txtModifDispTT.getText());

            }
        }
        String hoja = "Hoja1";
        XSSFWorkbook libro = new XSSFWorkbook();
        XSSFSheet hoja1 = libro.createSheet(hoja);
        int celdasAsignadas = 0;

        for (int i = 0; i < arrayTesisC.size(); i++) {
            XSSFRow row = hoja1.createRow(i);

            for (int j = 0; j < 6; j++) {
                XSSFCell cell = row.createCell(j);
                if (celdasAsignadas == 0) {
                    cell.setCellValue(arrayTesisC.get(i).getAutor());
                } else if (celdasAsignadas == 1) {
                    cell.setCellValue(arrayTesisC.get(i).getTitulo());
                } else if (celdasAsignadas == 2) {
                    cell.setCellValue(arrayTesisC.get(i).getUniversidad());
                } else if (celdasAsignadas == 3) {
                    cell.setCellValue(arrayTesisC.get(i).getAnio());
                } else if (celdasAsignadas == 4) {
                    cell.setCellValue(arrayTesisC.get(i).getTipo());
                } else if (celdasAsignadas == 5) {
                    cell.setCellValue(arrayTesisC.get(i).getDisponibilidad());
                }
                celdasAsignadas++;
            }
            celdasAsignadas = 0;
        }
        File file;
        file = new File(rutaArchivo);
        try (FileOutputStream fileOuS = new FileOutputStream(file)) {
            if (file.exists()) {
                file.delete();
                System.out.println("Eliminado");
            }
            libro.write(fileOuS);
            fileOuS.flush();
            fileOuS.close();
            System.out.println("Creado");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        tablaTesis.setItems(getTesis());
        txtModifAutorTT.setText("");
        txtModifTituloTT.setText("");
        txtModifUniTT.setText("");
        txtModifAnioTT.setText("");
        txtModifTipoTT.setText("");
        txtModifDispTT.setText("");
    }

    public ObservableList<UsuariosConsulta> getUsuarios() {
        ObtenerDatos obtenerdatos = new ObtenerDatos();
        ObservableList<UsuariosConsulta> UsuariosC = FXCollections.observableArrayList();
        ArrayList<UsuariosConsulta> arrayUsuariosC = new ArrayList<>();

        arrayUsuariosC = obtenerdatos.ObtenerUsuarios();

        for (int i = 1; i < arrayUsuariosC.size(); i++) {
            ID = arrayUsuariosC.get(i).getID();
            nombre = arrayUsuariosC.get(i).getNombre();
            apellido = arrayUsuariosC.get(i).getApellido();
            telefono = arrayUsuariosC.get(i).getTelefono();
            UsuariosC.add(new UsuariosConsulta(ID, nombre, apellido, telefono));
        }

        return UsuariosC;
    }

    public void AbrirAddUser() {
        app.AgregarUsuarios();
        Stage stage = (Stage) this.btnAbrirAddUser.getScene().getWindow();
        stage.close();
    }

    public void CargarUsuarios() {
        try {
            columnaIDU.setCellValueFactory(new PropertyValueFactory<UsuariosConsulta, String>("ID"));
            columnaNombreU.setCellValueFactory(new PropertyValueFactory<UsuariosConsulta, String>("Nombre"));
            columnaApellidoU.setCellValueFactory(new PropertyValueFactory<UsuariosConsulta, String>("Apellido"));
            columnaTelefonoU.setCellValueFactory(new PropertyValueFactory<UsuariosConsulta, String>("Telefono"));
            tablaUsuarios.setItems(getUsuarios());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void AñadirUsuario() {
        ObservableList<UsuariosConsulta> ObservarUsuarios = FXCollections.observableArrayList();
        try {
            String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\UsuariosConsulta.xlsx";
            ArrayList<UsuariosConsulta> arrayUsuariosC = new ArrayList<>();
            arrayUsuariosC = obtenerdatos.ObtenerUsuarios();

            String hoja = "Hoja1";
            XSSFWorkbook libro = new XSSFWorkbook();
            XSSFSheet hoja1 = libro.createSheet(hoja);
            int celdasAsignadas = 0;

            if (!txtIDU.getText().equals("") || !txtNombreU.getText().equals("") || !txtApellidoU.getText().equals("") || !txtTelefonoU.getText().equals("")) {
                System.out.println("Entra al if");
                arrayUsuariosC.add(new UsuariosConsulta(txtIDU.getText(), txtNombreU.getText(), txtApellidoU.getText(), txtTelefonoU.getText()));

                for (int i = 0; i < arrayUsuariosC.size(); i++) {
                    XSSFRow row = hoja1.createRow(i);
                    for (int j = 0; j < 4; j++) {
                        XSSFCell cell = row.createCell(j);
                        if (celdasAsignadas == 0) {
                            cell.setCellValue(arrayUsuariosC.get(i).getID());
                        } else if (celdasAsignadas == 1) {
                            cell.setCellValue(arrayUsuariosC.get(i).getNombre());
                        } else if (celdasAsignadas == 2) {
                            cell.setCellValue(arrayUsuariosC.get(i).getApellido());
                        } else if (celdasAsignadas == 3) {
                            cell.setCellValue(arrayUsuariosC.get(i).getTelefono());
                        }
                        celdasAsignadas++;
                    }
                    celdasAsignadas = 0;
                }
                File file;
                file = new File(rutaArchivo);
                try (FileOutputStream fileOuS = new FileOutputStream(file)) {
                    if (file.exists()) {
                        file.delete();
                        System.out.println("Eliminado");
                    }
                    libro.write(fileOuS);
                    fileOuS.flush();
                    fileOuS.close();
                    System.out.println("Creado");

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            app.Usuarios();
            Stage stage = (Stage) this.btnAddUser.getScene().getWindow();
            stage.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Efffffffffe");
        }
    }

    public void EliminarUser() {
        String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\UsuariosConsulta.xlsx";
        ArrayList<UsuariosConsulta> arrayUsuariosC = new ArrayList<>();

        try {
            UsuariosConsulta usuariosConsulta = tablaUsuarios.getSelectionModel().getSelectedItem();
            arrayUsuariosC = obtenerdatos.ObtenerUsuarios();

            for (int i = 0; i < arrayUsuariosC.size(); i++) {
                if (usuariosConsulta.getID().equals(arrayUsuariosC.get(i).getID())) {
                    arrayUsuariosC.remove(i);
                }
            }

            String hoja = "Hoja1";
            XSSFWorkbook libro = new XSSFWorkbook();
            XSSFSheet hoja1 = libro.createSheet(hoja);
            int celdasAsignadas = 0;

            for (int i = 0; i < arrayUsuariosC.size(); i++) {
                XSSFRow row = hoja1.createRow(i);

                for (int j = 0; j < 4; j++) {
                    XSSFCell cell = row.createCell(j);
                    if (celdasAsignadas == 0) {
                        cell.setCellValue(arrayUsuariosC.get(i).getID());
                    } else if (celdasAsignadas == 1) {
                        cell.setCellValue(arrayUsuariosC.get(i).getNombre());
                    } else if (celdasAsignadas == 2) {
                        cell.setCellValue(arrayUsuariosC.get(i).getApellido());
                    } else if (celdasAsignadas == 3) {
                        cell.setCellValue(arrayUsuariosC.get(i).getTelefono());
                    }
                    celdasAsignadas++;
                }
                celdasAsignadas = 0;
            }
            File file;
            file = new File(rutaArchivo);
            try (FileOutputStream fileOuS = new FileOutputStream(file)) {
                if (file.exists()) {
                    file.delete();
                    System.out.println("Eliminado");
                }
                libro.write(fileOuS);
                fileOuS.flush();
                fileOuS.close();
                System.out.println("Creado");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

            tablaUsuarios.setItems(getUsuarios());

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("EFffffffffisima");
        }
    }

    public void SelectUsers() {
        String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\UsuariosConsulta.xlsx";
        UsuariosConsulta usuariosConsulta = tablaUsuarios.getSelectionModel().getSelectedItem();
        ArrayList<UsuariosConsulta> arrayUsuariosC = new ArrayList<>();
        arrayUsuariosC = obtenerdatos.ObtenerUsuarios();

        try {
            for (int i = 0; i < arrayUsuariosC.size(); i++) {
                if (usuariosConsulta.getID().equals(arrayUsuariosC.get(i).getID())) {
                    txtModifIDU.setText(usuariosConsulta.getID());
                    txtModifNomU.setText(usuariosConsulta.getNombre());
                    txtModifApeU.setText(usuariosConsulta.getApellido());
                    txtModifTelU.setText(usuariosConsulta.getTelefono());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void ModificarUsers() {
        String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\UsuariosConsulta.xlsx";
        UsuariosConsulta usuariosConsulta = tablaUsuarios.getSelectionModel().getSelectedItem();
        ArrayList<UsuariosConsulta> arrayUsuariosC = new ArrayList<>();
        arrayUsuariosC = obtenerdatos.ObtenerUsuarios();

        for (int i = 0; i < arrayUsuariosC.size(); i++) {
            if (usuariosConsulta.getID().equals(arrayUsuariosC.get(i).getID()) && !txtModifNomU.getText().equals("") && !txtModifApeU.getText().equals("") && !txtModifTelU.getText().equals("")) {
                arrayUsuariosC.get(i).setID(txtModifIDU.getText());
                arrayUsuariosC.get(i).setNombre(txtModifNomU.getText());
                arrayUsuariosC.get(i).setApellido(txtModifApeU.getText());
                arrayUsuariosC.get(i).setTelefono(txtModifTelU.getText());

            }
        }
        String hoja = "Hoja1";
        XSSFWorkbook libro = new XSSFWorkbook();
        XSSFSheet hoja1 = libro.createSheet(hoja);
        int celdasAsignadas = 0;

        for (int i = 0; i < arrayUsuariosC.size(); i++) {
            XSSFRow row = hoja1.createRow(i);

            for (int j = 0; j < 4; j++) {
                XSSFCell cell = row.createCell(j);
                if (celdasAsignadas == 0) {
                    cell.setCellValue(arrayUsuariosC.get(i).getID());
                } else if (celdasAsignadas == 1) {
                    cell.setCellValue(arrayUsuariosC.get(i).getNombre());
                } else if (celdasAsignadas == 2) {
                    cell.setCellValue(arrayUsuariosC.get(i).getApellido());
                } else if (celdasAsignadas == 3) {
                    cell.setCellValue(arrayUsuariosC.get(i).getTelefono());
                }
                celdasAsignadas++;
            }
            celdasAsignadas = 0;
        }
        File file;
        file = new File(rutaArchivo);
        try (FileOutputStream fileOuS = new FileOutputStream(file)) {
            if (file.exists()) {
                file.delete();
                System.out.println("Eliminado");
            }
            libro.write(fileOuS);
            fileOuS.flush();
            fileOuS.close();
            System.out.println("Creado");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        tablaUsuarios.setItems(getUsuarios());
        txtModifIDU.setText("");
        txtModifNomU.setText("");
        txtModifApeU.setText("");
        txtModifTelU.setText("");
    }

    public void VolverUsuariosMenu() {
        app.volverMenu();
        Stage stage = (Stage) this.btnVolverUMenu.getScene().getWindow();
        stage.close();
    }

    public void ConsultaPrestamos() {
        app.Prestamos();
        Stage stage = (Stage) this.btnConsultaPrestamos.getScene().getWindow();
        stage.close();
    }

    public ObservableList<PrestamosConsulta> getPrestamos() {
        ObtenerDatos obtenerdatos = new ObtenerDatos();
        ObservableList<PrestamosConsulta> PrestamosC = FXCollections.observableArrayList();
        ArrayList<PrestamosConsulta> arrayPrestamosC;

        arrayPrestamosC = obtenerdatos.ObtenerPrestamos();

        for (int i = 1; i < arrayPrestamosC.size(); i++) {
            ID = arrayPrestamosC.get(i).getID();
            nombre = arrayPrestamosC.get(i).getNombre();
            ISBN = arrayPrestamosC.get(i).getISBN();
            PrestamosC.add(new PrestamosConsulta(ID, nombre, ISBN));
        }
        return PrestamosC;
    }

    public void CargarPrestamo(){
        try {
            columnaIDP.setCellValueFactory(new PropertyValueFactory<PrestamosConsulta, String>("ID"));
            columnaNombreP.setCellValueFactory(new PropertyValueFactory<PrestamosConsulta, String>("Nombre"));
            columnaISBNP.setCellValueFactory(new PropertyValueFactory<PrestamosConsulta, String>("ISBN"));
            tablaPrestamos.setItems(getPrestamos());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void AgregarPrestamo(){
        String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\PrestamosConsulta.xlsx";

        ArrayList<PrestamosConsulta> arrayPrestamosC;
        ArrayList<UsuariosConsulta> arrayUsuariosC;
        ArrayList<LibrosConsulta> arrayLibrosC;

        arrayPrestamosC = obtenerdatos.ObtenerPrestamos();
        arrayUsuariosC = obtenerdatos.ObtenerUsuarios();
        arrayLibrosC = obtenerdatos.ObtenerLibros();
        for(int i=0;i<arrayUsuariosC.size();i++){
            if(txtNombrePrestamo.getText().equals(arrayUsuariosC.get(i).getNombre())){
                for(int j=0;j<arrayLibrosC.size();j++){
                    if(txtISBNPrestamo.getText().equals(arrayLibrosC.get(j).getISBN())){
                        if(!txtIDPrestamo.getText().equals("")){
                            arrayPrestamosC.add(new PrestamosConsulta(txtIDPrestamo.getText(), txtNombrePrestamo.getText(), txtISBNPrestamo.getText()));

                            String hoja = "Hoja1";
                            XSSFWorkbook libro = new XSSFWorkbook();
                            XSSFSheet hoja1 = libro.createSheet(hoja);
                            int celdasAsignadas=0;

                            for (i = 0; i < arrayPrestamosC.size(); i++) {
                                XSSFRow row = hoja1.createRow(i);
                                for (j = 0; j < 3; j++) {
                                    XSSFCell cell = row.createCell(j);
                                    if (celdasAsignadas == 0) {
                                        cell.setCellValue(arrayPrestamosC.get(i).getID());
                                    } else if (celdasAsignadas == 1) {
                                        cell.setCellValue(arrayPrestamosC.get(i).getNombre());
                                    } else if (celdasAsignadas == 2) {
                                        cell.setCellValue(arrayPrestamosC.get(i).getISBN());
                                    }
                                        celdasAsignadas++;
                                }
                                celdasAsignadas = 0;
                            }
                            File file;
                            file = new File(rutaArchivo);
                            try (FileOutputStream fileOuS = new FileOutputStream(file)) {
                                if (file.exists()) {
                                    file.delete();
                                    System.out.println("Eliminado");
                                }
                                libro.write(fileOuS);
                                fileOuS.flush();
                                fileOuS.close();
                                System.out.println("Creado");

                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                        }
                    }
                }
            }
        }
    }

    public void EliminarPrestamo() {
        String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\PrestamosConsulta.xlsx";
        ArrayList<PrestamosConsulta> arrayPrestamosC;

        try {
            PrestamosConsulta prestamosConsulta = tablaPrestamos.getSelectionModel().getSelectedItem();
            arrayPrestamosC = obtenerdatos.ObtenerPrestamos();

            for (int i = 0; i < arrayPrestamosC.size(); i++) {
                if (prestamosConsulta.getID().equals(arrayPrestamosC.get(i).getID())) {
                    arrayPrestamosC.remove(i);
                }
            }

            String hoja = "Hoja1";
            XSSFWorkbook libro = new XSSFWorkbook();
            XSSFSheet hoja1 = libro.createSheet(hoja);
            int celdasAsignadas = 0;

            for (int i = 0; i < arrayPrestamosC.size(); i++) {
                XSSFRow row = hoja1.createRow(i);

                for (int j = 0; j < 3; j++) {
                    XSSFCell cell = row.createCell(j);
                    if (celdasAsignadas == 0) {
                        cell.setCellValue(arrayPrestamosC.get(i).getID());
                    } else if (celdasAsignadas == 1) {
                        cell.setCellValue(arrayPrestamosC.get(i).getNombre());
                    } else if (celdasAsignadas == 2) {
                        cell.setCellValue(arrayPrestamosC.get(i).getISBN());
                    }
                    celdasAsignadas++;
                }
                celdasAsignadas = 0;
            }
            File file;
            file = new File(rutaArchivo);
            try (FileOutputStream fileOuS = new FileOutputStream(file)) {
                if (file.exists()) {
                    file.delete();
                    System.out.println("Eliminado");
                }
                libro.write(fileOuS);
                fileOuS.flush();
                fileOuS.close();
                System.out.println("Creado");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

            tablaPrestamos.setItems(getPrestamos());

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("EFffffffffisima");
        }

    }

    public void VolverPMenu() {
        app.volverMenu();
        Stage stage = (Stage) this.btnVolverPrestamo.getScene().getWindow();
        stage.close();
    }

    public void VolverAMenu() {
        app.volverMenu();
        Stage stage = (Stage) this.btnVolverRF.getScene().getWindow();
        stage.close();
    }


}
