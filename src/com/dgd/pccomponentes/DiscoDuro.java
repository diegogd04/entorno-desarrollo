package com.dgd.pccomponentes;

public class DiscoDuro {

    private Integer id;
    private String marca;
    private String velocidadLectura;
    private String velocidadEscritura;
    private String capacidad;

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
    public String getVelocidadLectura(){
        return velocidadLectura;
    }
    public void setVelocidadLectura(String velocidadLectura){
        this.velocidadLectura = velocidadLectura;
    }
    public String getVelocidadEscritura(){
        return velocidadEscritura;
    }
    public void setVelocidadEscritura(String velocidadEscritura){
        this.velocidadLectura = velocidadEscritura;
    }
    public String getCapacidad(){
        return capacidad;
    }
    public void setCapacidad(String capacidad){
        this.capacidad = capacidad;
    }
}
