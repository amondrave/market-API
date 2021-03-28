package com.discarok.market.domain.dto;

public class CategoriaDto {

    private int categoriaId;

    private String categoria;

    private boolean disponible;

    public CategoriaDto() {
    }

    public CategoriaDto(int categoriaId, String categoria, boolean disponible) {
        this.categoriaId = categoriaId;
        this.categoria = categoria;
        this.disponible = disponible;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int idCategoria) {
        this.categoriaId = idCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
