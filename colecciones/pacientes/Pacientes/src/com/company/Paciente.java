package com.company;

import com.company.Exceptions.ExceptionPaciente;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws ExceptionPaciente {
        Date hoy= new Date();
        this.nombre=nombre;
        this.apellido=apellido;
        fechaAlta=null;
        if (fechaInternacion.before(hoy)) {
            this.fechaInternacion = fechaInternacion;
        }
        else{
            throw new ExceptionPaciente("La fecha de internación es posterior al dia de hoy");
        }
    }

    public Date getFechaInternacion() {

        return fechaInternacion;
    }

    public Date getFechaAlta() {

        return fechaAlta;
    }
    public void darAlta(Date fechaAlta) throws ExceptionPaciente {
        if (fechaAlta.after(fechaInternacion))
            System.out.println("Ok");
        else {
            System.out.println("No se puede");
            throw new ExceptionPaciente("La fecha no puede ser mayor a la fecha de internacion");
        }
    }



}
