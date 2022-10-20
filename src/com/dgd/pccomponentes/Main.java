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

        System.out.println(gigabyte.getMarca());
        System.out.println(gigabyte.getTipoMemoria());
        System.out.println(gigabyte.getCapacidadMemoria());

        /**
         * MemoriaRam
         */

        MemoriaRam corsair = new MemoriaRam();
        corsair.setId(1);
        corsair.setMarca("Corsair");
        corsair.setTipo("DDR4");
        corsair.setSize("16GB");

        System.out.println(corsair.getMarca());
        System.out.println(corsair.getTipo());
        System.out.println(corsair.getSize());

        /**
         * Caja
         */

        Caja tempest = new Caja();
        tempest.setId(1);
        tempest.setMarca("Tempest");
        tempest.setDimension("360 x 210 x 470 mm");
        tempest.setPlacaBase("ATX");

        System.out.println(tempest.getMarca());
        System.out.println(tempest.getDimension());
        System.out.println(tempest.getPlacaBase());

        /**
         * VentiladorCpu
         */

        VentiladorCpu marsGaming = new VentiladorCpu();
        marsGaming.setId(1);
        marsGaming.setMarca("Mars Gaming");
        marsGaming.setCpu("Intel y AMD");
        marsGaming.setSoporte(" LGA 2066/2011/1700/1200/1156/1155/1151/1150/1366 y AM5/AM4/AM3+/AM3/AM2+/AM2/FM2/FM1");

        System.out.println(marsGaming.getMarca());
        System.out.println(marsGaming.getCpu());
        System.out.println(marsGaming.getSoporte());

        /**
         * DiscoDuro
         */

        DiscoDuro kingston = new DiscoDuro();
        kingston.setId(1);
        kingston.setMarca("Kingston");
        kingston.setVelocidadLectura("500MB/s");
        kingston.setVelocidadEscritura("450MB/s");
        kingston.setCapacidad("480GB");

        System.out.println(kingston.getMarca());
        System.out.println(kingston.getVelocidadLectura());
        System.out.println(kingston.getVelocidadEscritura());
        System.out.println(kingston.getCapacidad());
    }

    @Override
    public void start(Stage primaryStage) {

    }
}
