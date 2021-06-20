package com.ucreativa.ui;

public class ErrorSalarioException extends Exception{
    public ErrorSalarioException(String salario) {
        super("El salario ingresado es incorrecto: " + salario);
    }
}
