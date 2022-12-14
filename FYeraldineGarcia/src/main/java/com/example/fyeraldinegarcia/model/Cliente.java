package com.example.fyeraldinegarcia.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String nroCelular;

    private String direccion;

}
