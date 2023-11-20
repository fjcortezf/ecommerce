package com.pizzeria.hornito.entities;

import java.util.Date;

import lombok.Data;

@Data
public class Usuario {
	
	
	private Integer userId;
	
	private String nombres;
	private String apellidos;
	private String codigo;
	private String clave;
	private String telefono;
	private String email;
	private int tipdocId;
	private String nroDocumento;
	private Date fecNacimiento;
	private Date fecCreacion;
	private int rolId;
	private int activo;
	
	
}
