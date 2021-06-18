package com.ucreativa.entities;

import java.util.Date;

public class BitacoraEmpleado {
    private Persona persona;
    private Date fecha;
    private String accion;
    private String descripcion;

    public BitacoraEmpleado(Persona persona, Date fecha, String accion, String descripcion) {
        this.persona = persona;
        this.fecha = fecha;
        this.accion = accion;
        this.descripcion = descripcion;
    }

    public Persona getPersona() {
        return persona;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}
