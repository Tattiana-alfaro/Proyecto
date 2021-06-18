package com.ucreativa.entities;

public class Empleado extends Persona{

    private double salario;


    public Empleado(String nombre, String cedula) {
        super(nombre, cedula);
        this.salario = 0;
    }

    public Empleado(String nombre, String cedula, double salario) {
        super(nombre, cedula);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
