package com.TiendaArcoiris.demo.domain.persona.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.TiendaArcoiris.demo.domain.persona.entity.Cliente;

public class AgregarCliente extends DomainEvent {
    private final Cliente cliente;

    public AgregarCliente(Cliente cliente) {
        super("Persona Agregada");
        this.cliente = cliente;

    }

    public Cliente getCliente() {
        return cliente;
    }
}