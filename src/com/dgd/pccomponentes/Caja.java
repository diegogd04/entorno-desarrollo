package com.dgd.pccomponentes;

public class Caja {

    private Integer id;
    private String marca;
    private String dimension;
    private String placaBase;

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
    public String getDimension(){
        return dimension;
    }
    public void setDimension(String dimension){
        this.dimension = dimension;
    }
    public String getPlacaBase(){
        return placaBase;
    }
    public void setPlacaBase(String placaBase){
        this.placaBase = placaBase;
    }
}
