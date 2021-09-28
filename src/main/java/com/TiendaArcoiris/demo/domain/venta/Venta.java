package com.TiendaArcoiris.demo.domain.venta;

import co.com.sofka.domain.generic.AggregateEvent;
import com.TiendaArcoiris.demo.domain.venta.value.IdVenta;

public class Venta extends AggregateEvent<IdVenta> {
    public Venta(IdVenta entityId) {
        super(entityId);
    }
}
