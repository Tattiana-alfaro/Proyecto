package com.ucreativa.services;

import com.ucreativa.entities.Empleado;
import com.ucreativa.entities.Persona;
import com.ucreativa.repositories.Repository;

import java.util.Date;

public class BitacoraService {
    private Repository repository;

    public BitacoraService(Repository repository) {
        this.repository = repository;
    }

    public void save(String nombre, String cedula, double salario,
                     String accion, String descripcion) {
        Persona persona;

        persona = new Empleado(nombre, cedula, salario);
        this.repository.save(persona, new Date(),  accion, descripcion);
    }
}
