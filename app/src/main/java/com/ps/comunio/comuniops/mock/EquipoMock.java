package com.ps.comunio.comuniops.mock;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Virginia on 18/02/2016.
 */
public class EquipoMock {
    public static final int NUM_MAX_JUGADORES = 24;
    public static final int NUM_MIN_JUGADORES = 0;
    private String nombre;
    private List<JugadorMock> jugadores;

    static public EquipoMock equipo_Lleno() {
        EquipoMock equipo = new EquipoMock();
        equipo.jugadores = new ArrayList<JugadorMock>();
        for (int i = NUM_MIN_JUGADORES; i < NUM_MAX_JUGADORES; i++) {
            equipo.jugadores.add(JugadorMock.crearCristinoRonaldo());
        }
        equipo.nombre = "Equipo lleno";
        return equipo;
    }

    static public EquipoMock equipo_Vacio() {
        EquipoMock equipo = new EquipoMock();
        equipo.jugadores = new ArrayList<JugadorMock>();
        equipo.nombre = "Equipo vacio";
        return equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<JugadorMock> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<JugadorMock> jugadores) {
        this.jugadores = jugadores;
    }
}
