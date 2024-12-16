package com.booking_hoteles.Main.Modelos;

public class Habitacion {
    private String tipo;
    private double precio;
    private String descripcion;
    private int capacidadAdultos;
    private int capacidadMenores;
    private int totalHabtiaciones;

    public Habitacion(String tipo, double precio, String descripcion, int capacidadAdultos, int capacidadMenores, int totalHabtiaciones) {
        this.tipo = tipo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.capacidadAdultos = capacidadAdultos;
        this.capacidadMenores = capacidadMenores;
        this.totalHabtiaciones = totalHabtiaciones;
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }


    public int getCapacidadAdultos() {
        return capacidadAdultos;
    }


    public int getCapacidadMenores() {
        return capacidadMenores;
    }
    public int getTotalHabtiaciones() {
        return totalHabtiaciones;
    }
}