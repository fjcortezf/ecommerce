package com.pizzeria.hornito.entities;

import java.util.Date;

import lombok.Data;

@Data
public class Roles {

	private int rolId;
	
	private String descripcion;
	private Date fecCreacion;
	private int activo;

}
