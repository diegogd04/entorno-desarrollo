package com.dgd.pccomponentes;

public class PlacaBase {

    private Integer id;
    private String marca;
    private String modelo;
    private String zocalo;

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
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getZocalo(){
        return zocalo;
    }
    public void setZocalo(String zocalo){
        this.zocalo = zocalo;
    }
}
