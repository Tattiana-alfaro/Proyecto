package com.ucreativa.services;

import com.ucreativa.entities.Empleado;
import com.ucreativa.entities.Persona;
import com.ucreativa.repositories.Repository;
import com.ucreativa.ui.ErrorSalarioException;

import java.util.Date;
import java.util.List;

public class BitacoraService {
    private Repository repository;

    public BitacoraService(Repository repository) {
        this.repository = repository;
    }

    public void save(String nombre, String cedula, String txtSalario,
                     String accion, String descripcion) throws ErrorSalarioException {
        double salario;
        try {
            salario = Double.parseDouble(txtSalario);
        }catch (NumberFormatException x) {
            throw new ErrorSalarioException(txtSalario);

        }
            Persona persona;

            persona = new Empleado(nombre, cedula, salario);
            this.repository.save((Empleado) persona, new Date(), accion, descripcion);

    }

    public List<String> get(){
        return this.repository.get();
    }
}
