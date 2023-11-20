package com.pizzeria.hornito.entities;

import lombok.Data;

@Data
public class DetallePedidos {

	private Integer detallepedidoId;
	
	private Integer pedidoId;
	private int pizzaId;
	private int cantidad;
	private double precio;
	private double descuento;
	private double subtotal;
	private int activo;

}
