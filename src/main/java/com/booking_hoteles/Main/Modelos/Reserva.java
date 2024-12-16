package com.booking_hoteles.Main.Modelos;

// Clase que representa una Reserva
public class Reserva {
    private String clienteNombre;
    private String fechaReserva;
    private int numeroNoches;
    private Habitacion habitacionReservada;

    public Reserva(String clienteNombre, String fechaReserva, int numeroNoches, Habitacion habitacionReservada) {
        this.clienteNombre = clienteNombre;
        this.fechaReserva = fechaReserva;
        this.numeroNoches = numeroNoches;
        this.habitacionReservada = habitacionReservada;
    }

    // Getters y Setters
    public String getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public int getNumeroNoches() {
        return numeroNoches;
    }

    public void setNumeroNoches(int numeroNoches) {
        this.numeroNoches = numeroNoches;
    }

    public Habitacion getHabitacionReservada() {
        return habitacionReservada;
    }

    public void setHabitacionReservada(Habitacion habitacionReservada) {
        this.habitacionReservada = habitacionReservada;
    }

    // Método para mostrar detalles de la reserva
    public void mostrarDetalles() {
        System.out.println("Reserva de " + clienteNombre + " para la fecha: " + fechaReserva);
        System.out.println("Habitación: " + habitacionReservada.getTipo() + " - " + habitacionReservada.getDescripcion());
        System.out.println("Número de noches: " + numeroNoches);
        System.out.println("Precio total: $" + (numeroNoches * habitacionReservada.getPrecio()));
    }
}