package com.mycompany.trabajoestructuras;

public class Mascota {
    
    private int id;
    private String nombre;
    private String especie;
    private String color;
    private String tamanio;

    public Mascota(int id, String nombre, String especie, String color, String tamanio) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.color = color;
        this.tamanio = tamanio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", nombre=" + nombre + ", especie=" + especie + ", color=" + color + ", tamanio=" + tamanio + '}';
    }
    
    
    
    
}
