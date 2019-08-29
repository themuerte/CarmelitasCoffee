package com.carmelitascoffee.pojo;
// Generated 08-28-2019 08:03:01 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * DetalleOrdenProducto generated by hbm2java
 */
public class DetalleOrdenProducto  implements java.io.Serializable {


     private Integer idDetalleOrdenProducto;
     private Orden orden;
     private Producto producto;
     private BigDecimal precio;
     private Integer cantidad;
     private BigDecimal descuento;

    public DetalleOrdenProducto() {
    }

	
    public DetalleOrdenProducto(Orden orden, Producto producto) {
        this.orden = orden;
        this.producto = producto;
    }
    public DetalleOrdenProducto(Orden orden, Producto producto, BigDecimal precio, Integer cantidad, BigDecimal descuento) {
       this.orden = orden;
       this.producto = producto;
       this.precio = precio;
       this.cantidad = cantidad;
       this.descuento = descuento;
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
    public BigDecimal getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public BigDecimal getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }




}


