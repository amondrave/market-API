package com.discarok.market.web.controller;

import com.discarok.market.domain.dto.CategoriaDto;
import com.discarok.market.domain.service.impl.CategoriaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaControlador {

    @Autowired
    private CategoriaServicio servicio;

    @GetMapping
    public List<CategoriaDto> obtenerTodos(){
        return servicio.obtenerTodos();
    }
    @GetMapping("{id}")
    public CategoriaDto obtenercategoria(@PathVariable  int id){
        return servicio.obtenerPorId(id);
    }

    @PostMapping
    public CategoriaDto guardar(@RequestBody CategoriaDto categoriaDto){
        return servicio.guardar(categoriaDto);
    }

    @DeleteMapping("{id}")
    public boolean eliminar(@PathVariable int id){
        return servicio.eliminar(id);
    }

}
