package com.TiendaArcoiris.demo.domain.persona.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.TiendaArcoiris.demo.domain.persona.entity.Cliente;
import com.TiendaArcoiris.demo.domain.persona.entity.Empleado;

public class ActualizarCliente extends DomainEvent {
    private final Cliente cliente;

    public ActualizarCliente(Cliente cliente) {
        super("Persona Agregada");
        this.cliente = cliente;

    }

    public Cliente getCliente() {
        return cliente;
    }
}