package com.example.fyeraldinegarcia.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pizzas")
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPizza;
    private String nombrePizza;
    private String descripcion;
}
