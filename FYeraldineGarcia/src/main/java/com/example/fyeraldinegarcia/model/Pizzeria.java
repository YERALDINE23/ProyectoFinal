package com.example.fyeraldinegarcia.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pizzerias")
public class Pizzeria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPizzeria;
    private String direccion;
    private String sede;
}
