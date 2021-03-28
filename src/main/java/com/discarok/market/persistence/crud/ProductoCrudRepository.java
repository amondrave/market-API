package com.discarok.market.persistence.crud;

import com.discarok.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

}
