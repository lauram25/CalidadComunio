package com.ps.comunio.comuniops.mock;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Virginia on 18/02/2016.
 */
public class ParticipanteMock {
    private String nombre;
    private int dinero;
    private EquipoMock equipo;
    private int puntos;

    static public ParticipanteMock nuevo_Participante_Pobre_Con_Equipo_Lleno() {
        ParticipanteMock virginia = new ParticipanteMock();
        virginia.nombre = "Virginia Pobre";
        virginia.dinero = 1;
        virginia.equipo = EquipoMock.equipo_Lleno();
        virginia.puntos = 10000;
        return virginia;
    }

    static public ParticipanteMock nuevo_Participante_Pobre_Con_Equipo_Vacio() {
        ParticipanteMock virginia = new ParticipanteMock();
        virginia.nombre = "Virginia Pobre";
        virginia.dinero = 1;
        virginia.equipo = EquipoMock.equipo_Vacio();
        virginia.puntos = 10000;
        return virginia;
    }

    static public ParticipanteMock nuevo_Participante_Rico_Con_Equipo_Vacio() {
        ParticipanteMock virginia = new ParticipanteMock();
        virginia.nombre = "VirginiaConPasta";
        virginia.dinero = 100000;
        virginia.equipo = EquipoMock.equipo_Vacio();
        virginia.puntos = 1;
        return virginia;
    }

    static public ParticipanteMock nuevo_Participante_Rico_Con_Equipo_Lleno() {
        ParticipanteMock virginia = new ParticipanteMock();
        virginia.nombre = "VirginiaConPasta";
        virginia.dinero = 100000;
        virginia.equipo = EquipoMock.equipo_Lleno();
        virginia.puntos = 1;
        return virginia;
    }

    public boolean fichar (JugadorMock jugador) {
        boolean salida;
        if (dinero >= jugador.getPrecio() & equipo.getJugadores().size() < EquipoMock.NUM_MAX_JUGADORES & jugador.getEquipo() == null) {
            List<JugadorMock> jugadores = equipo.getJugadores();
            jugadores.add(jugador);
            equipo.setJugadores(jugadores);
            salida = true;
        } else {
            salida = false;
        }
        return salida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public EquipoMock getEquipo() {
        return equipo;
    }

    public void setEquipo(EquipoMock equipo) {
        this.equipo = equipo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
