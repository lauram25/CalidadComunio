package com.ps.comunio.comuniops.mock;

/**
 * Created by Virginia on 18/02/2016.
 */
public class JugadorMock {
    private String nombre;
    private int precio;
    private EquipoMock equipo;

    static public JugadorMock crearFernandoTorres() {
        JugadorMock fernando = new JugadorMock();
        fernando.setNombre("Fernando Torres");
        fernando.setPrecio(100);
        fernando.setEquipo(null);
        return fernando;
    }

    static public JugadorMock crearMessi() {
        JugadorMock messi = new JugadorMock();
        messi.setNombre("Messi");
        messi.setPrecio(100);
        messi.setEquipo(null);
        return messi;
    }

    static public JugadorMock crearGriezmann() {
        JugadorMock griezmann = new JugadorMock();
        griezmann.setNombre("Griezmann");
        griezmann.setPrecio(100);
        griezmann.setEquipo(EquipoMock.equipo_Lleno());
        return griezmann;
    }

    static public JugadorMock crearCristinoRonaldo() {
        JugadorMock cristiano = new JugadorMock();
        cristiano.setNombre("Cristiano Ronaldo");
        cristiano.setPrecio(100);
        cristiano.setEquipo(null);
        return cristiano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public EquipoMock getEquipo() {
        return equipo;
    }

    public void setEquipo(EquipoMock equipo) {
        this.equipo = equipo;
    }
}
