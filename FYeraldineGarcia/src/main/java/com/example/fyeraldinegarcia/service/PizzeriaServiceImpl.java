package com.example.fyeraldinegarcia.service;

import com.example.fyeraldinegarcia.dto.PizzeriaDTO;
import com.example.fyeraldinegarcia.model.Pizzeria;
import com.example.fyeraldinegarcia.repository.PizzeriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PizzeriaServiceImpl implements PizzeriaService {

    @Autowired
    private PizzeriaRepository repository;

    @Override
    public List<PizzeriaDTO> listar() {

        List<PizzeriaDTO> listadto = new ArrayList<>();
        PizzeriaDTO dto = null;

        for (Pizzeria pizzeria : repository.findAll()) {
            dto = new PizzeriaDTO();
            dto.setIdPizzeria(pizzeria.getIdPizzeria());
            dto.setDireccion(pizzeria.getDireccion());
            dto.setSede(pizzeria.getSede());
            listadto.add(dto);
        }
        return listadto;
    }

    @Override
    public PizzeriaDTO obtenerId(Integer id) {

        Pizzeria pizzeria = repository.findById(id).orElse(null);

        PizzeriaDTO dto = new PizzeriaDTO();
        dto.setIdPizzeria(pizzeria.getIdPizzeria());
        dto.setDireccion(pizzeria.getDireccion());
        dto.setSede(pizzeria.getSede());

        return dto;
    }

    @Override
    public void guardar(PizzeriaDTO pizzeria) {

        Pizzeria pizze = new Pizzeria();
        pizze.setIdPizzeria(pizzeria.getIdPizzeria());
        pizze.setDireccion(pizzeria.getDireccion());
        pizze.setSede(pizzeria.getSede());

        repository.save(pizze);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void actualizar(PizzeriaDTO pizzeria) {

        Pizzeria pizzeria1 = new Pizzeria();
        pizzeria1.setIdPizzeria(pizzeria.getIdPizzeria());
        pizzeria1.setDireccion(pizzeria.getDireccion());
        pizzeria1.setSede(pizzeria.getSede());

        repository.saveAndFlush(pizzeria1);
    }
}
