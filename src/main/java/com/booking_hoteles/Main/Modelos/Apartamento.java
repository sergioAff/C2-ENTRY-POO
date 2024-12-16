package com.booking_hoteles.Main.Modelos;

public class Apartamento extends Establecimiento {
    private final Habitacion habitaciones;

    public Apartamento(String nombre, String ciudad, double puntuacion, Habitacion habitaciones) {
        super(nombre, ciudad, "Apartamento", puntuacion);
        this.habitaciones = habitaciones;
    }

    public Habitacion getHabitaciones() {
        return habitaciones;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Apartamento: " + getNombre() + " en " + getCiudad() + " con puntuación: " + getPuntuacion());
    }
}