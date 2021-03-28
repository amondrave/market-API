package com.discarok.market.domain.repository;

import com.discarok.market.domain.dto.CategoriaDto;
import com.discarok.market.persistence.crud.CategoriaCrudRepository;
import com.discarok.market.persistence.entity.Categoria;
import com.discarok.market.persistence.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoriaRepository {
    @Autowired
    private CategoriaCrudRepository repositorio;

    @Autowired
    private CategoryMapper mapeador;

    public List<CategoriaDto> obtenerTodas(){
        List<Categoria> categorias = (List<Categoria>) repositorio.findAll();
        return  mapeador.toCategoriaDtos(categorias);
    }

    public Optional<CategoriaDto> obtenerCategeoriaPorId(int id){
        Optional<Categoria> categoria = repositorio.findById(id);
        return Optional.of(mapeador.toCategoriaDto(categoria.get()));
    }

    public Optional<CategoriaDto> guardar(CategoriaDto categoriaDto){
        Categoria categoria = mapeador.toCategoria(categoriaDto);
        return Optional.of(mapeador.toCategoriaDto(repositorio.save(categoria)));
    }

    public void eliminar(int id){
        repositorio.deleteById(id);
    }

    public List<CategoriaDto> categoriasDisponibles(){
        List<Categoria> categorias = (List<Categoria>) repositorio.findAll();
        List<CategoriaDto> categoriaDtos = mapeador.toCategoriaDtos(categorias);
        return (List<CategoriaDto>) categoriaDtos.stream().filter(categoriaDto -> categoriaDto.isDisponible() == true);
    }

}
