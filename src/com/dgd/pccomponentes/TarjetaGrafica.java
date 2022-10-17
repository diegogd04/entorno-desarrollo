package com.dgd.pccomponentes;

public class TarjetaGrafica {

    private Integer id;
    private String marca;
    private String tipoMemoria;
    private String capacidadMemoria;

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
    public String getTipoMemoria(){
        return tipoMemoria;
    }
    public void setTipoMemoria(String tipoMemoria){
        this.tipoMemoria = tipoMemoria;
    }
    public String getCapacidadMemoria(){
        return capacidadMemoria;
    }
    public void setCapacidadMemoria(String capacidadMemoria){
        this.capacidadMemoria = capacidadMemoria;
    }
}
