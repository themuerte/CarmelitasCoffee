package com.carmelitascoffee.pojo;
// Generated 12-19-2019 08:34:19 PM by Hibernate Tools 4.3.1

import java.math.BigDecimal;

/**
 * DetalleOrdenProducto generated by hbm2java
 */
public class DetalleOrdenProducto implements java.io.Serializable {

    private Integer idDetalleOrdenProducto;
    private Orden orden;
    private Producto producto;
    private int cantidad;
    private BigDecimal precioUnit;
    private BigDecimal descuento;

    public DetalleOrdenProducto() {
    }

    public DetalleOrdenProducto(Orden orden, Producto producto, int cantidad, BigDecimal precioUnit) {
        this.orden = orden;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnit = precioUnit;
    }

    public DetalleOrdenProducto(Orden orden, Producto producto, int cantidad, BigDecimal precioUnit, BigDecimal descuento) {
        this.orden = orden;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnit = precioUnit;
        this.descuento = descuento;
    }

    public DetalleOrdenProducto(Orden o, Producto producto) {
        this.orden = o;
        this.producto = producto;
    }

    public Integer getIdDetalleOrdenProducto() {
        return this.idDetalleOrdenProducto;
    }

    public void setIdDetalleOrdenProducto(Integer idDetalleOrdenProducto) {
        this.idDetalleOrdenProducto = idDetalleOrdenProducto;
    }

    public Orden getOrden() {
        return this.orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioUnit() {
        return this.precioUnit;
    }

    public void setPrecioUnit(BigDecimal precioUnit) {
        this.precioUnit = precioUnit;
    }

    public BigDecimal getDescuento() {
        return this.descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

}
