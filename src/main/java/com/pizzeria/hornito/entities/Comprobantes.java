package com.pizzeria.hornito.entities;

import lombok.Data;

@Data
public class Comprobantes {

	private Integer comprobanteId;
	
	private Integer pedidoId;
	private int tipocompId;
	private String nrocomprobante;
	private int tipopagoId;
	private int activo;

}
