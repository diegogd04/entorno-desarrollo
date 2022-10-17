package com.dgd.pccomponentes;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {

        System.out.println("Iniciando...");

        /**
         * Procesador
         */

        Procesador amd = new Procesador();

        /**
         * Código a ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */

        amd.setId(1);
        amd.setMarca("Raizen 6400");
        amd.setFabricante("AMD");
        amd.setZocalo("AM4");

        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricante());
        System.out.println(amd.getZocalo());

        Procesador pentium = new Procesador();
        pentium.setId(2);
        pentium.setMarca("i7");
        pentium.setFabricante("intel");
        pentium.setZocalo("LGA 1200");

        System.out.println(pentium.getMarca());
        System.out.println(pentium.getFabricante());
        System.out.println(pentium.getZocalo());

        /**
         * PlacaBase
         */

        PlacaBase asus = new PlacaBase();
        asus.setId(1);
        asus.setMarca("Asus");
        asus.setModelo("B550");
        asus.setZocalo("AM4");

        System.out.println(asus.getMarca());
        System.out.println(asus.getModelo());
        System.out.println(asus.getZocalo());

        /**
         * TarjetaGrafica
         */

        TarjetaGrafica gigabyte = new TarjetaGrafica();
        gigabyte.setId(1);
        gigabyte.setMarca("Gigabyte");
        gigabyte.setTipoMemoria("GDDR6");
        gigabyte.setCapacidadMemoria("12GB");
    }

    @Override
    public void start(Stage primaryStage) {

    }
}
