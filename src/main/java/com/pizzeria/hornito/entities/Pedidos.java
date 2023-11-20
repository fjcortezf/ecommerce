package com.pizzeria.hornito.entities;

import java.util.Date;

import lombok.Data;

@Data
public class Pedidos {

	private Integer pedidoId;
	
	private int userId;
	private int clienteId;
	private Date fecPedido;
	private int estadoId;
	private int activo;

}
