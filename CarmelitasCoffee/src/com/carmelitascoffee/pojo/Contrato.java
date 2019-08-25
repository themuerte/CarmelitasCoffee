package com.carmelitascoffee.pojo;
// Generated 08-05-2019 01:35:41 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Contrato generated by hbm2java
 */
public class Contrato  implements java.io.Serializable {


     private int idContrato;
     private Empleado empleado;
     private String puesto;
     private BigDecimal sueldo;
     private BigDecimal comisiones;
     private Date fechaContratacion;
     private String estado;

    public Contrato() {
    }

	
    public Contrato(int idContrato, Empleado empleado) {
        this.idContrato = idContrato;
        this.empleado = empleado;
    }
    public Contrato(int idContrato, Empleado empleado, String puesto, BigDecimal sueldo, BigDecimal comisiones, Date fechaContratacion, String estado) {
       this.idContrato = idContrato;
       this.empleado = empleado;
       this.puesto = puesto;
       this.sueldo = sueldo;
       this.comisiones = comisiones;
       this.fechaContratacion = fechaContratacion;
       this.estado = estado;
    }
   
    public int getIdContrato() {
        return this.idContrato;
    }
    
    public void setIdContrato(int idContrato) {
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
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }




}


