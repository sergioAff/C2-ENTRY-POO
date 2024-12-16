package com.booking_hoteles.Main.Modelos;

// Clase abstracta base para todos los establecimientos
public abstract class Establecimiento {
    private final String nombre;
    private final String ciudad;
    private final String tipo;
    private final double puntuacion;

    public Establecimiento(String nombre, String ciudad, String tipo, double puntuacion) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.tipo = tipo;
        this.puntuacion = puntuacion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    // Método abstracto
    public abstract void mostrarDetalles();
}