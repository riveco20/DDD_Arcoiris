package com.TiendaArcoiris.demo.domain.persona;

import co.com.sofka.domain.generic.AggregateEvent;
import com.TiendaArcoiris.demo.domain.persona.entity.Cliente;
import com.TiendaArcoiris.demo.domain.persona.entity.Empleado;
import com.TiendaArcoiris.demo.domain.persona.value.IdPersona;
import com.TiendaArcoiris.demo.domain.persona.value.Nombre;


public class Persona extends AggregateEvent<IdPersona> {

    protected Empleado empleado;
    protected Cliente cliente;

    public Persona(IdPersona entityId) {

        super(entityId);
    }
}
