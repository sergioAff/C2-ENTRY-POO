package com.booking_hoteles.Main;

import com.booking_hoteles.Main.Modelos.Cliente;
import com.booking_hoteles.Main.Modelos.TipoAlojamiento;
import com.booking_hoteles.Main.Modelos.Hotel;
import com.booking_hoteles.Main.Modelos.Habitacion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de hoteles
        List<Hotel> hoteles = new ArrayList<>();

        // Crear y agregar hoteles a la lista
        Hotel hotel1 =new Hotel("Hotel 1", "Ciudad 1",  TipoAlojamiento.HOTEL, 3, true);
        Hotel hotel2 =new Hotel("Hotel 2", "Ciudad 2",  TipoAlojamiento.FINCA, 4..5 ,true);
        Hotel hotel3 =new Hotel("Hotel 3", "Ciudad 3",  TipoAlojamiento.APARTAMENTO, 3.5, true);
        Hotel hotel4 =new Hotel("Hotel 4", "Ciudad 4",  TipoAlojamiento.HOTEL, 5, true);
        Hotel hotel5 =new Hotel("Hotel 5", "Ciudad 5",  TipoAlojamiento.APARTAMENTO, 4, true);
        Hotel hotel6 =new Hotel("Hotel 6", "Ciudad 6",  TipoAlojamiento.HOTEL, 5, true);
        Hotel hotel7 =new Hotel("Hotel 7", "Ciudad 7",  TipoAlojamiento.DIA_DE_SOL, 5, true);
        Hotel hotel8 =new Hotel("Hotel 8", "Ciudad 8",  TipoAlojamiento.HOTEL, 4.5, true);
        Hotel hotel9 =new Hotel("Hotel 9", "Ciudad 9",  TipoAlojamiento.DIA_DE_SOL, 3.5, true);
        Hotel hotel10 =new Hotel("Hotel 10", "Ciudad 10", TipoAlojamiento.HOTEL, 5, false);

        hoteles.add(hotel1)

    }
}