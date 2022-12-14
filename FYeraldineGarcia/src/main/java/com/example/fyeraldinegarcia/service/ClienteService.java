package com.example.fyeraldinegarcia.service;

import com.example.fyeraldinegarcia.dto.ClienteDTO;

import java.util.List;

public interface ClienteService {

    List<ClienteDTO>listar();
    ClienteDTO obtenerId(Integer id);
    void guardar(ClienteDTO cliente);
    void eliminar(Integer id);
    void actualizar(ClienteDTO cliente);
}
