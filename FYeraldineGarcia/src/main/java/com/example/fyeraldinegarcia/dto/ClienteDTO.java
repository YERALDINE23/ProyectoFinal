package com.example.fyeraldinegarcia.dto;

import lombok.Data;

@Data
public class ClienteDTO {

	private Integer idCliente;
	private String nombreCliente;
	private String apellidoCliente;
	private String nroCelular;

	private String direccion;
}
