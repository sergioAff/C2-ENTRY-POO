package com.booking_hoteles.Main.Modelos;

public class Finca extends Establecimiento {
    private final Habitacion habitaciones;

    public Finca(String nombre, String ciudad, double puntuacion, Habitacion habitaciones) {
        super(nombre, ciudad, "Finca", puntuacion);
        this.habitaciones = habitaciones;
    }

    public Habitacion getHabitaciones() {
        return habitaciones;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Finca: " + getNombre() + " en " + getCiudad() + " con puntuación: " + getPuntuacion());
    }
}