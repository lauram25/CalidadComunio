Feature: Como usuario me gustaría fichar jugadores para mi plantilla.
   Debo tener tanto dinero como valga el jugador
   Debo tener espacio en mi plantilla

  Scenario: Fichando a Griezmann
    Given que el usuario tiene dinero para comprar a Griezmann
    And que el usuario tiene hueco para annadir a Griezmann
    And Griezmann esta en un equipo
    Then el usuario no compra a Griezmann

  Scenario: Fichando a Cristiano Ronaldo
    Given que el usuario tiene dinero para comprar a Cristiano Ronaldo
    And que el usuario no tiene hueco para anadir ningun jugador mas
    And Cristiano Ronaldo este disponible para comprarlo
    Then el usuario no ficha a Cristiano Ronaldo

  Scenario: Fichando a Messi
    Given que el usuario no tiene dinero
    And que Messi está libre en el mercado
    And el usuario tiene hueco para anadir un jugador mas
    Then el usuario no ficha a Messi

 Scenario: Fichando a Fernando Torres
    Given que el usuario tiene suficiente dinero para pagar poor Fernando Torres
    And que tiene suficiente espacio para el equipo de otro jugador de campo
    And no esta fichado por otro equipo
    Then el usuario ficha a Fernando Torres
