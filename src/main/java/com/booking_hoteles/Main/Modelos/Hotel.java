package com.booking_hoteles.Main.Modelos;

public class Hotel extends Establecimiento {
    private Habitacion[] habitaciones;

    public Hotel(String nombre, String ciudad, double puntuacion, Habitacion[] habitaciones) {
        super(nombre, ciudad, "Hotel", puntuacion);
        this.habitaciones = habitaciones;
    }

    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Hotel: " + getNombre() + " en " + getCiudad() + " con puntuación: " + getPuntuacion());
    }
}