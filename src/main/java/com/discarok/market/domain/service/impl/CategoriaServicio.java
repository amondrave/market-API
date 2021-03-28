package com.discarok.market.domain.service.impl;

import com.discarok.market.domain.dto.CategoriaDto;
import com.discarok.market.domain.repository.CategoriaRepository;
import com.discarok.market.domain.service.interfaces.ServicioInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServicio implements ServicioInterfaz<CategoriaDto, Integer> {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<CategoriaDto> obtenerTodos() {
        return categoriaRepository.obtenerTodas();
    }

    @Override
    public CategoriaDto obtenerPorId(Integer integer) {
        return categoriaRepository.obtenerCategeoriaPorId(integer).get();
    }


    @Override
    public CategoriaDto guardar(CategoriaDto categoria) {
        CategoriaDto categoriaDto = categoriaRepository.guardar(categoria).get();
        return categoriaDto;
    }

    @Override
    public boolean eliminar(Integer integer) {
        if(obtenerPorId(integer) != null) {
            categoriaRepository.eliminar(integer);
            return true;
        }
        return false;
    }


}
