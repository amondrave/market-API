package com.discarok.market.persistence.mapper;

import com.discarok.market.domain.dto.ProductoDto;
import com.discarok.market.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;



@Mapper(componentModel = "spring", uses ={CategoryMapper.class} )
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "idProducto", target = "productoId"),
            @Mapping(source = "nombre", target = "nombreProducto"),
            @Mapping(source = "categoria", target = "categoriaDto"),
            @Mapping(source = "codigoBarras", target = "qpr"),
            @Mapping(source = "precioVenta", target = "valorVenta"),
            @Mapping(source = "stock", target = "cantidad"),
            @Mapping(source = "estado", target = "disponible")
    })
    ProductoDto toProductoDto(Producto producto);
    List<ProductoDto> toProductoDtos(List<Producto> productos);

    @InheritInverseConfiguration
    Producto toProducto(ProductoDto productoDto);

}
