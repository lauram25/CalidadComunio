package com.ps.comunio.comuniops.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.Before;

import com.ps.comunio.comuniops.mock.*;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Virginia on 16/02/2016.
 */

public class FichajesSteps {

    ParticipanteMock usuarioPobreLleno;
    ParticipanteMock usuarioPobreVacio;
    ParticipanteMock usuarioRicoLleno;
    ParticipanteMock usuarioRicoVacio;
    JugadorMock messi;
    JugadorMock gri;
    JugadorMock cristiano;
    JugadorMock fernando;

    @Before
    public void before_test() {
        usuarioPobreLleno = ParticipanteMock.nuevo_Participante_Pobre_Con_Equipo_Lleno();
        usuarioPobreVacio = ParticipanteMock.nuevo_Participante_Pobre_Con_Equipo_Vacio();
        usuarioRicoLleno = ParticipanteMock.nuevo_Participante_Rico_Con_Equipo_Lleno();
        usuarioRicoVacio = ParticipanteMock.nuevo_Participante_Rico_Con_Equipo_Vacio();
        messi = JugadorMock.crearMessi();
        gri = JugadorMock.crearGriezmann();
        cristiano = JugadorMock.crearCristinoRonaldo();
        fernando = JugadorMock.crearFernandoTorres();
    }

    @Test
    @Given("^que el usuario tiene dinero para comprar a Griezmann$")
    public void que_el_usuario_tiene_dinero_para_comprar_a_Griezmann(){
        boolean valor = usuarioRicoVacio.getDinero() >= gri.getPrecio();
        assertTrue(valor);
    }

    @Test
    @And("^que el usuario tiene hueco para annadir a Griezmann$")
    public void que_el_usuario_tiene_hueco_para_annadir_a_Griezmann(){
        boolean valor = usuarioRicoVacio.getEquipo().getJugadores().size() < EquipoMock.NUM_MAX_JUGADORES;
        assertTrue(valor);
    }

    @Test
    @And("^Griezmann esta en un equipo$")
    public void Griezmann_esta_en_un_equipo() {
        boolean valor = gri.getEquipo() != null;
        assertTrue(valor);
    }

    @Test
    @Then("^el usuario no compra a Griezmann$")
    public void el_usuario_no_compra_a_Griezmann() {
        boolean valor = usuarioRicoVacio.fichar(gri);
        assertFalse(valor);
    }

    @Test
    @Given("^que el usuario tiene dinero para comprar a Cristiano Ronaldo$")
    public void que_el_usuario_tiene_dinero_para_comprar_a_Cristiano_Ronaldo(){
        boolean valor = usuarioRicoLleno.getDinero() >= cristiano.getPrecio();
        assertTrue(valor);
    }

    @Test
    @And("^que el usuario no tiene hueco para anadir ningun jugador mas$")
    public void que_el_usuario_no_tiene_hueco_para_anadir_ningun_jugador_mas(){
        boolean valor = usuarioRicoLleno.getEquipo().getJugadores().size() < EquipoMock.NUM_MAX_JUGADORES;
        assertFalse(valor);
    }

    @Test
    @And("^Cristiano Ronaldo este disponible para comprarlo$")
    public void Cristiano_Ronaldo_este_disponible_para_comprarlo(){
        boolean valor = cristiano.getEquipo() == null;
        assertTrue(valor);
    }

    @Test
    @Then("^el usuario no ficha a Cristiano Ronaldo$")
    public void el_usuario_no_ficha_a_Cristiano_Ronaldo() {
        boolean valor = usuarioRicoLleno.fichar(cristiano);
        assertFalse(valor);
    }

    @Test
    @Given("^que el usuario no tiene dinero$")
    public void que_el_usuario_no_tiene_dinero() {
        boolean valor = usuarioPobreVacio.getDinero() >= cristiano.getPrecio();
        assertFalse(valor);
    }

    @Test
    @And("^que Messi está libre en el mercado$")
    public void que_Messi_está_libre_en_el_mercado() {
        boolean valor = messi.getEquipo() == null;
        assertTrue(valor);
    }

    @Test
    @And("^el usuario tiene hueco para anadir un jugador mas$")
    public void el_usuario_tiene_hueco_para_anadir_un_jugador_mas() {
        boolean valor = usuarioPobreVacio.getEquipo().getJugadores().size() < EquipoMock.NUM_MAX_JUGADORES;
        assertTrue(valor);
    }

    @Test
    @Then("^el usuario no ficha a Messi$")
    public void el_usuario_no_ficha_a_Messi() {
        boolean valor = usuarioPobreVacio.fichar(messi);
        assertFalse(valor);
    }

    @Test
    @Given("^que el usuario tiene suficiente dinero para pagar poor Fernando Torres$")
    public void que_el_usuario_tiene_suficiente_dinero_para_pagar_poor_Fernando_Torres(){
        boolean valor = usuarioRicoVacio.getDinero() >= fernando.getPrecio();
        assertTrue(valor);
    }

    @Test
    @And("^que tiene suficiente espacio para el equipo de otro jugador de campo$")
    public void que_tiene_suficiente_espacio_para_el_equipo_de_otro_jugador_de_campo() {
        boolean valor = usuarioRicoVacio.getEquipo().getJugadores().size() < EquipoMock.NUM_MAX_JUGADORES;
        assertTrue(valor);
    }

    @Test
    @And("^no esta fichado por otro equipo$")
    public void no_esta_fichado_por_otro_equipo() {
        boolean valor = messi.getEquipo() == null;
        assertTrue(valor);
    }

    @Test
    @Then("^el usuario ficha a Fernando Torres$")
    public void el_usuario_ficha_a_Fernando_Torres() {
        boolean valor = usuarioRicoVacio.fichar(fernando);
        assertTrue(valor);
    }

}
