package com.carmelitascoffee.pojo;
// Generated 12-19-2019 08:34:19 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Contrato generated by hbm2java
 */
public class Contrato  implements java.io.Serializable {


     private Integer idContrato;
     private Empleado empleado;
     private String puesto;
     private BigDecimal sueldo;
     private BigDecimal comisiones;
     private Date fechaContratacion;
     private Date fechaExpiracion;
     private String estado;

    public Contrato() {
    }

	
    public Contrato(Empleado empleado, String puesto, Date fechaContratacion, String estado) {
        this.empleado = empleado;
        this.puesto = puesto;
        this.fechaContratacion = fechaContratacion;
        this.estado = estado;
    }
    public Contrato(Empleado empleado, String puesto, BigDecimal sueldo, BigDecimal comisiones, Date fechaContratacion, Date fechaExpiracion, String estado) {
       this.empleado = empleado;
       this.puesto = puesto;
       this.sueldo = sueldo;
       this.comisiones = comisiones;
       this.fechaContratacion = fechaContratacion;
       this.fechaExpiracion = fechaExpiracion;
       this.estado = estado;
    }
   
    public Integer getIdContrato() {
        return this.idContrato;
    }
    
    public void setIdContrato(Integer idContrato) {
        this.idContrato = idContrato;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public String getPuesto() {
        return this.puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public BigDecimal getSueldo() {
        return this.sueldo;
    }
    
    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }
    public BigDecimal getComisiones() {
        return this.comisiones;
    }
    
    public void setComisiones(BigDecimal comisiones) {
        this.comisiones = comisiones;
    }
    public Date getFechaContratacion() {
        return this.fechaContratacion;
    }
    
    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
    public Date getFechaExpiracion() {
        return this.fechaExpiracion;
    }
    
    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }




}


