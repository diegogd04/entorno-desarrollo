package com.dgd.pccomponentes;

public class MemoriaRam {

    private Integer id;
    private String marca;
    private String tipo;
    private String size;

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
    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }
}
