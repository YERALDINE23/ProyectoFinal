package com.example.fyeraldinegarcia.service;

import com.example.fyeraldinegarcia.dto.PizzeriaDTO;

import java.util.List;

public interface PizzeriaService {

    List<PizzeriaDTO>listar();
    PizzeriaDTO obtenerId(Integer id);
    void guardar(PizzeriaDTO pizzeria);
    void eliminar(Integer id);
    void actualizar(PizzeriaDTO pizzeria);
}
