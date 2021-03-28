package com.discarok.market.persistence.mapper;

import com.discarok.market.domain.dto.CategoriaDto;
import com.discarok.market.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoriaId"),
            @Mapping(source = "descripcion", target = "categoria"),
            @Mapping(source = "estado", target = "disponible")
    })
    CategoriaDto toCategoriaDto(Categoria categoria);
    List<CategoriaDto> toCategoriaDtos(List<Categoria> categorias);


    @InheritInverseConfiguration
    Categoria toCategoria(CategoriaDto categoriaDto);
}
