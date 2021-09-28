package com.TiendaArcoiris.demo.domain.persona.events;

import co.com.sofka.domain.generic.DomainEvent;

public class ProductoRastreado extends DomainEvent {
    public ProductoRastreado(String type) {
        super(type);
    }
}
