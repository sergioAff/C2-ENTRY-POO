package com.booking_hoteles.Main.Modelos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Habitacion {

    private String tipo;
    private String descripcion;
    private double precioPorNoche;
    private int capacidadAdultos;
    private int capacidadMenores;
    private boolean disponibilidad;
    private List<Cliente> clientes;

    public Habitacion(String tipo, String descripcion, double precioPorNoche, int capacidadAdultos, int capacidadMenores, boolean disponibilidad) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precioPorNoche = precioPorNoche;
        this.capacidadAdultos = capacidadAdultos;
        this.capacidadMenores = capacidadMenores;
        this.disponibilidad = disponibilidad;
        this.clientes = new ArrayList<>();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getdDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public int getCapacidadAdultos() {
        return capacidadAdultos;
    }

    public void setCapacidadAdultos(int capacidadAdultos) {
        this.capacidadAdultos = capacidadAdultos;
    }

    public int getCapacidadMenores() {
        return capacidadMenores;
    }

    public void setCapacidadMenores(int capacidadMenores) {
        this.capacidadMenores = capacidadMenores;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public List<Cliente> getReservas() {
        return clientes;
    }

    public void setReservas(List<Cliente> reservas) {
        this.clientes = reservas;
    }

    public boolean isAvailable(LocalDate startDate, LocalDate endDate) {
        for (Cliente cliente : clientes) {

            if (startDate.isBefore(cliente.getFechaFin()) && endDate.isAfter(cliente.getFechaInicio())) {
                return false;
            }
        }
        return disponibilidad;
    }

    // Method to add a reservation
    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }

    public int getCapacity() {
        return adultCapacity + childCapacity;
    }

}