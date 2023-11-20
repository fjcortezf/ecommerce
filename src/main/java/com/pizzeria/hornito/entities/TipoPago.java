package com.pizzeria.hornito.entities;

import lombok.Data;

@Data
public class TipoPago {

	private int tipopagoId;
	
	private String descripcion;
	private int activo;

}
