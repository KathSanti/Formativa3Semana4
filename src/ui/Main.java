package ui;

import data.GestorDatos;
import model.CentroCultivo;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();

        List<CentroCultivo> listaCentro = gestor.listaCentroCultivo("centrosDeCultivo.txt");


        System.out.println("=========== CENTRO DE CULTIVO ============");

        for(CentroCultivo centro : listaCentro){
            System.out.println(centro);


            //Buscar centro segun comuna a traves de getters

            if(centro.getComuna().contains("Valparaíso")){
                System.out.println("\nEncontrado " + centro);
            }

        }


    }
}
