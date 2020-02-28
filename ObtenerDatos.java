package com.alanzap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ObtenerDatos {

    public ArrayList ObtenerLibros(){

        ArrayList<LibrosConsulta> arrayLibrosC = new ArrayList<>();
        String nombreExcel = "LibrosConsulta.xlsx";
        String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\" + nombreExcel;
        String hoja = "Hoja1";
        int celdasAsignadas = 0;
        String ISBN="", autor="", titulo="", editorial="", anio="", direccion="", volumen="", serie="", edicion="", mes="", tipo="", disponibilidad="";

        try(FileInputStream file = new FileInputStream(new File(rutaArchivo))){

            XSSFWorkbook workbook = new XSSFWorkbook(file); //Leer archivo excel
            XSSFSheet sheet = workbook.getSheetAt(0); //Obtener la hoja que se va a leer
            Iterator<Row> rowIterator = sheet.iterator(); //Obtener todas las filas de la hoja excel

            Row row;
            while(rowIterator.hasNext()){ //Se recorren todas las filas hasta el final
                row = rowIterator.next();

                Iterator<Cell> cellIterator = row.cellIterator(); //Se obtiene las celdas por fila
                Cell cell;
                while(cellIterator.hasNext()){ //Se recorre cada celda

                    cell = cellIterator.next(); //Se obtiene la celda en específico y se imprime

                    if(celdasAsignadas == 0){
                        ISBN = new DataFormatter().formatCellValue(cell);
                    } else if(celdasAsignadas == 1){
                        autor = String.valueOf(cell.getStringCellValue());
                    } else if(celdasAsignadas == 2){
                        titulo = String.valueOf(cell.getStringCellValue());
                    } else if(celdasAsignadas == 3){
                        editorial = String.valueOf(cell.getStringCellValue());
                    } else if (celdasAsignadas == 4){
                        anio = new DataFormatter().formatCellValue(cell);
                    } else if(celdasAsignadas == 5){
                        direccion = new DataFormatter().formatCellValue(cell);
                    } else if(celdasAsignadas == 6){
                        volumen = new DataFormatter().formatCellValue(cell);
                    } else if(celdasAsignadas == 7){
                        serie = String.valueOf(cell.getStringCellValue());
                    } else if(celdasAsignadas == 8){
                        edicion = String.valueOf(cell.getStringCellValue());
                    } else if(celdasAsignadas == 9){
                        mes = String.valueOf(cell.getStringCellValue());
                    } else if(celdasAsignadas == 10){
                        tipo = String.valueOf(cell.getStringCellValue());
                    } else if(celdasAsignadas == 11){
                        disponibilidad = toString().valueOf(cell.getStringCellValue());
                    }
                    celdasAsignadas++;
                }
                arrayLibrosC.add(new LibrosConsulta(ISBN, autor, titulo, editorial, anio, direccion, volumen, serie, edicion, mes, tipo, disponibilidad));
                celdasAsignadas=0;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arrayLibrosC;
    }

    public ArrayList ObtenerRevistas(){

        ArrayList<RevistasConsulta> arrayRevistasC = new ArrayList<>();
        String nombreExcel = "RevistasConsulta.xlsx";
        String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\" + nombreExcel;
        String hoja = "Hoja1";
        int celdasAsignadas = 0;
        String autor="", titulo="", journal="", anio="", tipo="", disponibilidad="";

        try(FileInputStream file = new FileInputStream(new File(rutaArchivo))){

            XSSFWorkbook workbook = new XSSFWorkbook(file); //Leer archivo excel
            XSSFSheet sheet = workbook.getSheetAt(0); //Obtener la hoja que se va a leer
            Iterator<Row> rowIterator = sheet.iterator(); //Obtener todas las filas de la hoja excel

            Row row;
            while(rowIterator.hasNext()){ //Se recorren todas las filas hasta el final
                row = rowIterator.next();

                Iterator<Cell> cellIterator = row.cellIterator(); //Se obtiene las celdas por fila
                Cell cell;
                while(cellIterator.hasNext()){ //Se recorre cada celda

                    cell = cellIterator.next(); //Se obtiene la celda en específico y se imprime

                    if(celdasAsignadas == 0){
                        autor = new DataFormatter().formatCellValue(cell);
                    } else if(celdasAsignadas == 1){
                        titulo = new DataFormatter().formatCellValue(cell);
                    } else if(celdasAsignadas == 2){
                        journal = new DataFormatter().formatCellValue(cell);
                    } else if(celdasAsignadas == 3){
                        anio = new DataFormatter().formatCellValue(cell);
                    } else if (celdasAsignadas == 4){
                        tipo = new DataFormatter().formatCellValue(cell);
                    } else if(celdasAsignadas == 5){
                        disponibilidad = new DataFormatter().formatCellValue(cell);
                    }
                    celdasAsignadas++;
                }
                arrayRevistasC.add(new RevistasConsulta(autor, titulo, journal, anio, tipo, disponibilidad));
                celdasAsignadas=0;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arrayRevistasC;
    }

    public ArrayList ObtenerTesis(){

        ArrayList<TesisConsulta> arrayTesisC = new ArrayList<>();
        String nombreExcel = "TesisConsulta.xlsx";
        String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\" + nombreExcel;
        String hoja = "Hoja1";
        int celdasAsignadas = 0;
        String autor="", titulo="", universidad="", anio="", tipo="", disponibilidad="";

        try(FileInputStream file = new FileInputStream(new File(rutaArchivo))){

            XSSFWorkbook workbook = new XSSFWorkbook(file); //Leer archivo excel
            XSSFSheet sheet = workbook.getSheetAt(0); //Obtener la hoja que se va a leer
            Iterator<Row> rowIterator = sheet.iterator(); //Obtener todas las filas de la hoja excel

            Row row;
            while(rowIterator.hasNext()){ //Se recorren todas las filas hasta el final
                row = rowIterator.next();

                Iterator<Cell> cellIterator = row.cellIterator(); //Se obtiene las celdas por fila
                Cell cell;
                while(cellIterator.hasNext()){ //Se recorre cada celda

                    cell = cellIterator.next(); //Se obtiene la celda en específico y se imprime

                    if(celdasAsignadas == 0){
                        autor = new DataFormatter().formatCellValue(cell);
                    } else if(celdasAsignadas == 1){
                        titulo = new DataFormatter().formatCellValue(cell);
                    } else if(celdasAsignadas == 2){
                        universidad = new DataFormatter().formatCellValue(cell);
                    } else if(celdasAsignadas == 3){
                        anio = new DataFormatter().formatCellValue(cell);
                    } else if (celdasAsignadas == 4){
                        tipo = new DataFormatter().formatCellValue(cell);
                    } else if(celdasAsignadas == 5){
                        disponibilidad = new DataFormatter().formatCellValue(cell);
                    }
                    celdasAsignadas++;
                }
                arrayTesisC.add(new TesisConsulta(autor, titulo, universidad, anio, tipo, disponibilidad));
                celdasAsignadas=0;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arrayTesisC;
    }

    public ArrayList ObtenerUsuarios(){

        ArrayList<UsuariosConsulta> arrayUsuariosC = new ArrayList<>();
        String nombreExcel = "UsuariosConsulta.xlsx";
        String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\" + nombreExcel;
        String hoja = "Hoja1";
        int celdasAsignadas = 0;
        String ID="", nombre="", apellido="", telefono="";

        try(FileInputStream file = new FileInputStream(new File(rutaArchivo))){

            XSSFWorkbook workbook = new XSSFWorkbook(file); //Leer archivo excel
            XSSFSheet sheet = workbook.getSheetAt(0); //Obtener la hoja que se va a leer
            Iterator<Row> rowIterator = sheet.iterator(); //Obtener todas las filas de la hoja excel

            Row row;
            while(rowIterator.hasNext()){ //Se recorren todas las filas hasta el final
                row = rowIterator.next();

                Iterator<Cell> cellIterator = row.cellIterator(); //Se obtiene las celdas por fila
                Cell cell;
                while(cellIterator.hasNext()){ //Se recorre cada celda

                    cell = cellIterator.next(); //Se obtiene la celda en específico y se imprime

                    if(celdasAsignadas == 0){
                        ID = new DataFormatter().formatCellValue(cell);
                    } else if(celdasAsignadas == 1){
                        nombre = new DataFormatter().formatCellValue(cell);
                    } else if(celdasAsignadas == 2){
                        apellido = new DataFormatter().formatCellValue(cell);
                    } else if(celdasAsignadas == 3){
                        telefono = new DataFormatter().formatCellValue(cell);
                    }
                    celdasAsignadas++;
                }
                arrayUsuariosC.add(new UsuariosConsulta(ID, nombre, apellido, telefono));
                celdasAsignadas=0;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arrayUsuariosC;
    }

    public ArrayList ObtenerPrestamos(){
        ArrayList<PrestamosConsulta> arrayPrestamosC = new ArrayList<>();
        String nombreExcel = "PrestamosConsulta.xlsx";
        String rutaArchivo = "C:\\Users\\Alan\\Desktop\\ProyectosSaid\\Biblioteca\\src\\main\\resources\\ArchivosExcel\\" + nombreExcel;
        String hoja = "Hoja1";
        int celdasAsignadas = 0;
        String ID="", nombre="", ISBN="";

        try(FileInputStream file = new FileInputStream(new File(rutaArchivo))){

            XSSFWorkbook workbook = new XSSFWorkbook(file); //Leer archivo excel
            XSSFSheet sheet = workbook.getSheetAt(0); //Obtener la hoja que se va a leer
            Iterator<Row> rowIterator = sheet.iterator(); //Obtener todas las filas de la hoja excel

            Row row;
            while(rowIterator.hasNext()){ //Se recorren todas las filas hasta el final
                row = rowIterator.next();

                Iterator<Cell> cellIterator = row.cellIterator(); //Se obtiene las celdas por fila
                Cell cell;
                while(cellIterator.hasNext()){ //Se recorre cada celda

                    cell = cellIterator.next(); //Se obtiene la celda en específico y se imprime

                    if(celdasAsignadas == 0){
                        ID = new DataFormatter().formatCellValue(cell);
                    } else if(celdasAsignadas == 1){
                        nombre = new DataFormatter().formatCellValue(cell);
                    } else if(celdasAsignadas == 2){
                        ISBN = new DataFormatter().formatCellValue(cell);
                    }
                    celdasAsignadas++;
                }
                arrayPrestamosC.add(new PrestamosConsulta(ID, nombre, ISBN));
                celdasAsignadas=0;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arrayPrestamosC;
    }

}
