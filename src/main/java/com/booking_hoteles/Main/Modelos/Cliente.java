package com.booking_hoteles.Main.Modelos;

import java.time.LocalDate;

public class Cliente {

    private String nombre;
    private String apellido;
    private String email;
    private String nacionalidad;
    private String numeroTelefono;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int cantidadAdultos;
    private int cantidadMenores;
    private int cantidadHabitaciones;
    private String tipoHabitacion;
    private String horaLlegada;

    public Cliente(String nombre, String apellido, String email,
                       String nacionalidad, String numeroTelefono, LocalDate fechaInicio,
                       LocalDate fechaFin, int cantidadAdultos, int cantidadMenores,
                       int cantidadHabitaciones, String tipoHabitacion, String horaLlegada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.nacionalidad = nacionalidad;
        this.numeroTelefono = numeroTelefono;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantidadAdultos = cantidadAdultos;
        this.cantidadMenores = cantidadMenores;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.tipoHabitacion = tipoHabitacion;
        this.horaLlegada = horaLlegada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreCliente) {
        this.nombre = nombreCliente;
    }

    public String getApellidoC() {
        return apellido;
    }

    public void setApellido(String apellidoCliente) {
        this.apellido = apellidoCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String emailCliente) {
        this.email = emailCliente;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantidadAdultos() {
        return cantidadAdultos;
    }

    public void setCantidadAdultos(int cantidadAdultos) {
        this.cantidadAdultos = cantidadAdultos;
    }

    public int getCantidadNinos() {
        return cantidadMenores;
    }

    public void setCantidadNinos(int cantidadNinos) {
        this.cantidadMenores = cantidadNinos;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }
}