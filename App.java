package com.alanzap;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application
{
    public static void main( String[] args ) {

    launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        try{
            stage = FXMLLoader.load(getClass().getResource("/FXML/MenuInicio.fxml"));
            stage.show();
        } catch (IOException e){
            System.out.println("error: "+e);
        }
    }

    public void volverMenu(){
        try {
            Stage op = FXMLLoader.load(getClass().getResource("/FXML/MenuInicio.fxml"));
            op.show();

        } catch (IOException e) {

        }
    }

    public void Referencias(){
        try {
            Stage op = FXMLLoader.load(getClass().getResource("/FXML/Referencias.fxml"));
            op.show();

        } catch (IOException e) {

        }
    }


    public void RecursosConsulta(){
        try {
            Stage op = FXMLLoader.load(getClass().getResource("/FXML/RecursosConsulta.fxml"));
            op.show();

        } catch (IOException e) {

        }
    }

    public void AgregarLibros(){
        try {
            Stage op = FXMLLoader.load(getClass().getResource("/FXML/AgregarLibros.fxml"));
            op.show();

        } catch (IOException e) {

        }
    }

    public void ReferenciasTT(){
        try {
            Stage op = FXMLLoader.load(getClass().getResource("/FXML/ReferenciasTT.fxml"));
            op.show();

        } catch (IOException e) {

        }
    }

    public void ReferenciasR(){
        try {
            Stage op = FXMLLoader.load(getClass().getResource("/FXML/ReferenciasR.fxml"));
            op.show();

        } catch (IOException e) {

        }
    }

    public void BTXLibros(){
        try {
            Stage op = FXMLLoader.load(getClass().getResource("/FXML/BTXLibros.fxml"));
            op.show();

        } catch (IOException e) {

        }
    }

    public void Usuarios(){
        try{

            Stage op = FXMLLoader.load(getClass().getResource("/FXML/Usuarios.fxml"));
            op.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void AgregarRevistas(){
        try{
            Stage op = FXMLLoader.load(getClass().getResource("/FXML/AgregarRevistas.fxml"));
            op.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void AgregarUsuarios(){
        try{
            Stage op= FXMLLoader.load(getClass().getResource("/FXML/AgregarUsuarios.fxml"));
            op.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void AgregarTesis(){
        try{
            Stage op= FXMLLoader.load(getClass().getResource("/FXML/AgregarTesis.fxml"));
            op.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public void Prestamos(){
        try{
            Stage op= FXMLLoader.load(getClass().getResource("/FXML/Prestamos.fxml"));
            op.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void BTXRevistas(){
        try{
            Stage op= FXMLLoader.load(getClass().getResource("/FXML/BTXRevistas.fxml"));
            op.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void BTXTesis(){
        try{
            Stage op= FXMLLoader.load(getClass().getResource("/FXML/BTXTesis.fxml"));
            op.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
