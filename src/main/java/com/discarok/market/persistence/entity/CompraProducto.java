package com.discarok.market.persistence.entity;



import javax.persistence.*;

@Entity
@Table(name = "compra_producto")
public class CompraProducto {

    @EmbeddedId
    private CompraProductoPk id;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    @Column(name = "total", nullable = false)
    private Double total;

    @Column(name = "estado")
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;

    public CompraProducto(){

    }

    public CompraProductoPk getId() {
        return id;
    }

    public void setId(CompraProductoPk id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
