package com.example.fyeraldinegarcia.controller;

import com.example.fyeraldinegarcia.dto.PizzeriaDTO;
import com.example.fyeraldinegarcia.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/pizzerias/v1")
public class PizzeriaController {

    @Autowired
    private PizzeriaService service;

    @GetMapping("/listar")
    public @ResponseBody List<PizzeriaDTO> listar(){
        return service.listar();
    }

    @GetMapping("/listar/{id}")
    public @ResponseBody PizzeriaDTO obtenerId(@PathVariable Integer id){
        return  service.obtenerId(id);
    }

    @PostMapping("/guardar")
    public @ResponseBody void guardar(@RequestBody PizzeriaDTO dto){
        service.guardar(dto);
    }

    @PutMapping("/actualizar")
    public @ResponseBody void actualizar (@RequestBody PizzeriaDTO dto){
        service.actualizar(dto);
    }

    @DeleteMapping("/eliminar/{id}")
    public @ResponseBody void eliminar(@PathVariable Integer id){
        service.eliminar(id);
    }

}
