package com.TiendaArcoiris.demo.domain.persona.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.TiendaArcoiris.demo.domain.persona.entity.Empleado;

public class AgregarEmpleado extends DomainEvent {
    private final Empleado empleado;

    public AgregarEmpleado(Empleado empleado) {
        super("Persona Agregada");
        this.empleado = empleado;

    }

    public Empleado getEmpleado() {
        return empleado;
    }
}
