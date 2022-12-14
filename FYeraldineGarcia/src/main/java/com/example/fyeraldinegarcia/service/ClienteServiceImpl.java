package com.example.fyeraldinegarcia.service;

import com.example.fyeraldinegarcia.dto.ClienteDTO;
import com.example.fyeraldinegarcia.model.Cliente;
import com.example.fyeraldinegarcia.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Override
    public List<ClienteDTO> listar() {

        List<ClienteDTO> listadto = new ArrayList<>();
        ClienteDTO dto = null;

        for (Cliente cliente : repository.findAll()) {
            dto = new ClienteDTO();
            dto.setIdCliente(cliente.getIdCliente());
            dto.setNombreCliente(cliente.getNombreCliente());
            dto.setApellidoCliente(cliente.getApellidoCliente());
            dto.setNroCelular(cliente.getNroCelular());
            dto.setDireccion(cliente.getDireccion());
            listadto.add(dto);
        }

        return listadto;
    }

    @Override
    public ClienteDTO obtenerId(Integer id) {

        Cliente cliente = repository.findById(id).orElse(null);

        ClienteDTO dto = new ClienteDTO();
        dto.setIdCliente(cliente.getIdCliente());
        dto.setNombreCliente(cliente.getNombreCliente());
        dto.setApellidoCliente(cliente.getApellidoCliente());
        dto.setNroCelular(cliente.getNroCelular());
        dto.setDireccion(cliente.getDireccion());
        return dto;
    }

    @Override
    public void guardar(ClienteDTO cliente) {

        Cliente cli = new Cliente();
        cli.setIdCliente(cliente.getIdCliente());
        cli.setNombreCliente(cliente.getNombreCliente());
        cli.setApellidoCliente(cliente.getApellidoCliente());
        cli.setNroCelular(cliente.getNroCelular());
        cli.setDireccion(cliente.getDireccion());

        repository.save(cli);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void actualizar(ClienteDTO cliente) {

        Cliente cli = new Cliente();
        cli.setIdCliente(cliente.getIdCliente());
        cli.setNombreCliente(cliente.getNombreCliente());
        cli.setApellidoCliente(cliente.getApellidoCliente());
        cli.setNroCelular(cliente.getNroCelular());
        cli.setDireccion(cliente.getDireccion());

        repository.saveAndFlush(cli);
    }
}
