package com.pizzeria.hornito.entities;

import lombok.Data;

@Data
public class Pizzas {

	private int pizzaId;
	
	private String sabor;
	private String descripcion;
	private int size; // 1 personal, 2 grande, 3 familiar
	private double precio;
	private int activo;

}
