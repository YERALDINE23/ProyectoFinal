package com.example.fyeraldinegarcia.service;

import com.example.fyeraldinegarcia.dto.PizzaDTO;
import com.example.fyeraldinegarcia.model.Pizza;
import com.example.fyeraldinegarcia.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService {

    @Autowired
    private PizzaRepository repository;

    @Override
    public List<PizzaDTO> listar() {

        List<PizzaDTO> listadto = new ArrayList<>();
        PizzaDTO dto = null;

        for (Pizza pizza : repository.findAll()) {
            dto = new PizzaDTO();
            dto.setIdPizza(pizza.getIdPizza());
            dto.setNombrePizza(pizza.getNombrePizza());
            dto.setDescripcion(pizza.getDescripcion());
            listadto.add(dto);
        }


        return listadto;

    }

    @Override
    public PizzaDTO obtenerId(Integer id) {

        Pizza pizza = repository.findById(id).orElse(null);

        PizzaDTO dto = new PizzaDTO();
        dto.setIdPizza(pizza.getIdPizza());
        dto.setNombrePizza(pizza.getNombrePizza());
        dto.setDescripcion(pizza.getDescripcion());

        return dto;
    }

    @Override
    public void guardar(PizzaDTO pizza) {

        Pizza piz = new Pizza();
        piz.setIdPizza(pizza.getIdPizza());
        piz.setNombrePizza(pizza.getNombrePizza());
        piz.setDescripcion(pizza.getDescripcion());

        repository.save(piz);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void actualizar(PizzaDTO pizza) {

        Pizza pizz = new Pizza();
        pizz.setIdPizza(pizza.getIdPizza());
        pizz.setNombrePizza(pizza.getNombrePizza());
        pizz.setDescripcion(pizza.getDescripcion());

        repository.saveAndFlush(pizz);
    }
}
