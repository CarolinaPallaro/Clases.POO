package com.company;

import com.company.Exceptions.ExceptionPaciente;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        try {
            Paciente paciente=new Paciente("Juan","Perez","12345",new Date(2023,10,10));
        } catch (ExceptionPaciente e) {
            e.printStackTrace();
        }
        try {
            Paciente paciente2=new Paciente("Camilo","Ramirez","54321",new Date(10,8,10));
            paciente2.darAlta(new Date(9,8,10));
        } catch (ExceptionPaciente e) {
            e.printStackTrace();// esto es culpa de Clara D:
        }
    }
}
