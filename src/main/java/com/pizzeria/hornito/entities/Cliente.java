package com.pizzeria.hornito.entities;

import java.util.Date;

import lombok.Data;

@Data
public class Cliente {

	private Long clienteId;
	
	private String nombres;
	private String apellidos;
	private String telefono;
	private String email;
	private int tipdocId;
	private String nroDocumento;
	private Date fecNacimiento;
	private Date fecCreacion;
	private String direccion;
	private String referencia;
	private int activo;

}
