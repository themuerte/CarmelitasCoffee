package com.carmelitascoffee.pojo;
// Generated 08-28-2019 08:03:01 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * DetalleOrdenServicio generated by hbm2java
 */
public class DetalleOrdenServicio  implements java.io.Serializable {


     private Integer idDetalleOrdenServicio;
     private Orden orden;
     private Servicio servicio;
     private BigDecimal precio;
     private Integer cantidad;
     private BigDecimal descuento;

    public DetalleOrdenServicio() {
    }

	
    public DetalleOrdenServicio(Orden orden, Servicio servicio) {
        this.orden = orden;
        this.servicio = servicio;
    }
    public DetalleOrdenServicio(Orden orden, Servicio servicio, BigDecimal precio, Integer cantidad, BigDecimal descuento) {
       this.orden = orden;
       this.servicio = servicio;
       this.precio = precio;
       this.cantidad = cantidad;
       this.descuento = descuento;
    }
   
    public Integer getIdDetalleOrdenServicio() {
        return this.idDetalleOrdenServicio;
    }
    
    public void setIdDetalleOrdenServicio(Integer idDetalleOrdenServicio) {
        this.idDetalleOrdenServicio = idDetalleOrdenServicio;
    }
    public Orden getOrden() {
        return this.orden;
    }
    
    public void setOrden(Orden orden) {
        this.orden = orden;
    }
    public Servicio getServicio() {
        return this.servicio;
    }
    
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
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


