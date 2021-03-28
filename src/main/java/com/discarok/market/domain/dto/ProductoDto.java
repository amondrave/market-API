package com.discarok.market.domain.dto;

public class ProductoDto {

    private  int productoId;

    private String nombreProducto;

    private CategoriaDto categoriaDto;

    private String qpr;

    private double valorVenta;

    private int cantidad;

    private boolean disponible;

    public ProductoDto(){
    }

    public ProductoDto(int productoId, String nombreProducto, CategoriaDto categoriaDto, String qpr, double valorVenta, int cantidad, boolean disponible) {
        this.productoId = productoId;
        this.nombreProducto = nombreProducto;
        this.categoriaDto = categoriaDto;
        this.qpr = qpr;
        this.valorVenta = valorVenta;
        this.cantidad = cantidad;
        this.disponible = disponible;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public CategoriaDto getCategoriaDto() {
        return categoriaDto;
    }

    public void setCategoriaDto(CategoriaDto categoriaDto) {
        this.categoriaDto = categoriaDto;
    }

    public String getQpr() {
        return qpr;
    }

    public void setQpr(String qpr) {
        this.qpr = qpr;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
