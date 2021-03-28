package com.discarok.market.domain.service.interfaces;

import java.util.List;

public interface ServicioInterfaz <T,Id> {

    public List<T> obtenerTodos();

    public T obtenerPorId(Id id);

    public T guardar(T t);

    public boolean eliminar(Id id);


}
