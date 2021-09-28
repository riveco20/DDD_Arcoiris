package com.TiendaArcoiris.demo.domain.persona.events;

import co.com.sofka.domain.generic.DomainEvent;

public class InformacionAgregada extends DomainEvent {

    private final String nombre;
    private final String idCliente;
    private final String direccion;

    public InformacionAgregada(String nombre, String idCliente,String direccion){
        super("Agregando informacion del cliente");
        this.nombre=nombre;
        this.idCliente=idCliente;
        this.direccion=direccion;
            }

    public String getNombre() {
        return nombre;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getDireccion() {
        return direccion;
    }
}
