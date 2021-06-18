package com.ucreativa.repositories;

import com.ucreativa.entities.Empleado;
import com.ucreativa.entities.Persona;

import java.util.Date;
import java.util.List;

public interface Repository {
    void save(Empleado persona, Date fecha, String accion, String descripcion);
    List<String> get();
}
