package com.discarok.market.persistence.crud;

import com.discarok.market.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteCrudRepository extends CrudRepository<Cliente, String> {
}
