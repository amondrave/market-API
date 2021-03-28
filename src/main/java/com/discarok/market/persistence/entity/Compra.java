package com.discarok.market.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "compra")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idCompra;

    @ManyToOne
    @JoinColumn(name = "cliente")
    private Cliente cliente;

    @Column(name = "fecha")
    private LocalDateTime fecha;

    @Column(name = "medio_pago", length = 1)
    private String medioPago;

    @Column(name = "comentario", length = 250)
    private String comentario;

    @Column(name = "estado")
    private Boolean estado;


    public Compra() {
    }

    public Compra(Cliente cliente, LocalDateTime fecha, String medioPago, String comentario, Boolean estado) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.medioPago = medioPago;
        this.comentario = comentario;
        this.estado = estado;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
