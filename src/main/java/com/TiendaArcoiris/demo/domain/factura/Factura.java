package com.TiendaArcoiris.demo.domain.factura;

import co.com.sofka.domain.generic.AggregateEvent;
import com.TiendaArcoiris.demo.domain.factura.value.IdFactura;

public class Factura extends AggregateEvent<IdFactura> {
    public Factura(IdFactura entityId) {
        super(entityId);
    }
}
