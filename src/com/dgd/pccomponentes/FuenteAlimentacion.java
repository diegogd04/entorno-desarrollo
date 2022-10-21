package com.dgd.pccomponentes;

public class FuenteAlimentacion {

    private Integer id;
    private String marca;
    private String tipo;
    private String potencia;

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
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getPotencia(){
        return potencia;
    }
    public void setPotencia(String potencia){
        this.potencia = potencia;
    }
}
