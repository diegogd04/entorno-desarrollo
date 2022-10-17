package com.dgd.pccomponentes;

/**
 * Clase Procesador
 */
public class Procesador {

    /**
     * Atributos, propiedades, variables
     */
    private Integer id;
    private String marca;
    private String fabricante;
    private String zocalo;

    /**
     * Métodos, funciones, comportamiento
     */
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getFabricante(){
        return fabricante;
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    public String getZocalo(){
        return zocalo;
    }
    public void setZocalo(String zocalo){
        this.zocalo = zocalo;
    }
}
