package com.example.fyeraldinegarcia.controller;

import com.example.fyeraldinegarcia.dto.PizzaDTO;
import com.example.fyeraldinegarcia.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/pizzas/v1")
public class PizzaController {

    @Autowired
    private PizzaService service;

    @GetMapping("/listar")
    public @ResponseBody List<PizzaDTO> listar(){
        return service.listar();
    }

    @GetMapping("/listar/{id}")
    public @ResponseBody PizzaDTO obtenerId(@PathVariable Integer id){
        return  service.obtenerId(id);
    }

    @PostMapping("/guardar")
    public @ResponseBody void guardar(@RequestBody PizzaDTO dto){
        service.guardar(dto);
    }

    @PutMapping("/actualizar")
    public @ResponseBody void actualizar (@RequestBody PizzaDTO dto){
        service.actualizar(dto);
    }

    @DeleteMapping("/eliminar/{id}")
    public @ResponseBody void eliminar(@PathVariable Integer id){
        service.eliminar(id);
    }

}
