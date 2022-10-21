package com.dgd.pccomponentes;

public class TarjetaSonido {

    private Integer id;
    private String marca;
    private String puertos;
    private String software;

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
    public String getPuertos(){
        return puertos;
    }
    public void setPuertos(String puertos){
        this.puertos = puertos;
    }
    public String getSoftware(){
        return software;
    }
    public void setSoftware(String software){
        this.software = software;
    }
}
