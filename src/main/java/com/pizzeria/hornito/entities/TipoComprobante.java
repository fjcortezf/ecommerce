package com.pizzeria.hornito.entities;

import lombok.Data;

@Data
public class TipoComprobante {

	private int tipocompId;
	
	private String descripcion;
	private int activo;

}
