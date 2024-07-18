package com.main.trycatch;

import java.util.InputMismatchException;

public class ExceptionDado extends InputMismatchException  {
    // Construtor que aceita uma mensagem de erro
    public ExceptionDado(String message) {
        super(message);
    }
    
    // Construtor que aceita uma causa (outra exceção)
   
}
