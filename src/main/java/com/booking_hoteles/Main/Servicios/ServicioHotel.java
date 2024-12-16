package com.booking_hoteles.Main.Servicios;

import com.booking_hoteles.Main.Modelos.TipoAlojamiento;
import com.booking_hoteles.Main.Modelos.Hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ServicioHotel {
    private List<Hotel> hoteles;

    public ServicioHotel(List<Hotel> hoteles) {
        this.hoteles = hoteles;
    }

    public List<Hotel> buscarHoteles(String ciudad, TipoAlojamiento tipoAlojamiento,
                                     LocalDate fechaInicio, LocalDate fechaFin,
                                     int adultos, int menores, int habitaciones) {
        List<Hotel> hotelesFiltrados = new ArrayList<>();

        for (Hotel hotel : hoteles) {
            if (!hotel.getCiudad().equalsIgnoreCase(ciudad)) {
                continue;
            }

            if (tipoAlojamiento != null && hotel.getTipoAlojamiento() != tipoAlojamiento) {
                continue;
            }

            boolean tieneDisponibilidad = hotel.getHabitaciones().stream().anyMatch(habitacion ->
                    habitacion.isAvailable(fechaInicio, fechaFin) && habitacion.getCapacity() >= (adultos + menores));

            if (!tieneDisponibilidad) {
                continue;
            }

            long habitacionesDisponibles = hotel.getHabitaciones().stream()
                    .filter(room -> room.isAvailable(fechaInicio, fechaFin))
                    .count();

            if (habitacionesDisponibles < habitaciones) {
                continue;
            }

            hotelesFiltrados.add(hotel);
        }

        return hotelesFiltrados;
    }
}