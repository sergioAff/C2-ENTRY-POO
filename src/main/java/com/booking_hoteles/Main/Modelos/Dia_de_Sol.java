package com.booking_hoteles.Main.Modelos;

public class Dia_de_Sol extends Establecimiento {
    private final Habitacion habitaciones;

    public Dia_de_Sol(String nombre, String ciudad, double puntuacion, Habitacion habitaciones) {
        super(nombre, ciudad, "Dia de Sol", puntuacion);
        this.habitaciones = habitaciones;
    }

    public Habitacion getHabitaciones() {
        return habitaciones;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Dia de Sol: " + getNombre() + " en " + getCiudad() + " con puntuación: " + getPuntuacion());
    }
}