package com.example.fyeraldinegarcia.service;

import com.example.fyeraldinegarcia.dto.PizzaDTO;

import java.util.List;

public interface PizzaService {

    List<PizzaDTO>listar();
    PizzaDTO obtenerId(Integer id);
    void guardar(PizzaDTO pizza);
    void eliminar(Integer id);
    void actualizar(PizzaDTO pizza);
}
