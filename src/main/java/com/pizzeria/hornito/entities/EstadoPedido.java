package com.pizzeria.hornito.entities;

import lombok.Data;

@Data
public class EstadoPedido {

	private int estadoId;
	
	private String descripcion;
	private int activo;

}
