package com.TiendaArcoiris.demo.domain.persona.events;

import co.com.sofka.domain.generic.DomainEvent;

public class CompraRealizada extends DomainEvent {

    public CompraRealizada(String type) {
        super("Compra Realizada");
    }
}
